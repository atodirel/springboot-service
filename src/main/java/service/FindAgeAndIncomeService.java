package service;

public class FindAgeAndIncomeService {
    private final FindAgeService findAgeService;
    private final FindIncomeService findIncomeService;

    public FindAgeAndIncomeService(FindAgeService findAgeService, FindIncomeService findIncomeService) {
        this.findAgeService = findAgeService;
        this.findIncomeService = findIncomeService;
    }

    public Response response(String personName) {
        int age = findAgeService.age(personName);

        int income = findIncomeService.income(personName);

        return new Response(personName, age, income);
    }

}
