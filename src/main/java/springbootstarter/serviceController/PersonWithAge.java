package springbootstarter.serviceController;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PersonWithAge {
    @Id
    private final String name;
    private final int age;

    public PersonWithAge(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String getName() {
        return  name;
    }

    int getAge() {
        return    age;
    }
}
