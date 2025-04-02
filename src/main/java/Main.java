package main.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        double SuaMassa = scanner.nextDouble();
        double SeuVolume = scanner.nextDouble();
        double SuaDensidade = scanner.nextDouble();

        CorpoHumano corpo = new CorpoHumano(SuaMassa,SeuVolume,SuaDensidade);

        System.out.println("Resultado");
        System.out.println("-------------------------");
        System.out.println("Sua massa: "+corpo.getMassa());
        System.out.println("Seu volume: "+corpo.getVolume());
        System.out.println("Sua densidade: "+corpo.getDensidade());
    }
}
