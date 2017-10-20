package test.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * test.spring.AppConfig <br>
 *
 * @author 蒋カイセキ    Japan-Tokyo  2017-10-19 13:16:08<br>
 * ブログ http://shoukaiseki.blog.163.com/<br>
 * E-メール jiang28555@Gmail.com<br>
 **/
@Configuration
@ComponentScan("test.spring")
@EnableWebMvc
public class AppConfig {
    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/classes/views/");
        resolver.setSuffix(".jsp");
        resolver.setOrder(1);
        System.out.println("-----------------------------------asus------------------");
        org.springframework.web.servlet.mvc.method.AbstractHandlerMethodAdapter sdf;
        org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter aaa001;
        org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod aaa002;
        org.springframework.web.servlet.mvc.method.annotation.AbstractMessageConverterMethodProcessor aaa003;

        org.springframework.web.servlet.DispatcherServlet aaa004;

        org.springframework.web.servlet.view.InternalResourceViewResolver aaa010;
        return resolver;
    }
}
