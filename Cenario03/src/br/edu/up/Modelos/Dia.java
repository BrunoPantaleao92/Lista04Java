package br.edu.up.Modelos;

public class Dia {

    private int diames;
    private Compromissos[] compromisso;

    /////////////////////////
    public int getDiames() {
        return diames;
    }

    public void setDiames(int diames) {
        this.diames = diames;
    }

    public Compromisso[] getCompromisso() {
        return compromisso;
    }

    public void setCompromisso(Compromisso[] compromisso) {
        this.compromisso = compromisso;
    }
    /////////////////////////

    public Dia(int diames) {
    }

    public void adicionarCompromisso(Compromisso compromisso) {

        this.compromisso = new Compromisso[];

    }

    public String consultarCompromisso(int hora) {
    }

    public void excluirCompromisso(int hora) {
    }

    public String listarCompromissos() {
    }

    /////////////////////////

}
