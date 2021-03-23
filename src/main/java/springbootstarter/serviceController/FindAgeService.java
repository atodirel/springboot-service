package springbootstarter.serviceController;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class FindAgeService {
    private static final List<PersonWithAge> WITH_AGE = List.of(
        new PersonWithAge("eugene", 36),
        new PersonWithAge("alina", 30)
    );

    public int age(String personName) {
        System.out.println("entered aged method : " + personName);
        return WITH_AGE.stream()
                       .filter(personWithAge -> personWithAge.getName().equals(personName))
                       .map(PersonWithAge::getAge)
                       .findFirst()
                       .get();
    }
}
