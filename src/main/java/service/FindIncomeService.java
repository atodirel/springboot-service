package service;

import java.util.List;

public class FindIncomeService {
    private static final List<PersonWithIncome> WITH_INCOME = List.of(
        new PersonWithIncome("eugene", 5),
        new PersonWithIncome("alina", 10)
    );

    public int income(String personName) {
        return WITH_INCOME.stream()
                          .filter(personWithAge -> personWithAge.getName().equals(personName))
                          .map(PersonWithIncome::getIncome)
                          .findFirst()
                          .get();
    }

}

