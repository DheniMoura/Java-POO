package edu.orange.tech;

public class Carro extends Veiculo {

    public Carro(String modelo, String placa, int ano) {
        super(modelo, placa, ano);
        //TODO Auto-generated constructor stub
    }

    void status() {
        System.out.println("\nDados do carro: ");
        System.out.println("Modelo: "+modelo + "\nPlaca: "+placa + "\nAno: "+ano);
    }
    
}
