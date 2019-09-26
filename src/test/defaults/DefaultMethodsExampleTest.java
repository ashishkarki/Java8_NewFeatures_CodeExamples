package test.defaults;

import Common.utilities.CustomUtils;
import main.defaults.DefaultMethodsExample;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DefaultMethodsExampleTest {

    @Test
    final void test_PreJava8_PostJava8_methods_return_sameThing() {
        assertEquals(
                DefaultMethodsExample.demoListSortPreJava8(CustomUtils.PERSON_NAME_LIST),
                DefaultMethodsExample.demoListSortPostJava8(CustomUtils.PERSON_NAME_LIST));
    }

}