package com.adaniak.socialmedia.api.user;

import com.adaniak.socialmedia.api.exception.UserNotFoundException;
import jakarta.validation.Valid;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;

import java.net.URI;
import java.util.List;
import java.util.Locale;

@RestController
public class UserResource {
    private MessageSource messageSource;
    private UserDaoService service;

    public UserResource(UserDaoService service, MessageSource messageSource) {
        this.service = service;
        this.messageSource = messageSource;
    }

    @GetMapping("/welcome/{id}")
    public String welcomeMessageForUser(@PathVariable int id) {
        User user = service.findById(id);
        if (user == null)
            throw new UserNotFoundException("id:" + id);
        Locale locale = LocaleContextHolder.getLocale();
        return messageSource.getMessage("welcome.message", null, "Welcome", locale) + " " + user.getName();
    }

    @GetMapping("/users")
    public List<User> retrieveAllUsers() {
        return service.findAll();
    }

    @GetMapping("/users/{id}")
    public User retrieveUser(@PathVariable int id) {
        User user = service.findById(id);
        if (user == null)
            throw new UserNotFoundException("id:" + id);
        return user;
    }
    @GetMapping("/usersWithHateoas/{id}")
    public EntityModel<User> retrieveUserWithHateoas(@PathVariable int id) {
        User user = service.findById(id);
        if (user == null)
            throw new UserNotFoundException("id:" + id);
        EntityModel<User> entityModel = EntityModel.of(user);

        WebMvcLinkBuilder link =  linkTo(methodOn(this.getClass()).retrieveAllUsers());
        entityModel.add(link.withRel("all-users"));

        return entityModel;
    }
    @PostMapping("/users")
    public ResponseEntity<User> createUser(@Valid @RequestBody User user) {
        User savedUser = service.save(user);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable int id) {
        service.deleteById(id);
    }
}
