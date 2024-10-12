package Modelos;

public class Produto implements Comparable<Produto>{
    private String nome;
    private double valor;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "Produto= " + nome + '\'' +
                " Valor= " + valor +
                '}';
    }


    @Override
    public int compareTo(Produto outroProduto) {
        return Double.compare(this.valor, outroProduto.valor);
    }
}

