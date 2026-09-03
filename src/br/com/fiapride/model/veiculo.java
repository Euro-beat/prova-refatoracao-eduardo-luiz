package br.com.fiapride.model;

public class veiculo {

    private String individuo;
    private String placa;
    private double litrosGasolina;
    private double litrosTanqueCombustivel;

    public veiculo(String individuo, String placa, double gasolina, double litrosTanqueCombustivel) {
        this.individuo = individuo;
        this.placa = placa;
        this.litrosGasolina = gasolina;
        this.litrosTanqueCombustivel = litrosTanqueCombustivel;
    }

    public void abastecerGasolina(double litragem) {
        litrosGasolina = litrosGasolina + litragem;
    }

    public void consumirGasolina(double litragem) {
        litrosGasolina = litrosGasolina - litragem;
    }

    public String getIndividuo() {
        return individuo;
    }

    private void setIndividuo(String individuo) {
        this.individuo = individuo;
    }

    public String getPlaca() {
        return placa;
    }

    private void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getLitrosGasolina() {
        return litrosGasolina;
    }

    private void setLitrosGasolina(double litrosGasolina) {
        this.litrosGasolina = litrosGasolina;
    }

    public double getLitrosTanqueCombustivel() {
        return litrosTanqueCombustivel;
    }

    private void setLitrosTanqueCombustivel(double litrosTanqueCombustivel) {
        this.litrosTanqueCombustivel = litrosTanqueCombustivel;
    }
}
