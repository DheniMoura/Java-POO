package edu.orange.tech;

public class Caminhao extends Veiculo{
    
    public Caminhao(String modelo, String placa, int ano) {
        super(modelo, placa, ano);
        //TODO Auto-generated constructor stub
    }

    int capacidadeCarga;


    void setcapacidadeCarga(int capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    int getCapadidadeCarga() {
        return this.capacidadeCarga;
    }

    void status() {
        System.out.println("\nDados do caminhão: ");
        System.out.println("Modelo: "+modelo + "\nPlaca: "+placa + "\nAno: "+ano + "\nCapacidade de carga: "+ capacidadeCarga);
    }
}
