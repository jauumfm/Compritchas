package Modelos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Conta{
    private double saldo;
    private double limite;
    List<Produto> compras;

    public Conta(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Produto> getCompras() {
        return compras;
    }

    public double getLimite() {
        return limite;
    }

    public boolean lancaCompra(Produto compra){
        if(this.saldo > compra.getValor()){
            this.saldo -= compra.getValor();
            this.compras.add(compra);
            return true;
        }else {
            return false;
        }
    }



//    @Override
//    public String toString() {
//        return "Conta{" +
//                "saldo=" + saldo +
//                ", limite=" + limite +
//                ", compras=" + compras +
//                '}';
//    }
}
