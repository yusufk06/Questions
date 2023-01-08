package Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class soru1 {
    public static void main(String[] args) {

        /*
        classmates adlı bir dizi oluşturun ve sınıf arkadaşlarınızın 10 tam adını saklayın
            her sınıf arkadaşının baş harflerini ayrı satırlara yazdırin
         */

        List<String> classMate= new ArrayList<>(Arrays.asList("Ali", "Ayse", "Fatma", "Yunus", "Selim","Eda","Emre","Gulben","Baran","Mertcan"));
        String ilkHarfler="";

        for (int i = 0; i <classMate.size() ; i++) {
            ilkHarfler+=classMate.get(i).toString().substring(0,1);

        }
        System.out.print(ilkHarfler + "   ");
    }
}
