package ba.unsa.etf.rpr;

import java.util.Scanner;
public class Main {
    public static int sumaCifara(int broj){
        int suma = 0;
        while(broj > 0){
            int cifra = broj % 10;
            suma = suma + cifra;
            broj = broj / 10;
        }
        return suma;
    }
    public static void main(String[] args) {
        System.out.println("Unesi cijeli broj n : ");
	    Scanner ulaz = new Scanner(System.in);
	    int n = ulaz.nextInt();

        System.out.println("Brojevi u opsegu od 1 do " + n + " su : ");
        for(int i = 1; i < n; i++){
            int suma = sumaCifara(i);
            if(i % suma == 0) System.out.println(i);
        }
    }
}
