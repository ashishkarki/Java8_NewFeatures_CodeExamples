package Common.utilities;

import main.databases.PersonDatabase;
import main.models.Person;

import java.util.List;

/**
 * @author Ashish Karki
 * Contains all static methods and final static fields to be accessed elsewhere
 */
public class CustomUtils {
    final static public List<Person> PERSON_LIST = PersonDatabase.getPersonList();
}
