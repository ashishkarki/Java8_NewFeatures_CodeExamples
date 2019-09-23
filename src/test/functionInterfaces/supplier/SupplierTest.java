package test.functionInterfaces.supplier;

import main.functionInterfaces.supplier.SupplierExample;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SupplierTest {

    @Test
    final void testPersonSupplier() {
        final var actualPerson = SupplierExample.personSupplier.get();

        assertEquals("James", actualPerson.getName());
    }
}
