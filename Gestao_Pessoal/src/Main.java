/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class Main {
    public static void main(String[] args) {
        Bombeiro bombeiro1 = new Bombeiro(
                1,
                "Carlos Silva",
                "123.456.789-00",
                "2025001",
                "Sargento",
                "Resgate",
                "47999999999",
                "Ativo"
        );

        Patente patente1 = new Patente(
                1,
                "Sargento",
                "Responsável pela equipe",
                3
        );

        Equipe equipe1 = new Equipe(
                1,
                "Equipe Alpha",
                "Resgate",
                "Ativa"
        );

        Ocorrencia ocorrencia1 = new Ocorrencia(
                1,
                "Incêndio",
                "10/05/2026",
                "14:30",
                "Em andamento"
        );

        EscalaServico escala1 = new EscalaServico(
                1,
                "11/05/2026",
                "Noturno",
                bombeiro1
        );

        Treinamento treinamento1 = new Treinamento(
                1,
                "Combate a Incêndio",
                "Treinamento prático",
                20,
                "01/04/2026"
        );

        Usuario usuario1 = new Usuario(
                1,
                "admin",
                "123",
                "Supervisor"
        );

        bombeiro1.exibirDados();

        patente1.mostrarPatente();

        equipe1.mostrarEquipe();

        ocorrencia1.mostrarOcorrencia();

        escala1.mostrarEscala();

        treinamento1.mostrarTreinamento();

        usuario1.fazerLogin();
    }
}
