package tugaspertemuan9;

import java.util.Scanner;

public class Tugaspertemuan9 {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        
        System.out.println("[Person]Masukan Nama, Alamat, Nomor telepon, dan Email: ");
        Person Seseorang = new Person(Input.next(), Input.next(), Input.nextInt() ,Input.next());
        
        System.out.println("[Student]Masukan Nama, Alamat, Nomor telepon, Email, dan Status: ");
        Student Siswa = new Student(Input.next(), Input.next(), Input.nextInt() , Input.next(), Input.next());
        
        System.out.println("[Employee]Masukan Nama, Alamat, Nomor telepon, Email, Kantor, Gaji, dan tanggal bekerja dengan format {DD MM YYYY}:");
        Employee Pekerja = new Employee(Input.next(), Input.next(), Input.nextInt() ,Input.next(), 
                                          Input.next() ,Input.nextInt(), Input.nextInt(), Input.nextInt(), Input.nextInt());
        
        System.out.println("[Faculty]Masukan Nama, Alamat, Nomor telepon, Email, Kantor, Gaji, tanggal bekerja dengan format {DD MM YYYY}, Pangkat, dan jam kerja:");
        Faculty Anggota = new Faculty(Input.next(), Input.next(), Input.nextInt() ,Input.next(), 
                                        Input.next() ,Input.nextInt(), Input.nextInt(), Input.nextInt(), Input.nextInt(),Input.next(),Input.nextInt());
        
        System.out.println("[Staff]Masukan Nama, Alamat, Nomor telepon, Email, Kantor, Gaji, tanggal bekerja dengan format {DD MM YYYY}, dan gelar:");
        Staff Staf = new Staff(Input.next(), Input.next(), Input.nextInt() ,Input.next(),
                                  Input.next() ,Input.nextInt(), Input.nextInt(), Input.nextInt(), Input.nextInt(), Input.next());
        
        System.out.println("\nPerson: ");
        System.out.println(Seseorang.toString());
        System.out.println("\nStudent: ");
        System.out.println(Siswa.toString());
        System.out.println("\nEmployee: ");
        System.out.println(Pekerja.toString());
        System.out.println("\nFaculty: ");
        System.out.println(Anggota.toString());
        System.out.println("\nStaff: ");
        System.out.println(Staf.toString());
    }
}
