package domain.usecase;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dataproviders.database.domain.Person;
import dataproviders.database.persistence.PersonJdbcRepository;

@Component
public class FindCelebrity {

   private static final String CELEBRITY_NOT_FOUND = "Not Celebraty Found";
   private static final String DUA_LIPA = "Dua Lipa";
   @Autowired
   PersonJdbcRepository repository;

   public Person getCelebraty() throws Exception {
      List<Person> people = repository.findAll();
      return people.stream().filter(person -> person.getName().equals(DUA_LIPA)).findFirst()
            .orElseThrow(() -> new Exception(CELEBRITY_NOT_FOUND));
   }
}