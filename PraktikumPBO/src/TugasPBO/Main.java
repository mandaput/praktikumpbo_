package TugasPBO;
import java.util.Scanner;

public class Main {
	 public static void main(String[] args){
	        Scanner scan = new Scanner (System.in);
	        Pgw[]pegawai = new Pgw[3];
	        pegawai[0] = new Pgw();
	        pegawai[1] = new Pgw();
	        pegawai[2] = new Pgw();
	        pegawai[3] = new Pgw();
	        
	        System.out.println("Masukan jumlah pegawai = ");
	        int jml_pegawai = scan.nextInt();
	        
	        System.out.println("Masukan data");
	        for (int i=0; i<jml_pegawai; i++) {
	            System.out.println("Masukan nip : ");
	            String nip = scan.next();
	            pegawai[i].setNIP (nip);
	            
	            System.out.println("Masukan nama : ");
	            String nama = scan.next();
	            pegawai[i].setNama (nama);
	            
	            System.out.println("Masukan Tahun Masuk : ");
	            Integer thnMasuk = scan.nextInt();
	            scan.nextLine();
	            pegawai[1].setthnMasuk (thnMasuk);
	            
	            System.out.println("Masukan Gaji Pokok : ");
	            Double gajiPokok = scan.nextDouble();
	            scan.nextLine();
	            pegawai[i].setGajiPokok (gajiPokok);      
	        }
	         for (int i=0; i<jml_pegawai; i++) {
	             System.out.println("data hasil inputan");
	             System.out.println("Data pegawai ke-"+ (i+1));
	             pegawai[i].getnip();
	             pegawai[i].getnama();
	             pegawai[i].getthnMasuk();
	             pegawai[i].getgajiPokok();
	             pegawai[i].TotalGaji();
	             pegawai[i].input();
	             
	             
	         }
	    }
	}


