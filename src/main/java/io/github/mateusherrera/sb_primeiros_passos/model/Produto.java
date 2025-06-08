package io.github.mateusherrera.sb_primeiros_passos.model;

/**
 * Classe que representa um produto.
 *
 * @author Mateus Herrera
 * @since 2025-06-08
 */
public class Produto {
    // ini: atributos
    private String id;
    private String nome;
    private String descricao;
    private Double preco;
    // fim: atributos

    //ini: getters e setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    // fim: getters e setters

    // toString
    @Override
    public String toString() {
        return "Produto{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }
}
