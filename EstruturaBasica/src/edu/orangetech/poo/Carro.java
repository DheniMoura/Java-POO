package edu.orangetech.poo;

public class Carro {
    
    String cor;
    String modelo;
    int capacidadeTanque;

    //Contrutor mais simples, cria o objeto "vazio"
    Carro(){

    }

    //Construtor com parâmetros
    Carro(String cor, String modelo, int capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    void setCor(String cor) {
        this.cor = cor;
    }

    String getCor() {
        return this.cor;
    }

    void setModeo(String modelo) {
        this.modelo = modelo;
    }

    String getModelo() {
        return this.modelo;
    }

    void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    int getCapacidadeTanque() {
        return this.capacidadeTanque;
    }

    double totalValorCombustivel(double valorCombustivel) {
        return this.capacidadeTanque * valorCombustivel;
    }

}
