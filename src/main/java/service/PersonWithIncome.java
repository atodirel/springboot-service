package service;

public class PersonWithIncome {

    private final String name;
    private final int income;

    public PersonWithIncome(String name, int income) {
        this.name = name;
        this.income = income;
    }

    public String getName() {
        return name;
    }

    public int getIncome() {
        return income;
    }
}

