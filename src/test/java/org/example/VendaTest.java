package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class VendaTest {
    @Test
    public void testCalculaValorTotalComDesconto() {
        ItemVenda item1 = new ItemVenda("Produto1", 20.0, 2.0);
        ItemVenda item2 = new ItemVenda("Produto2", 10.0, 3.0);

        Venda venda = new Venda("Cliente1");
        venda.addItem(item1);
        venda.addItem(item2);
        venda.darDesconto(10.0);
        assertEquals(63.0, venda.calcularValorTotal());


        Venda venda2 = new Venda("Cliente2");
        venda2.addItem(item1);
        venda2.darDesconto(20.0);
        assertEquals(32.0, venda2.calcularValorTotal());


    }

    @Test
    public void testCalculaValorTotalSemDesconto() {
        ItemVenda item1 = new ItemVenda("Produto1", 20.0, 2.0);
        ItemVenda item2 = new ItemVenda("Produto2", 15.0, 3.0);

        Venda venda = new Venda("Cliente3");
        venda.addItem(item1);
        venda.addItem(item2);
        assertEquals(85.0, venda.calcularValorTotal());


        Venda venda2 = new Venda("Cliente3");
        venda2.addItem(item2);
        assertEquals(45.0, venda2.calcularValorTotal());


    }

    @Test
    public void testCalculaValorItem() {
        ItemVenda item = new ItemVenda("Produto3", 25.0, 4.0);
        assertEquals(100.0, item.calcularValor());

        ItemVenda item2 = new ItemVenda("Produto4", 10.0, 3.0);
        assertEquals(30.0, item2.calcularValor());
    }

}
