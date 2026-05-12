/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class Patente {
    private int id;
    private String nome;
    private String descricao;
    private int nivelHierarquico;

    public Patente() {
    }

    public Patente(int id, String nome, String descricao, int nivelHierarquico) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.nivelHierarquico = nivelHierarquico;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getNivelHierarquico() {
        return nivelHierarquico;
    }

    public void setNivelHierarquico(int nivelHierarquico) {
        this.nivelHierarquico = nivelHierarquico;
    }
}
