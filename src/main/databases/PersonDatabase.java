package main.databases;

import main.models.Person;
import main.models.PersonGender;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 * Creates new instances of Person class
 */
public class PersonDatabase {

    /**
     * a supplier that returns one Person entry
     */
    public static final Supplier<Person> personSupplier = () ->
            new Person("John", 13, 20.5, PersonGender.MALE.label, Arrays.asList("soccer", "lacross", "rugby"));

    public static List<Person> getPersonList() {
        Person person1 = new Person("John", 13, 20.5, PersonGender.MALE.label, Arrays.asList("soccer", "lacross", "rugby"));
        Person person2 = new Person("Jenny", 11, 15.0, PersonGender.FEMALE.label, Arrays.asList("soccer", "lacross", "rugby"));

        Person person3 = new Person("Davidson", 41, 70.9, PersonGender.MALE.label, Arrays.asList("soccer", "lacross", "rugby"));
        Person person4 = new Person("Lauren", 28, 60.2, PersonGender.FEMALE.label, Arrays.asList("soccer", "lacross", "rugby"));

        Person person5 = new Person("OmkarNath", 63, 55.4, PersonGender.MALE.label, Arrays.asList("soccer", "lacross", "rugby"));
        Person person6 = new Person("JayaKumari", 54, 50.1, PersonGender.FEMALE.label, Arrays.asList("soccer", "lacross", "rugby"));

        List<Person> personList = Arrays.asList(person1, person2, person3, person4, person5, person6);

        return personList;
    }
}
