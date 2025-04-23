package entities;

import java.util.ArrayList;

public class Banco {

    static ArrayList<Conta> contas = new ArrayList<>();

    public Conta CriarConta(String nome){
        Conta contaCriada = new Conta(nome);
        contas.add(contaCriada);
        return contaCriada;
    }

    public static void Depositar(Integer numeroConta, Double valorDeposito){
        for(Conta c : contas){
            if(c.getNumeroConta().equals(numeroConta))  c.Deposito(valorDeposito);
        }
    }

    public static void Sacar(Integer numeroConta, Double valorSaque){
        for(Conta c : contas){
            if(c.getNumeroConta().equals(numeroConta)) c.Saque(valorSaque);
        }
    }

    public static void Transferir(Integer contaRemetente, Integer ContaDestinatario, Double valorTransferencia){
        for(Conta rem : contas){
            if(rem.getNumeroConta().equals(contaRemetente)) {
                for(Conta des: contas){
                    if(des.getNumeroConta().equals(ContaDestinatario)) {
                        rem.Saque(valorTransferencia);
                        des.Deposito(valorTransferencia);
                    }
                }
            }
        }
    }

    public static void ContasDoBanco(){
        if(!contas.isEmpty()){
            for(Conta c : contas){
                System.out.println(c);
            }
        }else{
            System.out.println("Sem contas cadastradas");
        }
    }

    public static void VerificarSaldo(Integer numeroConta){
        for(Conta c : contas){
            if(c.getNumeroConta().equals(numeroConta)){
                System.out.println(c.getSaldo());
            }
        }
    }
}
