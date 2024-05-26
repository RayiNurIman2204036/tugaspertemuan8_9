package tugaspertemuan9;

public class Staff extends Employee {
    String gelar;
    public Staff(String nama, String alamat, int notelp, String email, String kantor, int gaji, int tanggal, int bulan, int tahun ,String gelar) {
        super(nama, alamat, notelp, email, kantor, gaji, tanggal, bulan, tahun);
        this.gelar = gelar;
        
    
    }
    @Override
    public String toString(){
        return "  Nama              : " + this.nama + 
               "\n  Alamat              : " + this.alamat + 
               "\n  Nomor telepon       : " + this.notelp +
               "\n  Email               : " + this.email + 
               "\n  Kantor              : " + this.kantor + 
               "\n  Gaji                : " + this.gaji + 
               "\n  Tanggal Dipekerjakan: " + this.tanggalDipekerjakan.toString() +
               "\n  Gelar               : " + this.gelar ; 
    }
}
