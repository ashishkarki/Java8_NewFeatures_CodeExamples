package test.defaults;

import Common.utilities.CustomUtils;
import main.defaults.IMultiplier;
import main.defaults.MultiplierImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MultiplierImplTest {

    IMultiplier multiplier;

    @BeforeEach
    final void setup() {
        multiplier = new MultiplierImpl();
    }

    @Test
    final void testMultiply() {
        final var expectedProduct = multiplier.multiply(CustomUtils.INTEGERS_LIST);

        assertTrue(expectedProduct == 120);
        assertTrue(multiplier.size(CustomUtils.INTEGERS_LIST) == 0); // was 5 before we overrode size()

        // for this test, we have to use the interface itself since isEmpty() is static
        assertTrue(IMultiplier.isEmpty(new ArrayList<>()));
        assertFalse(IMultiplier.isEmpty(CustomUtils.INTEGERS_LIST));
    }

}