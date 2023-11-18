package org.example;

public class ItemVenda {
    String descricao;
    double valorUnitario;
    double quantidade;

    public ItemVenda(String descricao, double valorUnitario, double quantidade) {
        this.descricao = descricao;
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;
    }

    public double calcularValor() {
        double resultado;
        resultado = valorUnitario * quantidade;
        return resultado;
    }
}
