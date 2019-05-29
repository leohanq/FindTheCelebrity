package sprintboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import domain.usecase.FindCelebrity;

@SpringBootApplication
@ComponentScan(basePackages = { "dataproviders.database.persistence", "domain.usecase", "configuration.database" })
public class Application implements CommandLineRunner {

   @Autowired
   FindCelebrity findCelebraty;

   public static void main(String[] args) {
      SpringApplication.run(Application.class, args);
   }

   @Override
   public void run(String... args) throws Exception {
      System.out.println("Celebrity Found: ");
      System.out.println(findCelebraty.getCelebraty().getName());
   }
}