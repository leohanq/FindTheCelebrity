package dataproviders.database.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class Person {

   @Id
   @Column(name = "id", unique = true, nullable = false)
   private Integer Id;

   @Column(name = "name")
   private String name;

   @Column(name = "isCelebrity")
   private Boolean isCelebrity;

   public Person() {
   }

   public Person(int id, String name, Boolean isCelebrity) {
      this.Id = id;
      this.name = name;
      this.isCelebrity = isCelebrity;
   }

   public Integer getId() {
      return Id;
   }

   public void setId(Integer id) {
      Id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public Boolean getIsCelebrity() {
      return isCelebrity;
   }

   public void setIsCelebrity(Boolean isCelebrity) {
      this.isCelebrity = isCelebrity;
   }

   @Override
   public String toString() {
      return "Person [Id=" + Id + ", name=" + name + ", isCelebrity=" + isCelebrity + "]";
   }
}