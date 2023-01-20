package Questions;

import java.util.*;

public class array2 {
    /*
    Given the following arrays:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};


        1. find out the first index number of "Gloves"

        2. find out if "iPad" is contained in the item list

        3. Print the report of each shopping item
            name - price - #ID



            "Eldivenler" in ilk indeks numarasını öğrenin

        2. Öğe listesinde "iPad" olup olmadığını öğrenin

        3. Her alışveriş ürününün raporunu yazdırın
            ad - fiyat - #ID
     */
    public static void main(String[] args) {
        Map<Integer,String> fiyatBilgisi=new HashMap<>();





        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};
        System.out.println("----Urun fiyat bilgileri----");

        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]+"-"+ prices[i]+"-"+"#"+itemIDs[i]);
            fiyatBilgisi.put(itemIDs[i],items[i]+"-"+prices[i] );
        }

        for (Map.Entry<Integer, String> each : fiyatBilgisi.entrySet()) {
            String valuee=each.getValue();
            String[] valueearr=valuee.split("-");
            if (valueearr[0].equalsIgnoreCase("Shoes")){
                valueearr[1]="150";
                each.setValue(valueearr[0]+"-"+ valueearr[1]);

                System.out.println(each.getKey()+" "+ each.getValue());
            }


        }
        System.out.println(fiyatBilgisi);

        Collection<String> karisikk=fiyatBilgisi.values();
        for (String each:karisikk
             ) {
            String value=each;
            String[] valuearr=value.split("-");
            if (valuearr[0].equalsIgnoreCase("Gloves")){
                valuearr[1]="500";

                System.out.println(valuearr[0]+" "+ valuearr[1]);
            }
        }






        System.out.println(fiyatBilgisi);
        String value1=fiyatBilgisi.get(12345);
        String[] valuearr=value1.split("-");
        valuearr[1]="100";
        value1=valuearr[0]+"-"+valuearr[1];
        fiyatBilgisi.put(12345,value1);
        double toplam=0;
        toplam+=Double.parseDouble(valuearr[1]);
        String value2=fiyatBilgisi.get(12348);
        String[] value2arr=value2.split("-");
        toplam+=Double.parseDouble(value2arr[1]);
        System.out.println(fiyatBilgisi.get(12345)+" "+fiyatBilgisi.get(12348)+"\n toplami: "+toplam);







        //Arrays.sort(items);
        int index=Arrays.asList(items).indexOf("Gloves");
        System.out.println(index+" liste yontemi");
        for (int i = 0; i < items.length ; i++) {
            if (items[i].equalsIgnoreCase("Gloves")){
                System.out.println(i);
            }

        }

        System.out.println(Arrays.binarySearch(items,"iPad"));
        System.out.println(Arrays.asList(items).contains("iPad"));
        for (int i = 0; i < items.length ; i++) {
            if (items[i].contains("iPad")){
                System.out.println(i);
            }
        }
    }
}
