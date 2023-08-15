import domain.Desempenho;
import domain.Funcionario;
import domain.ReajusteService;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class ReajustTest {

    @Test
    public void deveReajustarTresPorcentoDoSalarioSeDesempenhoForADesejar() {
        Funcionario funcionaro = new Funcionario("Matteus", Desempenho.A_DESEJAR, new BigDecimal("100.00"));
        ReajusteService reajusteService = new ReajusteService();

        var novoSalario = reajusteService.reajustarSalario(funcionaro);

        Assert.assertEquals(new BigDecimal("103.00"), novoSalario);
    }

    @Test
    public void deveReajustarQuinzePorcentoDoSalarioSeDesempenhoForADesejar() {
        Funcionario funcionaro = new Funcionario("Matteus", Desempenho.BOM, new BigDecimal("100.00"));
        ReajusteService reajusteService = new ReajusteService();

        var novoSalario = reajusteService.reajustarSalario(funcionaro);

        Assert.assertEquals(new BigDecimal("115.00"), novoSalario);
    }

    @Test
    public void deveReajustarVintePorcentoDoSalarioSeDesempenhoForADesejar() {
        Funcionario funcionaro = new Funcionario("Matteus", Desempenho.OTIMO, new BigDecimal("100.00"));
        ReajusteService reajusteService = new ReajusteService();

        var novoSalario = reajusteService.reajustarSalario(funcionaro);

        Assert.assertEquals(new BigDecimal("120.00"), novoSalario);
    }
}
