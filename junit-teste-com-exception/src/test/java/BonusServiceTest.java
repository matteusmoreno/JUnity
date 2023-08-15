import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.service.BonusService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class BonusServiceTest {



    @Test
    public void deveRetornarDezPorCentoSeBonusForMenorQueMil() {
        var bonusService = new BonusService();
        var funcionario = new Funcionario("Matteus", LocalDate.of(2021, 8, 15), new BigDecimal("9999.990"));
        var bonus = bonusService.calcularBonus(funcionario);

        Assertions.assertEquals(new BigDecimal("999.9990"), bonus);
    }

    @Test
    public void deveRetornarZeroSeBonusForMaiorQueMil() {
        var bonusService = new BonusService();
        Assertions.assertThrows(IllegalArgumentException.class, () -> bonusService.calcularBonus(new Funcionario("Matteus", LocalDate.now(), new BigDecimal("10001.000"))));
    }

    @Test
    public void deveRetornarDezPorCentoSeBonusForMil() {
        var bonusService = new BonusService();
        var funcionario = new Funcionario("Matteus", LocalDate.of(2021, 8, 15), new BigDecimal("1000.00"));
        var bonus = bonusService.calcularBonus(funcionario);

        Assertions.assertEquals(new BigDecimal("100.000"), bonus);
    }
}
