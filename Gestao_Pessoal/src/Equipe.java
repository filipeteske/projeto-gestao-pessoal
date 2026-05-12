
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class Equipe {
    private int id;
    private String nome;
    private String tipo;
    private String status;

    private ArrayList<Bombeiro> bombeiros;

    public Equipe() {
        bombeiros = new ArrayList<>();
    }

    public Equipe(int id, String nome, String tipo, String status) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.status = status;
        bombeiros = new ArrayList<>();
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<Bombeiro> getBombeiros() {
        return bombeiros;
    }

    public void setBombeiros(ArrayList<Bombeiro> bombeiros) {
        this.bombeiros = bombeiros;
    } 
}
