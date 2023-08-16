package test;

import domain.MathUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {

    @Test
    void testFactorialWithZero() {
        var result = MathUtils.factorial(0);

        Assertions.assertEquals(1, result);
    }

    @Test
    void testFactorialWithPositiveNumber() {
        var result = MathUtils.factorial(8);

        Assertions.assertEquals(40320, result);
    }
}
