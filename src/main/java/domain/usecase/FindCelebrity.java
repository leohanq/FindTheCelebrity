package domain.usecase;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dataproviders.database.domain.Person;
import dataproviders.database.persistence.IPersonRepository;

@Component
public class FindCelebrity {

   private static final int FIRST_POSITION = 0;

   @Autowired
   IPersonRepository personRepository;
   
   public Person getCelebrity() throws Exception {
      List<Person> people = personRepository.findAll();
      people.sort(comparatorByCelebrity);
      return people.get(FIRST_POSITION);
   }

   Comparator<Person> comparatorByCelebrity = (personFirst, personSecond) -> personSecond.getIsCelebrity()
         .compareTo(personFirst.getIsCelebrity());
}