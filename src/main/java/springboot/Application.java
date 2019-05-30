package springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import dataproviders.database.domain.Person;
import domain.usecase.FindCelebrity;

@EnableAutoConfiguration
@EnableJpaRepositories("dataproviders.database.persistence")
@EntityScan("dataproviders.database.domain")
@ComponentScan(basePackages = "domain.usecase")
@SpringBootApplication
public class Application implements CommandLineRunner {

   private static final String CELEBRITY = "Celebrity: ";
   private static final String CELEBRITY_NOT_FOUND = "Not Celebraty Found";
   private static final boolean IS_CELEBRITY = Boolean.TRUE;

   @Autowired
   FindCelebrity findCelebrity;

   public static void main(String[] args) {
      SpringApplication.run(Application.class, args);
   }

   @Override
   public void run(String... args) throws Exception {
      Person celebrity = findCelebrity.getCelebrity();
      if (celebrity.getIsCelebrity() == IS_CELEBRITY) {
         System.out.println(CELEBRITY + celebrity.getName());
      } else {
         System.out.println(CELEBRITY_NOT_FOUND);
      }
   }
}