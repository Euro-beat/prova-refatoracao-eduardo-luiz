package br.com.fiapride.main;

import br.com.fiapride.model.veiculo;

public class SistemaPrincipal {
    public static void main(String[] args) {

        veiculo veiculo1 = new veiculo("Carlos","ABC-1234",40,60);

        // cantinho da vergonha do código original, logo abaixo deste lindo constructor
        /*v1.individuo = "Carlos";
        v1.placa = "ABC-1234";
        v1.litrosGasolina = -10; // PERIGO: Valores negativos permitidos!
        v1.abastecerGasolina(50);
        v1.consumirGasolina(100); // PERIGO: Consome mais que o disponível!*/

        System.out.println("\nDono: " + veiculo1.getDono() + " | Placa: " + veiculo1.getPlaca() + " | Gasolina: " + veiculo1.getLitrosGasolina() + " L | Litragem tanque: " + veiculo1.getLitrosTanqueGasolina() + " L");

        veiculo1.abastecerGasolina(25);

        System.out.println("\nDono: " + veiculo1.getDono() + " | Placa: " + veiculo1.getPlaca() + " | Gasolina: " + veiculo1.getLitrosGasolina() + " L | Litragem tanque: " + veiculo1.getLitrosTanqueGasolina() + " L");

        veiculo1.consumirGasolina(176);

        System.out.println("\nDono: " + veiculo1.getDono() + " | Placa: " + veiculo1.getPlaca() + " | Gasolina: " + veiculo1.getLitrosGasolina() + " L | Litragem tanque: " + veiculo1.getLitrosTanqueGasolina() + " L");

        // Try-catch's rápidos só para testar as condições das funções
        try {
            veiculo1.abastecerGasolina(-50);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }

        try {
            veiculo1.consumirGasolina(-10);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }
}