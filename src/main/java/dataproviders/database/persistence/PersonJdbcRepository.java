package dataproviders.database.persistence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import dataproviders.database.domain.Person;

@Repository
public class PersonJdbcRepository {

   private static final String SELECT_FROM_PERSON = "SELECT * FROM person";

   @Autowired
   JdbcTemplate jdbcTemplate;

   public List<Person> findAll() {
      return jdbcTemplate.query(SELECT_FROM_PERSON, new BeanPropertyRowMapper<Person>(Person.class));
   }
}