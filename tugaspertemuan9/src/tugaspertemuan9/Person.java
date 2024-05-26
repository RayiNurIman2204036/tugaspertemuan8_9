package tugaspertemuan9;

public class Person {
    String nama;
    String alamat;
    int notelp;
    String email;
    
    Person(String nama,String alamat, int notelp, String email){
    this.nama = nama;
    this.alamat = alamat;
    this.notelp = notelp;
    this.email = email;
    }
    

    @Override
    public String toString(){
        return "  Nama                  : " + this.nama + 
               "\n  Alamat              : " + this.alamat + 
               "\n  Nomor telepon       : " + this.notelp +
               "\n  Email               : " + this.email; 
   }
}
