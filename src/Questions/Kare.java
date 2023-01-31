package Questions;

import java.util.Scanner;

public class Kare implements islemler1 {
    Scanner scan=new Scanner(System.in);
    int kenar=0;
    @Override
    public void alan() {
        System.out.println("karenni bir kenar uzunluğunu giriniz");
        kenar=scan.nextInt();
        System.out.println("ALAN ="+(kenar*kenar));
    }

    @Override
    public void cevre() {
        System.out.println("cevre ="+(kenar*4));
    }
}
