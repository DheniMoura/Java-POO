package edu.orangetech.poo;
public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();

        Carro carro2 = new Carro("Amarelo", "Marea", 48);

        carro1.setCor("Azul");
        carro1.setModeo("Golf");
        carro1.setCapacidadeTanque(59);

        
        System.out.println("\n" + carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorCombustivel(5.8));

        System.out.println("\n" + carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorCombustivel(5.8));
        
    }
}
