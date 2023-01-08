package Questions;

import java.util.Arrays;

public class MultiDimensionalArrays4 {
    /*

    Soru4) Asagidaki multidimensional array’in ic array’lerindeki tum elemanlarin toplamini birer
birer bulan ve herbir sonucu yeni bir array’in elemani yapan ve yeni array’I ekrana yazdiran bir
program yaziniz.
Ornek;{{1,2,3},{4,5},{6,7}}==>1+2+3=6 4+5=9 6+7=13==>output:{6,…
     */
    public static void main(String[] args) {
        int[][]arr={{1,2,3},{4,5},{6,7}};
        int[] arr2=new int[arr.length];
        int sayac=0;
        int toplam=0;
        for (int[] each:arr) {
            for (int each1:each) {
                toplam+=each1;

                arr2[sayac]=toplam;




                }
            sayac++;
                toplam=0;
            }
        System.out.println(Arrays.toString(arr2));
        }

    }





