package edu.orangetech.poo;


public class Calculadora implements OperacaoMatematica {
    
    @Override
    public void soma(double num1, double num2) {
        System.out.println("Soma: "+ num1 + num2);
    };

    @Override
    public void subtracao(double num1, double num2) {
        System.out.println("Subtração: "+ (num1 - num2));
    };

    @Override
    public void multiplicacao(double num1, double num2) {
        System.out.println("Multiplicação: "+ (num1 * num2));
    };

    @Override
    public void divisao(double num1, double num2) {
        System.out.println("Divisão: "+ (num1 / num2));
    };

    //É necessário implementar todos os métodos da interface

}
