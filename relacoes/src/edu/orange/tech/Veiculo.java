package edu.orange.tech;

public class Veiculo {
    
    String modelo;
    String placa;
    int ano;

    //Construtor
    public Veiculo(String modelo, String placa, int ano) {
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        System.out.println("\nNovo veículo: ");
        System.out.println("Modelo: "+modelo + "\nPlaca: "+placa + "\nAno: "+ano);
    }


    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    String getModelo() {
        return this.modelo;
    }

    void setPlaca(String placa) {
        this.placa = placa;
    }

    String getPlaca() {
        return this.placa;
    }

    void setAno(int ano) {
        this.ano = ano;
    }

    int getAno() {
        return this.ano;
    }

}
