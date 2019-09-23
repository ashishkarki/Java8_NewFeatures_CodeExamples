package test.functionInterfaces.function;

import Common.utilities.CustomUtils;
import jdk.jfr.Description;
import main.functionInterfaces.function.FunctionPersonExample;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FunctionPersonExampleTest {

    @Test
    @Description("Ensuring personToGenderMapper Function works correctly")
    final void testPersonToGenderMapper() {
        var expectedMap = new HashMap<>();
        expectedMap.put("Davidson", "Male");
        expectedMap.put("Lauren", "Female");
        expectedMap.put("JayaKumari", "Female");
        expectedMap.put("OmkarNath", "Male");

        var resultMap = FunctionPersonExample.personToGenderMapper.apply(CustomUtils.PERSON_LIST);

        assertTrue(resultMap.size() == 4);
        assertEquals(expectedMap, resultMap);
    }
}
