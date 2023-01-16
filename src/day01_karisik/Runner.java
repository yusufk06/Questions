package day01_karisik;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("================================");
        System.out.println("OGRENCI VE OGRETMEN YONETIM PANELI");
        System.out.println("================================");
        islem1();
    }
    public static void islem1() {
        System.out.println("ISLEMINIZI SECINIZ\n1- OGRENCI ISLEMLERI\n2- OGRETMEN ISLEMLERI\nQ- CIKIS");
        try {
            int islem=scan.nextInt();
            switch (islem){
                case 1:{
                    Menu.ogrenciIslemler();
                    break;
                }
                case 2:{
                    Menu.ogretmenIslemler();
                    break;
                }
                default:{
                    System.out.println("yanlış secim");
                    islem1();
                }
            }
        } catch (InputMismatchException e) {
            String cikis=scan.nextLine();
            if (cikis.equalsIgnoreCase("q")){
                System.out.println("iyi günler");
                System.exit(0);
            }else{
                System.out.println("yanlis secim");
                islem1();
            }
        }
    }
}
