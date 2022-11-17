/*
 * package com.SpringBootProjects.LearnSpringBoot;
 * 
 * import org.springframework.context.annotation.Bean; import
 * org.springframework.stereotype.Component; import
 * org.springframework.web.servlet.config.annotation.EnableWebMvc;
 * 
 * import springfox.documentation.builders.ApiInfoBuilder; import
 * springfox.documentation.builders.PathSelectors; import
 * springfox.documentation.builders.RequestHandlerSelectors; import
 * springfox.documentation.service.ApiInfo; import
 * springfox.documentation.spi.DocumentationType; import
 * springfox.documentation.spring.web.plugins.Docket; import
 * springfox.documentation.swagger2.annotations.EnableSwagger2;
 * 
 * @EnableWebMvc
 * 
 * @EnableSwagger2
 * 
 * @Component public class SwaggerConfig {
 * 
 * @Bean public Docket docket() { return new Docket(DocumentationType.SWAGGER_2)
 * .groupName("courses-api") .apiInfo(apiInfo()) .select()
 * .apis(RequestHandlerSelectors.basePackage(
 * "com.SpringBootProjects.LearnSpringBoot")) .paths(PathSelectors.any())
 * .build(); }
 * 
 * private ApiInfo apiInfo() { // TODO Auto-generated method stub return new
 * ApiInfoBuilder() .title("Courses-Api")
 * .description("spring boot test api project")
 * .licenseUrl("hsangita949@gmail.com") .version("1.0") .build(); } }
 */
package com.SpringBootProjects.LearnSpringBoot;
import org.springframework.context.annotation.Bean;  
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.spi.DocumentationType;  
import springfox.documentation.spring.web.plugins.Docket;  
import springfox.documentation.swagger2.annotations.EnableSwagger2;  
//@EnableWebMvc
@Configuration  
//Enable Swagger  
@EnableSwagger2  
public class SwaggerConfig   
{  
//creating bean  
@Bean  
public Docket api()  
{  
//creating constructor of Docket class that accepts parameter DocumentationType  
return new Docket(DocumentationType.SWAGGER_2);  
}  
}  