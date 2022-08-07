import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        // değişkenleri tanımlama//
        Scanner input = new Scanner(System.in);
        String adSoyad;
        int quizOrtalama, vizeOrtalama, finalOrtalama;
        double ortalama;
        String sonuc = "";
        String harfNotu = "";

        //veri girişi//
        System.out.print("Lütfen Ad ve Soyadınızı Giriniz : ");
        adSoyad = input.nextLine();
        System.out.print("Lütfen Quiz Ortalamanızı Giriniz : ");
        quizOrtalama = input.nextInt();
        System.out.print("Lütfen Vize Ortalamanızı Giriniz : ");
        vizeOrtalama = input.nextInt();
        System.out.print("Lütfen Final Ortalamanızı Giriniz : ");
        finalOrtalama = input.nextInt();

        //hesaplama//
        ortalama = quizOrtalama * 0.1 + vizeOrtalama * 0.3 + finalOrtalama * 0.6;

        //sonuc1
        if (ortalama >= 85) {
            harfNotu = "AA";
        } else if (ortalama >= 70) {
            harfNotu = "BB";
        } else if (ortalama >= 60) {
            harfNotu = "CC";
        } else if (ortalama >= 45) {
            harfNotu = "DD";
        } else if (ortalama < 45) {
            harfNotu = "FF";
        }

        //sonuc2//
            if (ortalama >= 45) {
                sonuc = "Sınıfı Geçtiniz";
            } else {
                sonuc = "Sınıfta Kaldınız";
            }

            System.out.println("Sayın : " + adSoyad);
            System.out.println("Not Ortalamanız : " + harfNotu);
            System.out.println(sonuc);
        }

    }
