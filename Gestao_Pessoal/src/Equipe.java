/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class Equipe {
    private int idEquipe;
    private String nome;
    private String tipo;
    private String status;

    public Equipe(int idEquipe, String nome,
                  String tipo, String status) {

        this.idEquipe = idEquipe;
        this.nome = nome;
        this.tipo = tipo;
        this.status = status;
    }

    public void mostrarEquipe() {

        System.out.println("EQUIPE");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo: " + tipo);
        System.out.println("Status: " + status);
    }
}
