package br.calebe.exemplos.teste.ex01;

import br.calebe.exemplos.ex01.Carrinho;
import br.calebe.exemplos.ex01.CarrinhoVazioExpected;
import br.calebe.exemplos.ex01.Produto;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class CarrinhoTest {

    private Carrinho carrinho;

    @Before
    public void criandoCarrinho() {
        carrinho = new Carrinho();
    }

    @Test(expected = CarrinhoVazioExpected.class)
    public void colocandoZeroProduto() throws CarrinhoVazioExpected {
        Produto menor;
        menor = carrinho.menorProduto();
        assertEquals(null, menor);
    }

    @Test
    public void colocandoUmProduto() throws CarrinhoVazioExpected {
        Produto livro = new Produto("Java em 24 horas", 50.00);
        carrinho.add(livro);
        Produto menor;
        menor = carrinho.menorProduto();
        assertEquals(livro, menor);
    }

    @Test
    public void colocandoMaisProdutos() throws CarrinhoVazioExpected {
        Produto livro = new Produto("Java em 24 horas", 50.00);
        carrinho.add(livro);
        Produto deitel = new Produto("Java: como programar", 150.00);
        carrinho.add(deitel);
        Produto menor;
        menor = carrinho.menorProduto();
        assertEquals(livro, menor);
    }

    @Test
    public void identidadeDeProdutos() throws CarrinhoVazioExpected {
        Produto original = new Produto("Java em 24 horas", 50.00);
        carrinho.add(original);
        Produto copia = new Produto("Java em 24 horas", 50.00);
        original = carrinho.menorProduto();
        assertEquals(original, copia);
    }

    @Test
    public void contandoItensCarrinho() throws CarrinhoVazioExpected {
        int contador = 4;
        Produto livro = new Produto("Senhor dos Aneis 1", 120.0);
        carrinho.add(livro);
        livro = new Produto("Senhor dos Aneis 2", 150.0);
        carrinho.add(livro);
        livro = new Produto("Senhor dos Anais 3", 169.0);
        carrinho.add(livro);
        livro = new Produto("Batman Against the Injustice", 169.0);
        carrinho.add(livro);
        
        /*for (Object a : carrinho) {
            
        }
            contador++;
        }
        
        //Não é possível executar o teste porque não tem como percorrer o ArrayList de carrinho(Método privado).
         */
    }
    
    @Test
    public void doisItensPrecosIguais() throws CarrinhoVazioExpected {
        Produto livro1 = new Produto("Universe in a nutshell", 77.0);
        carrinho.add(livro1);
        Produto livro2 = new Produto("Steve Jobs Biography", 100.0);
        carrinho.add(livro2);
        Produto livro3 = new Produto("Jack Black's Adventures", 77.0);
        carrinho.add(livro3);
        double menor = carrinho.menorProduto().getPreco();

        assertEquals(carrinho.menorProduto(), livro1);
        /* Dois Preços Iguais só aponta pro primeiro */
    }
    
}
