package org.fiap.produtos.view;

import org.fiap.produtos.model.Categoria;
import org.fiap.produtos.repository.CategoriaCollectionRepository;

import javax.swing.*;

public class CategoriaView {

    static CategoriaCollectionRepository repository;

    public static Categoria select(Categoria categoria){
        Categoria ret = (Categoria) JOptionPane.showInputDialog(
                null,
                "Selecione uma Categoria",
                "Menu",
                JOptionPane.QUESTION_MESSAGE,
                null,
                repository.findAll().toArray(),
                categoria == null ? 1 : categoria);
        return ret;
    }

    public void sucesso(){
        JOptionPane.showMessageDialog(null,"Categoria salva com sucesso");
    }
    public void sucesso(Categoria categoria){
        JOptionPane.showMessageDialog(null,"Categoria "+categoria+" salva com sucesso!");
    }
    public static Categoria form(Categoria categoria){
        String nome = JOptionPane.showInputDialog(null,"Informe o nome da categoria!", categoria != null ? categoria.getNome() : "");
        return new Categoria(nome);
    }
}
