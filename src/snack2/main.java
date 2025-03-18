package snack2;

import java.math.BigDecimal;

import javafx.scene.effect.ColorAdjust;

public class main {

    public static void main(String[] args) {
        
        ContoBancario nuovoConto = new ContoBancario(123456789);

        nuovoConto.deposita(new BigDecimal(150));
        nuovoConto.deposita(new BigDecimal(12));

        System.out.println(nuovoConto.saldoCorrente());

        nuovoConto.preleva(new BigDecimal(55));

        System.out.println(nuovoConto.saldoCorrente());
    }
}
