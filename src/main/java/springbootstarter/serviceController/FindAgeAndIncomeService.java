package springbootstarter.serviceController;

import org.springframework.stereotype.Service;

@Service
public class FindAgeAndIncomeService {

    private final FindAgeService findAgeService2;
    private final FindIncomeService findIncomeService2;

    public FindAgeAndIncomeService(FindAgeService findAgeService2, FindIncomeService findIncomeService2) {
        this.findAgeService2 = findAgeService2;
        this.findIncomeService2 = findIncomeService2;
    }

    public Response response2(String personName) {
        int age = findAgeService2.age(personName);
        int income = findIncomeService2.income(personName);

        return new Response(personName, age, income);
    }

}
