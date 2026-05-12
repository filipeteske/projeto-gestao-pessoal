/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class Usuario {
    private int idUsuario;
    private String login;
    private String senha;
    private String perfil;

    public Usuario(int idUsuario, String login,
                   String senha, String perfil) {

        this.idUsuario = idUsuario;
        this.login = login;
        this.senha = senha;
        this.perfil = perfil;
    }

    public void fazerLogin() {

        System.out.println("Usuário logado no sistema.");
    }
}
