package tugaspertemuan9;

public class Student extends Person{
   final String status;
   
   Student(String nama,String alamat, int notelp, String email , String status){
   super(nama,alamat,notelp,email);
   this.status = status;
   }
   
   @Override
    public String toString(){
        return "  Nama              : " + this.nama + 
               "\n  Alamat              : " + this.alamat + 
               "\n  Nomor telepon       : " + this.notelp +
               "\n  Email               : " + this.email +
               "\n  Status              : " + this.status; 
   }
}
