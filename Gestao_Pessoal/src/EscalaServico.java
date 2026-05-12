/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class EscalaServico {
    private int id;
    private String data;
    private String turno;

    private Bombeiro bombeiro;

    public EscalaServico() {
    }

    public EscalaServico(int id, String data,
                         String turno, Bombeiro bombeiro) {

        this.id = id;
        this.data = data;
        this.turno = turno;
        this.bombeiro = bombeiro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Bombeiro getBombeiro() {
        return bombeiro;
    }

    public void setBombeiro(Bombeiro bombeiro) {
        this.bombeiro = bombeiro;
    }
}
