package vucutKitleEndeksi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		double boy,kilo,endeks;
		System.out.println("Boyunuzu santimetre cinsinden giriniz");
		boy=scanner.nextDouble()/100;
		System.out.println("Kilonuzu kg cinsinden giriniz");
		kilo=scanner.nextDouble();
		endeks=kilo/(boy*boy);
		System.out.println("Vücut Kitle Endeksiniz: " + endeks);
	}

}
