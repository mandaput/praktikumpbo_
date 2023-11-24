package Praktikum3;
import java.util.Scanner;

public class Latihan {
	public static void main(String args[]) {
//		inisialisasi
		Scanner input = new Scanner(System.in);
		int angka1, angka2, hasil, perulangan, perhitungan;
//		input perulangan
		System.out.println("Masukkan perulangan : ");
		perulangan = input.nextInt();
//		perulangan FOR
		for(int i = 1; i <= perulangan; i++) {
//			input user
			System.out.println("Masukkan Angka 1 : ");
			angka1 = input.nextInt();
			System.out.println("Masukkan Angka 2 : ");
			angka2 = input.nextInt();
			System.out.print("List Perhitungan: "
					+ "\n + : pertambahan"
					+ "\n - : pengurangan"
					+ "\n * : perkalian"
					+ "\n / : pembagian"
					+ "\n Masukan angka perhitungan : "); 
			perhitungan = input.next();
//			kondisi IF
			if(perhitungan == 1) {
				hasil = angka1 + angka2;
				System.out.println("Hasilnya adalah : "+hasil);
			} else if(perhitungan == 2){
				hasil = angka1 - angka2;
				System.out.println("Hasilnya adalah : "+hasil);
			}else if(perhitungan == 3){
				hasil = angka1 * angka2;
				System.out.println("Hasilnya adalah : "+hasil);
			}else if(perhitungan == 4){
				hasil = angka1 / angka2;
				System.out.println("Hasilnya adalah : "+hasil);
			}else{
				System.out.println("Angka perhitungan salah!");
			}		
		}
	}
}
