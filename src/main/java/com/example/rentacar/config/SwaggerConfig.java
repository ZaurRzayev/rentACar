//package com.example.demo.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.Contact;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//import java.util.Collections;
//
//@Configuration
//@EnableSwagger2
//public class SwaggerConfig {
//
//    private static final String TITLE = "Api Documentation";
//    private static final String DESCRIPTION = "Api Documentation";
//    private static final String VERSION = "2.0";
//    private static final String LICENSE = "Apache License Version 2.0";
//    private static final String LICENSE_URL = "http://www.apache.org/licenses/LICENSE-2.0";
//
////    @Bean
////    public Docket productApi() {
////        return new Docket(DocumentationType.SWAGGER_2)
////                .select()
////                .apis(RequestHandlerSelectors.basePackage("com.example.demo"))
////                .build()
////                .apiInfo(metaData());
////    }
//
//    @Bean
//    public Docket api() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(apiInfo())
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.example.demo"))
//                //.paths(PathSelectors.any())
//                .build();
//    }
//
//    private ApiInfo apiInfo() {
//        return new ApiInfo(
//                "My REST API",
//                "Some custom description of API.",
//                "1.0",
//                "Terms of service",
//                new Contact(".", ".", "."),
//                "License of API",
//                "API license URL",
//                Collections.emptyList());
//    }
//
//    private ApiInfo metaData() {
//        return new ApiInfoBuilder()
//                .title(TITLE)
//                .description(DESCRIPTION)
//                .version(VERSION)
//                .license(LICENSE)
//                .licenseUrl(LICENSE_URL)
//                .build();
//    }
//
////    private ApiKey apiKey() {
////        return new ApiKey("JWT", "Authorization", "header");
////    }
////
////    private SecurityContext securityContext() {
////        return SecurityContext.builder().securityReferences(defaultAuth()).build();
////    }
////
////    private List<SecurityReference> defaultAuth() {
////        AuthorizationScope authorizationScope = new AuthorizationScope("global", "accessEverything");
////        AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
////        authorizationScopes[0] = authorizationScope;
////        return Arrays.asList(new SecurityReference("JWT", authorizationScopes));
////    }
//
//
//}