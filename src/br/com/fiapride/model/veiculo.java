package br.com.fiapride.model;

public class veiculo {

    private String dono;
    private String placa;
    private double litrosGasolina;
    private double litrosTanqueGasolina;

    public veiculo(String dono, String placa, double litrosGasolina, double litrosTanqueGasolina) {
        this.dono = dono;
        this.placa = placa;

        if (litrosTanqueGasolina < 0 || litrosTanqueGasolina > 200) throw new IllegalArgumentException("Número impossível passado como 'litragem do tanque de gasolina'. Favor passar número positivo e menor que 200 litros.");
        else this.litrosTanqueGasolina = litrosTanqueGasolina;

        // Pesquisa rápida sobre como lançar erros no terminal, caso passem números impossíveis
        if (litrosGasolina < 0 || litrosGasolina > litrosTanqueGasolina) {
            throw new IllegalArgumentException("Número impossível passado como 'litragem de gasolina'. Favor passar número positivo e menor que a litragem do tanque.");
        }
        else this.litrosGasolina = litrosGasolina;
    }

    // Função exclusiva para debug
    /*public void info(){
        System.out.println("\nDono: " + dono + " | Placa: " + placa + " | Gasolina: " + litrosGasolina + " L | Litragem tanque: " + litrosTanqueGasolina + " L");
    }*/

    public void abastecerGasolina(double litrosGasolina) {
        // Ok, aqui seguindo a ideia de que "o professor ainda não passou try and catch", então vou só fazer um if else mesmo (dois pesos e duas medidas, eu sei, mas retornar um erro parece mais legal ;P)
        if (litrosGasolina <= 0) {
            throw new IllegalArgumentException("Número impossível passado como 'litragem para abastecer'. Favor passar número positivo.");
        }
        else if (litrosGasolina > litrosTanqueGasolina - this.litrosGasolina) {
            System.out.println("Litragem passada para abastecimento maior do que a quantidade necessária para encher o tanque. Ao invés disso, enchendo o tanque com " + (litrosTanqueGasolina - this.litrosGasolina) + " L.");
            this.litrosGasolina = litrosTanqueGasolina;
        }
        else {
            System.out.println("O veículo foi abastecido com " + litrosGasolina + " L.");
            this.litrosGasolina = this.litrosGasolina + litrosGasolina;
        }
    }

    public void consumirGasolina(double litrosGasolina) {
        if (litrosGasolina <= 0) {
            throw new IllegalArgumentException("Número impossível passado como 'litragem para consumir'. Favor passar número positivo.");
        }
        else if (litrosGasolina > this.litrosGasolina) {
            System.out.println("Litragem passada para consumo maior do que a quantidade disponível no tanque. Ao invés disso, consumindo os " + (this.litrosGasolina) + " L restantes.");
            this.litrosGasolina = 0;
        }
        else {
            System.out.println("O veículo teve " + litrosGasolina + " L consumidos de gasolina.");
            this.litrosGasolina = this.litrosGasolina - litrosGasolina;
        }

        if (this.litrosGasolina == 0) {
            System.out.println("Atenção!!! O veículo entrou em pane seca (0 L), quem diria que aquele contador do nível da gasolina serve para alguma coisa, hein? Agora... se vira!");
        }
        else if (this.litrosGasolina <= 5) {
            System.out.println("Atenção! O veículo entrou na reserva (5 L), diriga-se imediatamente para um posto de gasolina!");
        }

    }

    public String getDono() {
        return dono;
    }

    private void setDono(String dono) {
        this.dono = dono;
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

    // função não necessária no nível que temos agora, mas será chamada no constructor mais tarde no curso
    /*private void setLitrosGasolina(double litrosGasolina) {
        this.litrosGasolina = litrosGasolina;
    }*/

    public double getLitrosTanqueGasolina() {
        return litrosTanqueGasolina;
    }

    // função não necessária no nível que temos agora, mas será chamada no constructor mais tarde no curso
    /*private void setLitrosTanqueCombustivel(double litrosTanqueCombustivel) {
        this.litrosTanqueCombustivel = litrosTanqueCombustivel;
    }*/
}
