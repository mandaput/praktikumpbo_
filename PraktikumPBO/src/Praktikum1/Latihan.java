package Praktikum1;
import java.util.Scanner;
public class Latihan {
	public static void main(String args[]) {
//		inisialisasi scanner input
		Scanner Input = new Scanner(System.in);
		String namaDepan, namaBelakang, fullNama, npm;
		System.out.println("Nama depan: ");
		namaDepan = Input.next();
		System.out.println("Nama belakang: ");
		namaBelakang =Input.next();
		fullNama = namaDepan + " " + namaBelakang;
		
		System.out.println("Npm: ");
		npm = Input.next();
		
		System.out.println("\nNama : "+fullNama);
		System.out.println("Npm : "+npm +"\n");
//		inisialisasi variable
		int angka1, angka2, hasil;

//		user input
		System.out.println("Masukan angka 1 : ");
		angka1 = Input.nextInt();
		
		System.out.println("Masukan angka 2 : ");
		angka2 = Input.nextInt();
//		perhitungan hasil
		hasil = angka1 + angka2;
//		output
		System.out.println("Hasilnya : "+hasil);
		
	}
}
