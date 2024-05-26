package tugaspertemuan8;

import java.util.Scanner;

public class Tugaspertemuan8 {

    public static void main(String[] args) {
        // TODO code application logic here
        Boolean isi;
        String warna;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan 3 ukuran sisi, warna dan status isi dari segitiga: ");
        Double sisi1 = input.nextDouble();
        Double sisi2 = input.nextDouble();
        Double sisi3 = input.nextDouble();
        warna = input.next();
        isi = input.nextBoolean();
        Segitiga segitiga = new Segitiga(sisi1, sisi2, sisi3);
        System.out.println(segitiga.toString());
        System.out.println("Warna: " + warna);
        System.out.println("isi: " + isi);
        System.out.println("Luas segitiga = " + segitiga.getArea());
        System.out.println("Keliling segitiga = " + segitiga.getKeliling());
    }
}
