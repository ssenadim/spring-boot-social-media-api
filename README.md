# spring-boot-social-media-api
---
Rest Api Postman Collection 
https://github.com/ssenadim/spring-boot-social-media-api/blob/main/Social-Media-Api.postman_collection.json

---
# Readme Note 1
Swagger UI      : http://localhost:1903/swagger-ui.html
Open API Spec   : http://localhost:1903/v3/api-docs

    <dependency>
        <groupId>org.springdoc</groupId>
        <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
        <version>2.0.2</version>
    </dependency>

---
# Readme Note 2
Different Representations are possible
Example: Different Content Type - XML or JSON or ...
Example: Different Language - English or Dutch or ...

Content Negotiation
Example: Accept header (MIME types - application/xml, application/json ...)
Example: Accept-Language header (en,nl,fr, ...)

    <dependency>
        <groupId>com.fasterxml.jackson.dataformat</groupId>
        <artifactId>jackson-dataformat-xml</artifactId>
    </dependency>

---

# Readme Note 3
Versioning

More About Versioning

https://www.mnot.net/blog/2011/10/25/web_api_versioning_smackdown
http://urthen.github.io/2013/05/09/ways-to-version-your-api/
http://stackoverflow.com/questions/389169/best-practices-for-api-versioning
http://www.lexicalscope.com/blog/2012/03/12/how-are-rest-apis-versioned/
https://www.3scale.net/2016/06/api-versioning-methods-a-brief-reference/

-URI Versioning - Twitter
Example: http://localhost:1903/v1/person

-Request Parameter versioning - Amazon
Example: http://localhost:1903/person?version=1

-(Custom) Headers Versioning - Microsoft
Example: SAME-URL headers=[X-API-VERSION=1]

-Media type versioning (a.k.a "content negotiation" or "accept header") - GitHub
Example: SAME-URL produces=application/vnd.company.app-v1+json

Summary: No Perfect Solution

Recommendations
-Think about versioning even before you need it!
-One Enterprise - One Versioning Approach

---

# Readme Note 4
HATEOAS (Hypermedia as the Engine of Application State)
    
    http://localhost:1903/usersWithHateoas/1

    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-hateoas</artifactId>
    </dependency>

    {
        "id": 1,
        "name": "Michael",
        "surname": "Jordan",
        "country": "USA",
        "membershipDate": "2022-01-03",
        "birthDate": "1988-01-03",
        "_links": {
            "all-users": {
                "href": "http://localhost:1903/users"
            }
        }
    }

---

# Readme Note 5
Customizing REST API Responses - Filtering and more...

Serialization: Most popular JSOn Serialization in Java -> Jackson

1. Customize field names in response
   `@JsonProperty("user_name")`

2. Return only selected fields
Filtering-> Filter out Passwords
Two types
Static Filtering: Same filtering for a ben across different REST API
    `@JsonIgnoreProperties, @JsonIgnore`
Dynamic Filtering: Customize filtering for a bean for specific REST API
    `@JsonFilter with FilterProvider @JsonFilter("SomeBeanFilter")`


---

# Readme Note 6
Monitoring APIs with Spring Boot Actuator
Exploring APIs with Spring Boot HAL Explorer

Actuator and HAL Browser Pom XML

        <dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-actuator</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.data</groupId>
			<artifactId>spring-data-rest-hal-explorer</artifactId>
		</dependency>

/src/main/resources/application.properties Modified
For actuator
management.endpoints.web.exposure.include=*


