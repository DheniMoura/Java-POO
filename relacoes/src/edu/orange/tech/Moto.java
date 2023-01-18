package edu.orange.tech;

public class Moto extends Veiculo{
    public Moto(String modelo, String placa, int ano) {
        
        super(modelo, placa, ano);
        //TODO Auto-generated constructor stub
    }

    String cilindrada;

    void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    String getCilindrada() {
        return this.cilindrada;
    }

    void status() {
        System.out.println("\nDados da moto: ");
        System.out.println("Modelo: "+modelo + "\nPlaca: "+placa + "\nAno: "+ano + "\nCilindrada: "+ cilindrada);
    }
}
