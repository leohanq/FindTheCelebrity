package dataproviders.database.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import dataproviders.database.domain.Person;

public interface IPersonRepository extends JpaRepository<Person, Long> {
}