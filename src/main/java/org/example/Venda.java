package org.example;
import java.util.ArrayList;
import java.util.List;
public class Venda {
    String cliente;
    List<ItemVenda> itens;
    double valorVenda;
    double desconto;

    public Venda(String cliente) {
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public void addItem(ItemVenda item) {
        this.itens.add(item);
    }

    public void darDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double calcularValorTotal() {
        double total = 0;
        for(ItemVenda item: itens)
        {
            total = total + item.calcularValor();
        }

        double resultado;
        resultado = total - (total * (desconto / 100.0));
        return resultado;
    }
}
