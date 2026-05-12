/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class Bombeiro {
    private int id;
    private String nome;
    private String cpf;
    private String matricula;
    private String patente;
    private String especialidade;
    private String contato;
    private String status;

    public Bombeiro(int id, String nome, String cpf,
                     String matricula, String patente,
                     String especialidade, String contato,
                     String status) {

        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
        this.patente = patente;
        this.especialidade = especialidade;
        this.contato = contato;
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public void exibirDados() {

        System.out.println("===== BOMBEIRO =====");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Patente: " + patente);
        System.out.println("Especialidade: " + especialidade);
        System.out.println("Contato: " + contato);
        System.out.println("Status: " + status);
    }
}
