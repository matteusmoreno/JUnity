import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    void deveRetornarSomaDeDoisValores() {
        Calculadora calc = new Calculadora();
        double resultadoDoisPositivos = calc.somar(4, 6);
        Assertions.assertEquals(10, resultadoDoisPositivos);

        double resultadoUmNegativo = calc.somar(4, -3);
        Assertions.assertEquals(1, resultadoUmNegativo);

        double resultadoDoisNegativos = calc.somar(-2, -2);
        Assertions.assertEquals(-4, resultadoDoisNegativos);
    }

    @Test
    void deveRetornarSubtracaoDeDoisValores() {
        Calculadora calc = new Calculadora();
        double resultadoDoisPositivos = calc.subtrair(9, 6);
        Assertions.assertEquals(3, resultadoDoisPositivos);

        double resultadoUmNegativoNaFrente = calc.subtrair(-9, 19);
        Assertions.assertEquals(-28, resultadoUmNegativoNaFrente);

        double resultadoUmNegativoEmSegundo = calc.subtrair(9, -19);
        Assertions.assertEquals(28, resultadoUmNegativoEmSegundo);

        double resultadoDoisNegativos = calc.subtrair(-10, -20);
        Assertions.assertEquals(10, resultadoDoisNegativos);
    }

    @Test
    void deveRetornarMultiplicacaoDeDoisValores() {
        Calculadora calc = new Calculadora();
        double resultadoDoisPositivos = calc.multiplicar(8, 10);
        Assertions.assertEquals(80, resultadoDoisPositivos);

        double resultadoUmNegativo = calc.multiplicar(-5, 10);
        Assertions.assertEquals(-50, resultadoUmNegativo);

        double resultadoDoisNegativos = calc.multiplicar(-2, -6);
        Assertions.assertEquals(12, resultadoDoisNegativos);
    }

    @Test
    void deveRetornarDivisaoDeDoisValores() {
        Calculadora calc = new Calculadora();
        double resultadoDoisPositivos = calc.dividir(40, 2);
        Assertions.assertEquals(20, resultadoDoisPositivos);

        double resultadoUmNegativo = calc.dividir(10, -2);
        Assertions.assertEquals(-5, resultadoUmNegativo);

        double resultadoDoisNegativos = calc.dividir(-50, -2);
        Assertions.assertEquals(25, resultadoDoisNegativos);
    }



}
