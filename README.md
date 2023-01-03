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