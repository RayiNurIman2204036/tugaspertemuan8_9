package tugaspertemuan9;

public class Faculty extends Employee {
    int jamKerja;
    String pangkat;

    public Faculty(String nama, String alamat, int notelp, String email, String kantor, int gaji, int tanggal, int bulan, int tahun, String Pangkat, int jamKerja){
        super(nama, alamat, notelp, email, kantor, gaji, tanggal, bulan, tahun);
        this.jamKerja = jamKerja;    
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
               "\n  Jam Kerja           : " + this.jamKerja + 
               "\n  Pangkat             : " + this.pangkat; 
   }
}
