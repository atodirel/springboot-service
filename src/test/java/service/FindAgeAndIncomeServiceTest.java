package service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class FindAgeAndIncomeServiceTest {

    @Test
    public void testReal(){
        FindAgeService findAgeService = new FindAgeService();
        FindIncomeService findIncomeService = new FindIncomeService();
        FindAgeAndIncomeService findAgeAndIncomeService = new FindAgeAndIncomeService(findAgeService, findIncomeService);
        Response response = findAgeAndIncomeService.response("eugene");
//        System.out.println(response.getAge());
        Assertions.assertEquals(response.getAge(),36);
        Assertions.assertEquals(response.getName(), "eugene");
        Assertions.assertEquals(response.getIncome(),5);
    }

    @Test
    public void testWithMock(){
        FindAgeService findAgeService = Mockito.mock(FindAgeService.class);

//        FindIncomeService findIncomeService = new FindIncomeService();
//        FindIncomeService spyfindIncomeService = Mockito.spy(findIncomeService);
        FindIncomeService findIncomeService = Mockito.mock(FindIncomeService.class);
        FindAgeAndIncomeService findAgeAndIncomeService = new FindAgeAndIncomeService(findAgeService, findIncomeService);
        Mockito.when(findAgeService.age("eugene")).thenReturn(20);
        Response response = findAgeAndIncomeService.response("eugene");
//        System.out.println(response.getAge());
        Assertions.assertEquals(response.getAge(),20);

        Mockito.verify(findAgeService,Mockito.times(1)).age("eugene");

        //spy methods with findAge
        //mock meth with findIncome
        //@restcontroller
        //controller pasare eugene ca parametru sa primesc response

    }
}
