/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class Treinamento {
    private int idTreinamento;
    private String nome;
    private String descricao;
    private int cargaHoraria;
    private String dataRealizacao;

    public Treinamento(int idTreinamento, String nome,String descricao, int cargaHoraria,String dataRealizacao) {

        this.idTreinamento = idTreinamento;
        this.nome = nome;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
        this.dataRealizacao = dataRealizacao;
    }

    public void mostrarTreinamento() {

        System.out.println("TREINAMENTO");
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Carga Horária: " + cargaHoraria);
        System.out.println("Data: " + dataRealizacao);
    }
}
