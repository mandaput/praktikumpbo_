package TugasPBO;
import java.util.Scanner;


	public class CetakNama {
		private int jmlCetak;
	    private String nama;

	    public void setJmlCetak(int jmlCetak) {
	        this.jmlCetak = jmlCetak;
	    }

	    public int getJmlCetak() {
	        return jmlCetak;
	    }

	    public String getNama() {
	        return nama;
	    }

	    public void setNama(String nama) {
	        this.nama = nama;
	    }

	    public void cetak(String nama) {
	        for (int i = 0; i < jmlCetak; i++) {
	            System.out.println(nama);
	        }
	    }

	    public static void main(String[] args) {
	        CetakNama namaDia = new CetakNama();
	        System.out.println("Masukkan nama anda: ");
	        Scanner input = new Scanner(System.in);
	        namaDia.setNama(input.next());

	        System.out.println("Mau cetak nama berapa kali?");
	        Scanner inputJmlh = new Scanner(System.in);
	        namaDia.setJmlCetak(inputJmlh.nextInt());

	        System.out.println("Nama anda: " + namaDia.getNama());
	        System.out.println("Cetak berapa kali: " + namaDia.getJmlCetak());

	        namaDia.cetak(namaDia.getNama());
	    }
	}
	    
	    


