package snack2;

import java.math.BigDecimal;

public class ContoBancario {

    private int numeroConto;
    private BigDecimal saldo;

    public ContoBancario(int numeroConto){

        this.numeroConto = numeroConto;
        saldo = new BigDecimal(0);
    }

    public BigDecimal saldoCorrente(){
        return saldo ;
    }

    public void deposita(BigDecimal deposito){
        this.saldo = saldo.add(deposito);
        System.out.println("operazione avvenuta con successo");
    }

    public void preleva(BigDecimal prelievo){
        if(saldo.compareTo(prelievo) > 0){
           this.saldo = saldo.subtract(prelievo);
        }else{
            System.out.println("operazione rifiutata");
        }
    }
}
