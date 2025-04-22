import entities.Banco;
import entities.Conta;

public class Main {
    public static void main(String[] args) {

        Conta c1 = new Conta("Matheus");
        Conta c2 = new Conta("Mariana");


        Banco.Depositar();

//        System.out.println(c1.getSaldo());


    }
}