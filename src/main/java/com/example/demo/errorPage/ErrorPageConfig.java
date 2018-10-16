package com.example.demo.errorPage;

import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.WebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

import java.util.HashSet;

/**
 * 异常处理
 */
@Configuration
public class ErrorPageConfig {

    public WebServerFactoryCustomizer contaioerCustomizer(){

        return new WebServerFactoryCustomizer<ConfigurableWebServerFactory>(){

            @Override
            public void customize(ConfigurableWebServerFactory factory) {
                ErrorPage page404 = new ErrorPage(HttpStatus.NOT_FOUND,"/404.html");
                ErrorPage page405 = new ErrorPage(HttpStatus.NOT_ACCEPTABLE,"/405.html");
                ErrorPage page401 = new ErrorPage(HttpStatus.NON_AUTHORITATIVE_INFORMATION,"/401.html");
                ErrorPage page403 = new ErrorPage(HttpStatus.FORBIDDEN,"/403.html");
                factory.addErrorPages(page404);
                factory.addErrorPages(page403);
                factory.addErrorPages(page401);
                factory.addErrorPages(page405);

            }
        };

    }
}
