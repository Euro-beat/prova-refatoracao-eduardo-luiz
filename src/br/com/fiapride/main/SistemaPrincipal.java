package br.com.fiapride.main;

import br.com.fiapride.model.veiculo;

public class SistemaPrincipal {
    public static void main(String[] args) {

        veiculo veiculo1 = new veiculo("Carlos","ABC-1234",-10,55);

        // cantinho da vergonha do código original, logo abaixo deste lindo constructor
        /*v1.individuo = "Carlos";
        v1.placa = "ABC-1234";
        v1.litrosGasolina = -10; // PERIGO: Valores negativos permitidos!
        v1.abastecerGasolina(50);
        v1.consumirGasolina(100); // PERIGO: Consome mais que o disponível!*/

        System.out.println("Dono: " + veiculo1.getIndividuo() + " | Placa: " + veiculo1.getPlaca() + " | Gasolina: " + veiculo1.getLitrosGasolina());
    }
}