/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class EscalaServico {
    private int idEscala;
    private String data;
    private String turno;
    private Bombeiro bombeiro;

    public EscalaServico(int idEscala, String data,
                         String turno, Bombeiro bombeiro) {

        this.idEscala = idEscala;
        this.data = data;
        this.turno = turno;
        this.bombeiro = bombeiro;
    }

    public void mostrarEscala() {

        System.out.println("===== ESCALA DE SERVIÇO =====");
        System.out.println("Data: " + data);
        System.out.println("Turno: " + turno);
        System.out.println("Bombeiro: " + bombeiro.getNome());
    }
}
