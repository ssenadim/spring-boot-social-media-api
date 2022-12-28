# spring-boot-social-media-api

Rest Api Postman
Collection https://github.com/ssenadim/spring-boot-social-media-api/blob/main/Social-Media-Api.postman_collection.json
---
#Readme Note 1
Swagger UI      : http://localhost:1903/swagger-ui.html
Open API Spec   : http://localhost:1903/v3/api-docs

<dependency>
    <groupId>org.springdoc</groupId>
    <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
    <version>2.0.2</version>
</dependency>

---
#Readme Note 2
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