package vucutKitleEndeksi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		double heigth,weigth,index;
		System.out.println("Boyunuzu santimetre cinsinden giriniz");
		heigth=scanner.nextDouble()/100;
		System.out.println("Kilonuzu kg cinsinden giriniz");
		weigth=scanner.nextDouble();
		indexs=weigth/(heigth*heigth);
		System.out.println("Vücut Kitle Endeksiniz: " + index);
	}

}
