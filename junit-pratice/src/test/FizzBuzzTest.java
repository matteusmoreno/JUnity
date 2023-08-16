package test;

import domain.FizzBuzz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {


    @Test
    void testGenerateFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        var result = fizzBuzz.generate(6);

        Assertions.assertEquals("Fizz", result);
    }

    @Test
    void testGenerateBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        var result = fizzBuzz.generate(10);

        Assertions.assertEquals("Buzz", result);
    }

    @Test
    void testGenerateFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        var result = fizzBuzz.generate(15);

        Assertions.assertEquals("FizzBuzz", result);
    }

    @Test
    void testGenerateNumber() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        var result = fizzBuzz.generate(8);

        Assertions.assertEquals("8", result);
    }
}
