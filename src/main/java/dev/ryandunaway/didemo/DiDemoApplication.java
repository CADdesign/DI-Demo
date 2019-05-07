package dev.ryandunaway.didemo;

import dev.ryandunaway.didemo.controllers.ConstructorInjectedController;
import dev.ryandunaway.didemo.controllers.MyController;
import dev.ryandunaway.didemo.controllers.PropertyInjectedController;
import dev.ryandunaway.didemo.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");

        System.out.println(controller.hello());
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello() + PropertyInjectedController.class.getName());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello() + SetterInjectedController.class.getCanonicalName());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello() + ConstructorInjectedController.class.getSimpleName());

    }


}
