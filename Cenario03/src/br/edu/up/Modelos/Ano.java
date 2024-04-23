package br.edu.up.Modelos;

public class Ano {
    private int ano;
    private boolean bisexto;
    private String[] meses = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" };

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isBisexto() {
        return bisexto;
    }

    public void setBisexto(boolean bisexto) {
        this.bisexto = bisexto;
    }

    public String[] getMeses() {
        return meses;
    }

    public void setMeses(String[] meses) {
        this.meses = meses;
    }

}
