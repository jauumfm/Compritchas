import Modelos.Conta;
import Modelos.Produto;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int escolha = 1;

        Scanner leitura = new Scanner(System.in);
        Scanner leituraVal = new Scanner(System.in);

        System.out.println("Qual limite do cartao? ");
        Conta limite = new Conta(leitura.nextDouble());
        while ( escolha != 0){
            System.out.println("O que deseja comprar?");
            String nome = leitura.next();
            System.out.println("Qual valor?");
            Produto compra = new Produto(nome,leituraVal.nextDouble());
            boolean compraFeita = limite.lancaCompra(compra);
            if (compraFeita){
                System.out.println("Compra realizada");
                System.out.println("Deseja continuar? aperte 0 para parar ou 1 para continuar");
                escolha = leitura.nextInt();
            }else{
                System.out.println("Sem limite");
                        escolha=0;
            }
        }
        Collections.sort(limite.getCompras());
        for (Produto item: limite.getCompras()){
            System.out.println(item.getNome()+" - "+item.getValor());
        }
        System.out.println("Seu saldo é "+limite.getSaldo());
    }
}