package Questions;

public class MultiDimensionalArrays3 {
    public static void main(String[] args) {

        /*
        Soru 3) Asagidaki multi dimensional array’lerin ic array’lerinde ayni index’e sahip elemanlarin
toplamini ekrana yazdiran bir program yaziniz.
arr1 = { {1,2}, {3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} }
         */

        int[][] arr1 = {{1, 2}, {3, 4, 5}, {6}};
        int[][] arr2 = {{7, 8, 9}, {10, 11}, {12}};
        int toplam = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i].length <= arr2[i].length) {
                for (int j = 0; j < arr1[i].length; j++) {

                    toplam = arr1[i][j] + arr2[i][j];

                    System.out.println(toplam);
                    toplam = 0;
                }

            }else for (int j = 0; j <arr2[i].length ; j++) {
                toplam = arr1[i][j] + arr2[i][j];

                System.out.println(toplam);
                toplam = 0;
            }


        }
    }
}
