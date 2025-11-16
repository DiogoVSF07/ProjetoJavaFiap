package org.fiap.produtos.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

public class Produto {

    private Long id;
    private String nome;
    private String descricao;
    private BigDecimal preco;
    private LocalDateTime dataDeCadastro;
    private Categoria categoria;

    public Produto() {
    }

    public Produto(Long id, String nome, String descricao, BigDecimal preco, LocalDateTime dataDeCadastro, Categoria categoria) {
        this.setId(id);
        this.setNome(nome);
        this.setDescricao(descricao);
        this.setPreco(preco);
        this.setDataDeCadastro(dataDeCadastro);
        this.setCategoria(categoria);
    }

    public Produto(String nome, String descricao, BigDecimal preco, LocalDateTime dataDeCadastro, Categoria categoria) {
        this.setNome(nome);
        this.setDescricao(descricao);
        this.setPreco(preco);
        this.setDataDeCadastro(dataDeCadastro);
        this.setCategoria(categoria);
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public LocalDateTime getDataDeCadastro() {
        return dataDeCadastro;
    }

    public void setDataDeCadastro(LocalDateTime dataDeCadastro) {
        this.dataDeCadastro = dataDeCadastro;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(id, produto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return nome.toUpperCase();
    }
}
