package TugasPBO;

public class Pgw {
	private String nip;
    private String nama;
    private Integer thnMasuk;
    private Double gajiPokok;
    Integer lama_kerja;
    Double total_gaji;
    Double tunjangan;
   
public void setNIP (String nip) {
    this.nip=nip;
    }
public void setNama (String nama) {
    this.nama=nama;
    }
public void setthnMasuk (Integer thnMasuk) {
    this.thnMasuk=thnMasuk;
    this.lama_kerja=2020-thnMasuk;
    if (lama_kerja<=5) {
        this.tunjangan=6000000.0;
    }
    else if (lama_kerja >=5 & lama_kerja <=10) {
        this.tunjangan=1000000.0;
    }
    else if(lama_kerja>10) {
        this.tunjangan=1500000.0;
    }
    else {
        System.out.println("Data yang dimasukan eror");
        }
    }
public void setGajiPokok (Double gajipokok) {
    this.gajiPokok=gajipokok;
    }
public String getnip() {
    return this.nip;
    }
public String getnama() {
    return this.nama;
    }
public Integer getthnMasuk() {
    return this.thnMasuk;
    }
public Double getgajiPokok() {
    return this.gajiPokok;
    }
public void TotalGaji(){
    this.total_gaji=this.gajiPokok=this.tunjangan;
    }

public Pgw() {
    
}
public Pgw(String nip, String nama, Integer thnMasuk, Double gajipokok){
    this.nip=nip;
    this.nama=nama;
    this.thnMasuk=thnMasuk;
    this.gajiPokok=gajipokok;
}
public void input() {
    System.out.println("NIP = "+this.getnip());
    System.out.println("nama = "+this.getnama());
    System.out.println("tahun masuk = "+this.getthnMasuk());
    System.out.println("gaji pokok = "+this.getgajiPokok());
    System.out.println("total gaji = "+this.total_gaji);
}
}

