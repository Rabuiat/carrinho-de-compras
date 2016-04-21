/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.calebe.exemplos.ex02.controller;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rafael
 */
public class ClasseFacadeControllerTest {
    
    ClasseFacadeController teste;
    int i = 2;
    
    public void CriarClasseFacadeController() throws Exception {
        ClasseFacadeController controller = new ClasseFacadeController();
    }
    

    @Test
    //Falta o arquivo jndi.properties 
    public void testMetodo() throws Exception {
        ClasseFacadeController instance = new ClasseFacadeController();
        String expResult = instance.metodo(2);
        String result = teste.metodo(i);
        System.out.println(result);
        System.out.println(expResult);
        boolean equalsResult = result.equals(expResult);
        assertEquals(true, equalsResult);
    }
    
}
