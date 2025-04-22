package entities;

import java.util.ArrayList;

public class Banco {

    static ArrayList<Conta> contas = new ArrayList<>();

    public static void CriarConta(){

    }

    public static void Depositar(){
        for(Conta c : contas){
            System.out.println(c);
        }

    }
}
