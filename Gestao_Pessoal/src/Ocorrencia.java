/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class Ocorrencia {
    private int idOcorrencia;
    private String tipo;
    private String data;
    private String hora;
    private String status;

    public Ocorrencia(int idOcorrencia, String tipo,String data, String hora,String status) {

        this.idOcorrencia = idOcorrencia;
        this.tipo = tipo;
        this.data = data;
        this.hora = hora;
        this.status = status;
    }

    public void mostrarOcorrencia() {

        System.out.println("===== OCORRÊNCIA =====");
        System.out.println("Tipo: " + tipo);
        System.out.println("Data: " + data);
        System.out.println("Hora: " + hora);
        System.out.println("Status: " + status);
    }
}
