package tugaspertemuan9;

public class Employee extends Person {
    String kantor;
    int gaji;
    
    MyDate tanggalDipekerjakan;
    Employee(String nama,String alamat, int notelp, String email , String kantor, int gaji, int tanggal , int bulan, int tahun){
        super(nama, alamat, notelp, email);
        this.kantor = kantor;
        this.gaji = gaji;
        tanggalDipekerjakan = new MyDate(tahun,bulan,tanggal);
    }
    
    @Override
    public String toString(){
        return "  Nama                  : " + this.nama + 
               "\n  Alamat              : " + this.alamat + 
               "\n  Nomor telepon       : " + this.notelp +
               "\n  Email               : " + this.email + 
               "\n  Kantor              : " + this.kantor + 
               "\n  Gaji                : " + this.gaji + 
               "\n  Tanggal Dipekerjakan: " + this.tanggalDipekerjakan.toString(); 
   }
}
