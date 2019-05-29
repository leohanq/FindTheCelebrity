package sprintboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import domain.usecase.FindCelebraty;

@SpringBootApplication
@ComponentScan(basePackages = { "dataproviders.database.persistence", "domain.usecase", "configuration.database" })
public class Application implements CommandLineRunner {

   @Autowired
   FindCelebraty findCelebraty;

   public static void main(String[] args) {
      SpringApplication.run(Application.class, args);
   }

   @Override
   public void run(String... args) throws Exception {
      System.out.println(findCelebraty.getCelebraty());
   }
}