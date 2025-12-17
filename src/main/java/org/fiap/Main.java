package org.fiap;

import org.fiap.produtos.model.Categoria;
import org.fiap.produtos.model.Produto;
import org.fiap.produtos.repository.CategoriaCollectionRepository;
import org.fiap.produtos.repository.ProdutoCollectionRepository;
import org.fiap.produtos.view.CategoriaView;
import org.fiap.produtos.view.Opcao;
import org.fiap.produtos.view.OpcaoView;
import org.fiap.produtos.view.ProdutoView;

public class Main {
    public static void main(String[] args) {

        Opcao opcao = null;
        do {
            opcao = OpcaoView.select();
            switch (opcao) {
                case CADASTRAR_CATEGORIA -> cadastrarCategoria();
                case CADASTRAR_PRODUTO -> cadastrarProduto();
                case ALTERAR_PRODUTO -> alterarProduto();
                case CONSULTAR_PRODUTO_POR_ID -> consultarProdutoPorId();
                case CONSULTAR_PRODUTO_POR_CATEGORIA -> consultarProdutoPorCategoria();
                case ENCERRAR_SISTEMA -> encerrarSistema();
            }

        } while (opcao != Opcao.ENCERRAR_SISTEMA);
    }

    private static void alterarProduto() {
        Produto produto = ProdutoView.select(null);
        ProdutoView.update(produto);
    }

    private static void encerrarSistema() {
        System.exit(0);
    }

    private static void consultarProdutoPorCategoria() {
    }

    private static void consultarProdutoPorId() {
    }

    private static void cadastrarProduto() {

        Produto produto = ProdutoView.form(new Produto());
        ProdutoCollectionRepository.save(produto);
        ProdutoView.sucesso(produto);

    }

    private static void cadastrarCategoria() {
        CategoriaView view = new CategoriaView();
        Categoria categoria = view.form(new Categoria());
        CategoriaCollectionRepository.save(categoria);
        view.sucesso(categoria);
    }
}