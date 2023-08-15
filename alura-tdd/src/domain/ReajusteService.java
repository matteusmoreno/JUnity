package domain;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class ReajusteService {

    public BigDecimal reajustarSalario(Funcionario funcionario) {
        var reajuste = funcionario.getSalario().multiply(funcionario.getDesempenho().percentualReajuste()).setScale(2, RoundingMode.HALF_UP);
        funcionario.setSalario(funcionario.getSalario().add(reajuste));

        return funcionario.getSalario();
    }
}
