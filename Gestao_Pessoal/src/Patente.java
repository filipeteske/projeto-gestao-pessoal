/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class Patente {
    private int idPatente;
    private String nome;
    private String descricao;
    private int nivelHierarquico;

    public Patente(int idPatente, String nome,
                    String descricao, int nivelHierarquico) {

        this.idPatente = idPatente;
        this.nome = nome;
        this.descricao = descricao;
        this.nivelHierarquico = nivelHierarquico;
    }

    public void mostrarPatente() {

        System.out.println("PATENTE");
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Nível Hierárquico: " + nivelHierarquico);
    }
}
