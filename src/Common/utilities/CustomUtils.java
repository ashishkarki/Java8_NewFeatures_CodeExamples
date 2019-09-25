package Common.utilities;

import main.databases.PersonDatabase;
import main.models.Person;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * @author Ashish Karki
 * Contains all static methods and final static fields to be accessed elsewhere
 */
public class CustomUtils {
    public static final List<Integer> INTEGERS_LIST = Arrays.asList(1, 2, 3, 4, 5);

    public static final List<Person> PERSON_LIST = PersonDatabase.getPersonList();

    public static final Person ONE_PERSON = PersonDatabase.personSupplier.get();

    static final Supplier<List<String>> personNamesSupplier = () -> {
        return PERSON_LIST.stream().map(Person::getName).collect(Collectors.toList());
    };
    public static final List<String> PERSON_NAME_LIST = personNamesSupplier.get();

    static final Supplier<List<String>> uniqueActivitiesSupplier = () ->
            PERSON_LIST.stream().map(Person::getActivities).flatMap(List::stream).distinct().sorted().collect(Collectors.toList());
    public static final List<String> PERSON_DISTINCT_SORTED_ACTIVITIES_LIST = uniqueActivitiesSupplier.get();

    public static void optionalPrinterHelper(Optional optional) {
        if (optional.isPresent()) {
            System.out.println("The value for this optional is " + optional.get());
        } else {
            System.out.println("There is no value for this optional. It's null");
        }
    }
}
