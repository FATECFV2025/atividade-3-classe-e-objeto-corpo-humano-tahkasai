package main.java;

public class CorpoHumano {
    private double Massa;
    private double Volume;
    private double Densidade;
    private double Altura;
    private double Peso;

    // Construtor
    public CorpoHumano(double massa, double volume, double densidade, double altura, double peso) {
        this.Massa = massa;
        this.Volume = volume;
        this.Densidade = densidade;
        this.Altura = altura;
        this.Peso = peso;
    }

    // Getter
    public double getMassa() {
        return Massa;
    }
    public double getVolume() {
        return Volume;
    }
    public double getDensidade() {
        return Densidade;
    }
    public double getAltura() {
        return Altura;
    }
    public double getPeso(){
        return Peso;
    }
    public double Imc(){
        return (Peso /(Altura * Altura));
    }

}
