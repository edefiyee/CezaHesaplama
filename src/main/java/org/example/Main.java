package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //ÖDEV3

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("HIZ SINIRI 90KM/S");
        System.out.println("hızınızı giriniz:");
        int hiz = scanner2.nextInt();
        int ceza;
        System.out.println("hızınız:" + hiz + "km/s");
        if (hiz > 90 && hiz < 110) {
            ceza = 1;
        } else if (hiz > 110 && hiz < 130) {
            ceza = 2;
        } else if (hiz > 130) {
            ceza = 3;
        } else {
            ceza = 4;
        }
        switch (ceza) {
            case 1:
                System.out.println("1000TL PARA CEZASI");
                break;
            case 2:
                System.out.println("2000TL PARA CEZASI");
                break;
            case 3:
                System.out.println("EHLİYETİNİZE EL KONULDU");
                break;
        }
    }
}
