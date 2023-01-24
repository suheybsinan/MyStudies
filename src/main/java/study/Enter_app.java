package study;

import java.util.Scanner;

public class Enter_app {


            /*
                Gecerli Username="admin" ve Password="pwd123" dur.
                Kullanicidan username ve password'u alin.
                Username ve password dogru ise console'a "Hesabiniza hosgeldiniz!" yazdirin.
                Username veya password yanlis ise 4 kere "Username ve password'unuzu giriniz" mesaji versin
                Username veya password 4. kere yanlis girilirse "Hesabiniz bloke olmustur" mesaji vererek islemi tamamlayiniz

        Scanner input = new Scanner(System.in);

        int counter = 0;

        do{
            if(counter==4){
                System.out.println("Hesabiniz bloke olmustur!");
                break;
            }

            System.out.println("Username'i giriniz...");
            String username = input.next();

            System.out.println("Password'u giriniz...");
            String password = input.next();

            if(username.equals("admin") && password.equals("pwd123")){
                System.out.println("Hesabiniza hosgeldiniz!");
                break;
            }
            counter++;

        }while(true);


            */


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int counter =4;

        do {
            if (counter==0){
                System.out.println("Your account has been blocked.");
                break;
            }
            System.out.println("Please enter your username.");
            String username = input.next();

            System.out.println("Please enter your password.");
            String password = input.next();

            if (username.equals("admin") && password.equals("pwd123")){
                System.out.println("Welcome to your account.");
                break;
            }else{
                System.out.println("Incorrect entry. Remaining Entry Right : "+(counter-1));
            }
            counter--;


        }while (true);

    }
}
