
import java.util.ArrayList;

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
    private String dataNascimento;
    private Patente patente;
    private String especialidade;
    private String contato;
    private String status;

    private ArrayList<Equipe> equipes;
    private ArrayList<Ocorrencia> ocorrencias;
    private ArrayList<Treinamento> treinamentos;
    private ArrayList<EscalaServico> escalas;

    public Bombeiro() {
        equipes = new ArrayList<>();
        ocorrencias = new ArrayList<>();
        treinamentos = new ArrayList<>();
        escalas = new ArrayList<>();
    }

    public Bombeiro(int id, String nome, String cpf, String matricula,
                     String dataNascimento, Patente patente,
                     String especialidade, String contato, String status) {

        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
        this.patente = patente;
        this.especialidade = especialidade;
        this.contato = contato;
        this.status = status;

        equipes = new ArrayList<>();
        ocorrencias = new ArrayList<>();
        treinamentos = new ArrayList<>();
        escalas = new ArrayList<>();
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Patente getPatente() {
        return patente;
    }

    public void setPatente(Patente patente) {
        this.patente = patente;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<Equipe> getEquipes() {
        return equipes;
    }

    public void setEquipes(ArrayList<Equipe> equipes) {
        this.equipes = equipes;
    }

    public ArrayList<Ocorrencia> getOcorrencias() {
        return ocorrencias;
    }

    public void setOcorrencias(ArrayList<Ocorrencia> ocorrencias) {
        this.ocorrencias = ocorrencias;
    }

    public ArrayList<Treinamento> getTreinamentos() {
        return treinamentos;
    }

    public void setTreinamentos(ArrayList<Treinamento> treinamentos) {
        this.treinamentos = treinamentos;
    }

    public ArrayList<EscalaServico> getEscalas() {
        return escalas;
    }

    public void setEscalas(ArrayList<EscalaServico> escalas) {
        this.escalas = escalas;
    }  
}
