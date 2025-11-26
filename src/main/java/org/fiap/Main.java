package org.fiap;

import org.fiap.produtos.model.Categoria;
import org.fiap.produtos.model.Produto;
import org.fiap.produtos.repository.CategoriaCollectionRepository;
import org.fiap.produtos.repository.ProdutoCollectionRepository;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Categoria categoria = new Categoria();

        Produto produto = new Produto();

        categoria.setNome("Alimento");


        Categoria categoriaSave = CategoriaCollectionRepository.save(categoria);

        System.out.println("Categoria: " + categoriaSave);

        produto.setNome("Linux")
                .setDescricao("Reader")
                .setCategoria(CategoriaCollectionRepository.findById(2L))
                .setDataDeCadastro(LocalDateTime.now())
                .setPreco(BigDecimal.valueOf(800));

        Produto produtoSave = ProdutoCollectionRepository.save(produto);
        System.out.println("Produto: " + produtoSave);
    }
}