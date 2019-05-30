package domain.usecase;

import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import dataproviders.database.domain.Person;
import dataproviders.database.persistence.IPersonRepository;

@SpringBootTest
public class FindCelebrityTest {

   @Mock
   private IPersonRepository personJdbcRepository;

   @InjectMocks
   private FindCelebrity findCelebrity = new FindCelebrity();

   @Before
   public void init() {
      MockitoAnnotations.initMocks(this);
   }

   @Test
   public void findCelebrityTest() throws Exception {
      givenPeopleAndCelebrity();
      Person celebrity = findCelebrity.getCelebrity();
      assertEquals(Boolean.TRUE, celebrity.getIsCelebrity());
   }

   @Test
   public void notFoundCelebrityTest() throws Exception {
      givenPeopleNotCelebrity();
      Person celebrity = findCelebrity.getCelebrity();
      assertEquals(Boolean.FALSE, celebrity.getIsCelebrity());
   }

   private void givenPeopleAndCelebrity() {
      Person fan1 = new Person(1, "leonardo", Boolean.FALSE);
      Person fan2 = new Person(2, "nicolas", Boolean.FALSE);
      Person celebrity = new Person(3, "Dua Lipa", Boolean.TRUE);
      List<Person> people = Arrays.asList(fan1, fan2, celebrity);
      when(personJdbcRepository.findAll()).thenReturn(people);
   }
   
   private void givenPeopleNotCelebrity() {
      Person fan1 = new Person(1, "leonardo", Boolean.FALSE);
      Person fan2 = new Person(2, "nicolas", Boolean.FALSE);
      List<Person> people = Arrays.asList(fan1, fan2);
      when(personJdbcRepository.findAll()).thenReturn(people);
   }
}