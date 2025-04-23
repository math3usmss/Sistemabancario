import entities.Banco;
import entities.Conta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Banco banco = new Banco();

        int option = menu();

        do {
            switch (option) {
                case 1:
                    System.out.println("Digite o nome do titular");
                    String titular = sc.next();
                    Conta contaCriada = banco.CriarConta(titular);
                    System.out.println("Conta criada: " + contaCriada);
                    option = menu();
                    break;
                case 2:
                    System.out.println("Qual numero da conta deseja depositar o dinheiro:");
                    int contaDepositar = sc.nextInt();
                    System.out.println("Qual o valor do deposito:");
                    double valorDeposito = sc.nextDouble();
                    Banco.Depositar(contaDepositar, valorDeposito);
                    option = menu();
                    break;
                case 3:
                    System.out.println("Qual numero da conta deseja sacar o dinheiro:");
                    int contaSaque = sc.nextInt();
                    System.out.println("Qual o valor do saque:");
                    double valorSaque = sc.nextDouble();
                    Banco.Sacar(contaSaque, valorSaque);
                    option = menu();
                    break;
                case 4:
                    System.out.println("De qual conta deseja transferir o dinheiro:");
                    int destinatario = sc.nextInt();
                    System.out.println("Para qual conta deseja transferir o dinheiro:");
                    int remetente = sc.nextInt();
                    System.out.println("Qual o valor da tranferencia:");
                    double valorTransferencia = sc.nextDouble();
                    Banco.Transferir(destinatario, remetente, valorTransferencia);
                    option = menu();
                    break;
                case 5:
                    System.out.println("Contas do banco:");
                    Banco.ContasDoBanco();
                    option = menu();
                    break;
                case 6:
                    System.out.println("Qual conta deseja verificar saldo:");
                    int contaVerificar = sc.nextInt();
                    Banco.VerificarSaldo(contaVerificar);
                    option = menu();
                    break;
            }

        } while (option != 0);

    }

    public static int menu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("-----------------------");
        System.out.println("0 - sair");
        System.out.println("1 - criar uma conta");
        System.out.println("2 - depositar");
        System.out.println("3 - saque");
        System.out.println("4 - tranferencia");
        System.out.println("5 - listar contas");
        System.out.println("6 - consultar saldo de uma conta");
        System.out.println("-----------------------");

        return sc.nextInt();
    }
}