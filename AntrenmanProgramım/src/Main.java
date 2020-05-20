
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
    
    Scanner scanner=new Scanner(System.in);
    System.out.println("Bir idman oluşturunuz");
    String idmanlar="Geçerli Hareketler\n"
                    +"Burpee\n"
                    +"Pushup\n"
                    +"Situp\n"
                    +"Squat";
    System.out.println(idmanlar);
    System.out.println("Bir idman oluşturunuz");
    System.out.println("Burpee Sayisi:");
    int burpee=scanner.nextInt();
    System.out.println("Pushup Sayisi:");
    int pushup=scanner.nextInt();
    System.out.println("Situp Sayisi:");
    int situp=scanner.nextInt();
    System.out.println("Squat Sayisi:");
    int squat=scanner.nextInt();
    scanner.nextLine();
    
    antrenman idman=new antrenman(burpee,pushup,situp,squat);
    while(idman.idmanBittiMi()==false){
        System.out.println("Hareket turu(burpee,pushup,situp,squat)");
        String tur=scanner.nextLine();
        System.out.println("Hareket Sayısı:");
        int sayi=scanner.nextInt();
        scanner.nextLine();
        idman.hareketYap(tur, sayi);
    }
    }
}
