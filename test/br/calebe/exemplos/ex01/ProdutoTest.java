/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.calebe.exemplos.ex01;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

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

    /**
     * Test of equals method, of class Produto.
     */
    @Test
    public void testEquals_Object() {
        Object obj = new Produto("azeitona", 100);
        boolean result = produto.equals(obj);
        assertEquals(result, true);        
    }

    /**
     * Test of equals method, of class Produto.
     */
    @Test
    public void testEquals_ProdutoPreco() {
        Produto obj = new Produto("papel", 1.50);
        double instance = produto.getPreco();
        boolean result = produto.equals(obj.getPreco());
        assertEquals(false, result);
    }
    
        @Test
    public void testEquals_ProdutoNome() {
        Produto obj = new Produto("mouse", 35);
        //Não existe método getNome na classe Produto, teste não pode ser executado
    }
    
   
}