package org.fiap.produtos.repository;

import org.fiap.produtos.model.Categoria;

import java.util.List;
import java.util.Vector;

public class CategoriaCollectionRepository {

    private static List<Categoria> categorias;

    static {

        categorias = new Vector<>();
        Categoria eletronicos = new Categoria("Eletronico");
        Categoria celulares = new Categoria("Celulares");
        Categoria livros = new Categoria("Livros");

        categorias.add(eletronicos);
        categorias.add(celulares);
        categorias.add(livros);
    }
}
