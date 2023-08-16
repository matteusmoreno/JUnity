package test;

import domain.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    @Test
    void testReverseWithNullString() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            StringUtils.reverse(null);
        });
    }

    @Test
    void testReverseWithNonNullString() {
        var result = StringUtils.reverse("Matteus");

        Assertions.assertEquals("suettaM", result);
    }

}
