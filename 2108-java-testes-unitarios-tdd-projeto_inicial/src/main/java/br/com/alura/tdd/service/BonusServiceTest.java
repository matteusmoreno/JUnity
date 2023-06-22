package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Funcionario;
import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;
import java.time.LocalDate;

public class BonusServiceTest {

    @Test
    public void bonusDeveriaSerZeroParaFuncionarioMuitoAlto(){
        BonusService service = new BonusService();
        Assert.assertThrows(IllegalArgumentException.class, () -> service.calcularBonus(new Funcionario("Matteus", LocalDate.now(), new BigDecimal(25000))));


    }

    @Test
    public void bonusDeveriaSerDezPorCentoDoSalario(){
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Matteus", LocalDate.now(), new BigDecimal(2500)));

        Assert.assertEquals(new BigDecimal("250.0"), bonus);
    }

    @Test
    public void bonusDeveriaSerDezPorCentoParaSalariodeDezMilReais(){
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Matteus", LocalDate.now(), new BigDecimal(10000)));

        Assert.assertEquals(new BigDecimal("1000.0"), bonus);
    }
}
