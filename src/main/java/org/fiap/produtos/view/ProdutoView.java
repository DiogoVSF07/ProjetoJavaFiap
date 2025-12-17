package org.fiap.produtos.view;

import org.fiap.produtos.model.Categoria;
import org.fiap.produtos.model.Produto;
import org.fiap.produtos.repository.ProdutoCollectionRepository;

import javax.swing.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ProdutoView {

    static ProdutoCollectionRepository repository;

    public static Produto form(Produto produto) {

        Categoria categoria = null;

        do {
            categoria = CategoriaView.select(produto.getCategoria());
        } while(categoria==null);

        String nome = "";

        do {
            nome = JOptionPane.showInputDialog(null, "Informe o nome do produto!", produto.getNome());
        } while (nome.equals(""));

        String descricao = "";

        do{
            descricao = JOptionPane.showInputDialog(null,"informe a descrição do produto", produto.getDescricao());
        }while (descricao.equals(""));

        double preco = 0;

        do {
            try{
                preco = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe o preço do produto", produto.getPreco()));
            }catch (Exception e){
                preco = 0;
            }

        } while (preco<=0);

        Produto ret = produto;

        ret.setCategoria(categoria)
                .setNome(nome)
                .setDescricao(descricao)
                .setDataDeCadastro(LocalDateTime.now())
                .setPreco(BigDecimal.valueOf(preco));

        return ret;
    }

    public void sucesso(){
        JOptionPane.showMessageDialog(null,"Produto salva com sucesso");
    }
    public static void sucesso(Produto produto){
        JOptionPane.showMessageDialog(null,"Produto "+produto+" salva com sucesso!");
    }

    public static Produto select(Produto produto){
        Produto ret = (Produto) JOptionPane.showInputDialog(
                null,
                "Selecione um Produto",
                "Menu",
                JOptionPane.QUESTION_MESSAGE,
                null,
                repository.findAll().toArray(),
                produto == null ? 1 : produto);
        return ret;
    }

    public static void update(Produto produto){
        form(produto);
        sucesso(produto);
        show(produto);
    }

    private static void show(Produto p) {
        System.out.println(p);
        String textoFormatado=String.format(
                "PRODUTO "+ p.getNome() + System.lineSeparator() +
                " DESCRIÃO " + p.getDescricao() +  System.lineSeparator() +
                " CATEGORIA " + p.getCategoria() + System.lineSeparator() +
                " PREÇO %,.2f " , p.getPreco());
        JOptionPane.showMessageDialog(null,textoFormatado);
    }


}
