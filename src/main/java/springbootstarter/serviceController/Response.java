package springbootstarter.serviceController;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Response {
    @Id
    private final String name;
    private final int age;
    private final int income;

    public Response(String name, int age, int income) {
        this.name = name;
        this.age = age;
        this.income = income;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getIncome() {
        return income;
    }

}

