/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.calebe.exemplos.ex01;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Rafael
 */
public class ProdutoTest {

    private Produto produto;

    @Before
    public void criarProduto() {
        produto = new Produto("azeitona", 100);
    }

    @Test
    public void testGetPreco() {
        int expResult = (int) produto.getPreco();
        assertEquals(expResult, 100);
        System.out.println(produto.getPreco());
    }

    @Test
    public void testEquals_Object() {
        Object obj = new Produto("azeitona", 100);
        boolean result = produto.equals(obj);
        assertEquals(result, true);
    }

    @Test
    public void testEquals_ProdutoNome() {
        Produto obj = new Produto("azeitona", 100);
        boolean result = produto.equals(obj);
        assertEquals(result, true);
    }

}
