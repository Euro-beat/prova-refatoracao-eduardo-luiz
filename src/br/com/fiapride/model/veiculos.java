package br.com.fiapride.model;

public class veiculos {

    public String individuo;
    public String placa;
    public double gasolina;

    public void abastecerGasolina(double litragem) {
        gas = gas + litragem;
    }

    public void consumirGasolina(double litragem) {
        gas = gas - litragem;
    }

    public String getIndividuo() {
        return individuo;
    }

    public void setIndividuo(String individuo) {
        this.individuo = individuo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getGasolina() {
        return gasolina;
    }

    public void setGasolina(double gasolina) {
        this.gasolina = gasolina;
    }
}
