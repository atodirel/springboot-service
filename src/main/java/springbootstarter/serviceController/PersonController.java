package springbootstarter.serviceController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    private FindAgeAndIncomeService findAgeAndIncomeService2;

    @Autowired
    private FindAgeService findAgeService2;

    @Autowired
    private FindIncomeService findIncomeService2;

    @RequestMapping("/persons/{id}")
    public Response getResponse(@PathVariable String id){
        return findAgeAndIncomeService2.response2(id);
    }

    /*testing
    @RequestMapping("/persons")
    public String test(){
        return "test";
    }
    */

}
