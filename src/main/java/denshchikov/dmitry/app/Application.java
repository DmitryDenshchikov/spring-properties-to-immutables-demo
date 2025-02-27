package denshchikov.dmitry.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

  public static void main(String[] args) {
    ConfigurableApplicationContext applicationContext =
        SpringApplication.run(Application.class, args);

//    ConfigPropertiesExample1 example1 = applicationContext.getBean(ConfigPropertiesExample1.class);
//    System.out.println(example1);
//
//    ConfigPropertiesExample2 example2 = applicationContext.getBean(ConfigPropertiesExample2.class);
//    System.out.println(example2);
//
//    ConfigPropertiesExample3 example3 = applicationContext.getBean(ConfigPropertiesExample3.class);
//    System.out.println(example3);
//
//    ConfigPropertiesExample4 example4 = applicationContext.getBean(ConfigPropertiesExample4.class);
//    System.out.println(example4);
//
//    ConfigPropertiesExample5 example5 = applicationContext.getBean(ConfigPropertiesExample5.class);
//    System.out.println(example5);
//
//    ConfigPropertiesExample6 example6 = applicationContext.getBean(ConfigPropertiesExample6.class);
//    System.out.println(example6);
//
//    ModifiableConfigPropertiesExample7 example7 = applicationContext.getBean(ModifiableConfigPropertiesExample7.class);
//    System.out.println(example7);
//
//    ConfigPropertiesExample8 example8 = applicationContext.getBean(ConfigPropertiesExample8.class);
//    System.out.println(example8);
  }
}
