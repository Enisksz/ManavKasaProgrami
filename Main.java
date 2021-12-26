package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double armutBf=2.14,elmaBf=3.67,domatesBf=1.11, muzBf=0.95,patlicanBf=5,sonuc=0;
    double armut=0,elma=0,domates=0,muz=0,patlican=0;
        Scanner input= new Scanner(System.in);
        System.out.print("Armut kaç kilo: ");
        armut = input.nextDouble();

        System.out.print("Elma kaç kilo: ");
        elma = input.nextDouble();

        System.out.print("Domates kaç kilo: ");
        domates = input.nextDouble();

        System.out.print("Muz kaç kilo: ");
        muz = input.nextDouble();

        System.out.print("Patlıcan kaç kilo: ");
        patlican = input.nextDouble();

        sonuc = armut*armutBf + elma*elmaBf + domates*domatesBf + muz*muzBf + patlican*patlicanBf ;
        System.out.println(sonuc);
    }
}
