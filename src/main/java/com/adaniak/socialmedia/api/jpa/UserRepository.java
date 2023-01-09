package com.adaniak.socialmedia.api.jpa;

import com.adaniak.socialmedia.api.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
