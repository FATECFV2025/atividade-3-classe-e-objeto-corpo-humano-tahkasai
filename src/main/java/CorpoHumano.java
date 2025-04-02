package main.java;

public class CorpoHumano {
    private double Massa;
    private double Volume;
    private double Densidade;

    // Construtor
    public CorpoHumano(double massa, double volume, double densidade) {
        Massa = massa;
        Volume = volume;
        Densidade = volume;
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
            System.out.println("Volume inválida");
        }
    }
    public void setDensidade(double densidade) {
        if (densidade > 0){
            Densidade = densidade;
        } else{
            System.out.println("Densidade inválida");
        }
    }
}
