package org.fiap;

import org.fiap.produtos.model.Categoria;
import org.fiap.produtos.model.Produto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Categoria categoria = new Categoria("Celulares");
        Produto produto = new Produto();

        categoria.setId(1L).setNome("Eletronicos");

        produto.setId(1l).setNome("Linux")
                .setDescricao("Reader")
                .setCategoria(categoria)
                .setDataDeCadastro(LocalDateTime.now())
                .setPreco(BigDecimal.valueOf(800));

        System.out.println("Categoria: " + categoria);
        System.out.println("Produto: " + produto);
    }
}