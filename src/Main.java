import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
String islemler = "İşlemler \n" +
        "1. Kare Alan Hesapla \n"+
        "2. Üçgen Alan Hesapla\n"+
        "3. Daire Alan Hesapla*n"+
        "4. Çıkış için q gir.";
while (true) {
    System.out.println(islemler);
    System.out.println("Hangi şeklin alanını hesaplamak istersin");
    String sekil_turu = scanner.nextLine();
    sekil sekil = null;
    if (sekil_turu.equals("q")) {
        System.out.println("sistem kapatılıyor.");
        break;
    }
    if (sekil_turu.equals("1")) {
        System.out.println("Karenin kenarı ?");
        int kenar = scanner.nextInt();
        scanner.nextLine();
        sekil = new kare("Kare1", kenar);
        sekil.alanHesapla();

    }
    else if (sekil_turu.equals("2")) {
        System.out.println("Kenar 1 : ");
        int kenar1 = scanner.nextInt();
        System.out.println("Kenar 2 : ");
        int kenar2 = scanner.nextInt();
        System.out.println("Kenar 3 : ");
        int kenar3 = scanner.nextInt();
        sekil = new ucgen("ucgen1", kenar1, kenar2, kenar3);
        sekil.alanHesapla();
    }
    else if (sekil_turu.equals("3")) {
        System.out.println("Yarı çap kaç:");
        int yaricap = scanner.nextInt();
        sekil = new daire("daire1", yaricap);
        sekil.alanHesapla();
    }
}
    }
}