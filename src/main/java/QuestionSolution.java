import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class QuestionSolution {

    public static void main(String[] args) {

        // Constructors ??????????
        // Static keyword ????????
        // continue key word u icin ornegin bir string te tum harfleri * yap ama s gorursen gec.
        //Example 1: String bir array olusturnuz, 6 eleman ekleyiniz, Yellow'dan onceki elemanlari yazdiriniz..(Peki Yellow birden fazlaysa nasil olacak?)


























        /*  Task: Bir sayinin Armstrong sayi olup olmadigini kontrol eden kodu yaziniz.
            Bilgi: Herhangi bir sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi Armstrong sayidir
            (0, 1, 153, 370, 371, 407)
            153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
            370 = 3*3*3 + 7*7*7 + 0*0*0 = 370


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        String num = input.nextLine();


        int sonuc = 0;
        for (int i = 0; i < num.length(); i++) {

            sonuc += Math.pow(Character.getNumericValue(num.charAt(i)), 3);

        }
        if (Integer.parseInt(num) == sonuc) {
            System.out.println("Armstrong bir sayıdır : " + num);
        } else {
            System.out.println("Armstrong bir sayı değildir : " + num);
        }






        /*
            Kullanicidan bir String aliniz.
            String'de var olan her character'in sayisini ekrana yazdiriniz.
            Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
                   abaa   ==> a=3  b=1



        Scanner scan = new Scanner(System.in);
        System.out.println("Bir string giriniz :");
        String str = scan.nextLine();

        //split()
        String[] arr = str.split(""); //her bir karakteri ayirir

        System.out.println(Arrays.toString(arr));

        //sort()
        Arrays.sort(arr); //siralar
        System.out.println(Arrays.toString(arr));

        //sayac olustur
        int counter = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1].equals(arr[i])) {
                counter++;
            } else {
                System.out.println(arr[i - 1] + " sayisi " + (counter + 1));
                counter = 0;
            }
            if (i == arr.length - 1) { //en sona geldiginde
                System.out.println(arr[i] + " sayisi " + (counter + 1));
            }

        }

         */

    }
}