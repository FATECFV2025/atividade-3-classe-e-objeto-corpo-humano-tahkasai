package main.java;

public class CorpoHumano {
    private double Massa;
    private double Volume;
    private double Densidade;
    private double Altura;

    // Construtor
    public CorpoHumano(double massa, double volume, double densidade, double altura) {
        this.Massa = massa;
        this.Volume = volume;
        this.Densidade = densidade;
        this.Altura = altura;
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
    public double Imc(){
        return (Massa /(Altura * Altura));
    }

    // Setter
    public void setMassa(double massa) {
        if (massa > 0){
            Massa = massa;
        } else{
            System.out.println("Massa inválida");
        }
    }
    public void setVolume(double volume) {
        if (volume > 0){
            Volume = volume;
        } else{
            System.out.println("Volume inválido");
        }
    }
    public void setDensidade(double densidade) {
        if (densidade > 0) {
            Densidade = densidade;
        } else {
            System.out.println("Densidade inválida");
        }
    }
    public void setAltura(double altura) {
        if (altura > 0){
            Altura = altura;
        } else{
            System.out.println("Altura inválida");
        }
    }
}
