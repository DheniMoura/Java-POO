package edu.orange.tech;


public class Main {
    public static void main(String[] args) throws Exception {
        
        Veiculo v1 = new Veiculo("Astra", "xxx-7777", 1999);

        Caminhao cam1 = new Caminhao("1313", "ABC-1234", 1989);
        cam1.setcapacidadeCarga(10);

        cam1.status();

        Carro car1 = new Carro("Kombi", "ADV-4043", 1993);

        Moto m1 = new Moto("Ninja", "DRG-9755", 2015);
    }
}
