package com.djm.javalearning.springbasicdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@Configuration  //Annotating a class with the @Configuration annotation indicates that the class will be used by JavaConfig as a source of bean definitions.
@ComponentScan  //Tells Spring to look for other components, configurations, and services in the the specified package
public class App {

    @Bean  // @Bean is a method-level annotation and a direct analog of the XML <bean/>
    MessageService mockMessageService() {
        return new MessageService() {
            public String getMessage() {
                return "Hello World!";
            }
        };
    }

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(App.class);   // Create & configure beans

        MessagePrinter printer = context.getBean(MessagePrinter.class);   // You use getBean() to retrieve instances of your beans

        printer.printMessage();
    }
}