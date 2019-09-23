package test.functionInterfaces.function;

import Common.utilities.CustomUtils;
import main.functionInterfaces.function.BiFunctionExample;
import main.functionInterfaces.predicate.PredicatePersonExample;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class BiFunctionExampleTest {

    @Test
    final void testPersonToGenderMapper2_works_with_agePredicate() {
        var expectedMap = new HashMap<String, String>();
        expectedMap.put("Davidson", "Male");
        expectedMap.put("Lauren", "Female");
        expectedMap.put("JayaKumari", "Female");
        expectedMap.put("OmkarNath", "Male");

        var actualMap = BiFunctionExample.personToGenderMapper2.apply(
                CustomUtils.PERSON_LIST,
                PredicatePersonExample.agePredicate);

        assertEquals(expectedMap, actualMap);
    }

    @Test
    final void testPersonToGenderMapper2_works_with_weightPredicate() {
        var expectedMap = new HashMap<String, String>();
        expectedMap.put("Davidson", "Male");
        expectedMap.put("Lauren", "Female");
        expectedMap.put("JayaKumari", "Female");
        expectedMap.put("OmkarNath", "Male");

        var actualMap = BiFunctionExample.personToGenderMapper2.apply(
                CustomUtils.PERSON_LIST,
                PredicatePersonExample.weightPredicate);

        assertEquals(expectedMap, actualMap);
    }
}