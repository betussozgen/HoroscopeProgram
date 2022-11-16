//Kullanıcıdan veri alabilmek için Scanner sınıfını dahil ediyoruz.
import java.util.Scanner;

public class HoroscopeProgramWithSwitchCase {
    public static void main(String[] args) {


        //Değişkenleri tanımlıyoruz.
        int month, day;

        String horoscope = "";

        //hata var mı diye kontrol etmek ve kod daha temiz olsun diye isError kullandık.
        boolean isError = false;

        //Scanner sınıfını tanımladık.
        Scanner input = new Scanner(System.in);

        //Gün ve ay bilgisini kullanıcıdan alıyoruz.
        System.out.print("Enter the month you were born: ");
        month = input.nextInt();

        System.out.print("Enter the year you were born: ");
        day = input.nextInt();




        switch (month){
            case 1: //ocak
                if (day >= 1 && day <= 31){   // Ocak ayı
                    if (day < 22){   // 21 'ine kadar oğlak
                        horoscope = "Goat/oğlak";
                    }else {
                        horoscope = "Aquarius/kova";
                    }
                }else {
                    isError = true;
                }
                break;

            case 2: //şubat
                if (day >= 1 && day <= 28){
                    if (day < 20){
                        horoscope = "Aquarius/kova";
                    }else {
                        horoscope = "pisces/balık";
                    }
                }else {
                    isError = true;
                }
                break;

            case 3: //mart
                if (day >= 1 && day <= 31){
                    if (day < 21){
                        horoscope = "pisces/balık";
                    }else {
                        horoscope = "aires/koç";
                    }
                }else {
                    isError = true;
                }break;

            case 4: //nisan
                if (day >= 1 && day <= 30){
                    if (day < 21){
                        horoscope = "aires/koç";

                    }else {
                        horoscope = "taurus/boğa";
                    }
                }else {
                    isError = true;
                }break;

            case 5: //mayıs
                if (day >= 1 && day <= 31){
                    if (day < 22){
                        horoscope = "taurus/boğa";

                    }else {
                        horoscope = "gemini/ikizler";
                    }
                }else {
                    isError = true;
                }break;


            case 6://haziran
                if (day >= 1 && day <= 30){
                    if (day < 23){
                        horoscope = "gemini/ikizler";

                    }else {
                        horoscope = "cancer/yengeç";
                    }
                }else {
                    isError = true;
                }break;

            case 7://temmuz
                if (day >= 1 && day <= 31){
                    if (day < 23){
                        horoscope = "cancer/yengeç";

                    }else {
                        horoscope = "leo/aslan";
                    }
                }else {
                    isError = true;
                }break;


            case 8://ağustos
                if (day >= 1 && day <= 31){
                    if (day < 23){
                        horoscope = "leo/aslan";

                    }else {
                        horoscope = "virgo/başak";
                    }
                }else {
                    isError = true;
                }break;



            case 9://eylül
                if (day >= 1 && day <= 30){
                    if (day < 23){
                        horoscope = "virgo/başak";

                    }else {
                        horoscope = "libra/terazi";
                    }
                }else {
                    isError = true;
                }break;



            case 10://ekim
                if (day >= 1 && day <= 31){
                    if (day < 23){
                        horoscope = "libra/terazi";

                    }else {
                        horoscope = "scorpio/akrep";
                    }
                }else {
                    isError = true;
                }break;


            case 11://kasım
                if (day >= 1 && day <= 30){
                    if (day < 22){
                        horoscope = "scorpio/akrep";

                    }else {
                        horoscope = "sagittarius/yay";
                    }
                }else {
                    isError = true;
                }break;


            case 12://aralık
                if (day >= 1 && day <= 31){
                    if (day < 22){
                        horoscope = "sagittarius/yay";

                    }else {
                        horoscope = "goat/oğlak";
                    }
                }else {
                    isError = true;
                }break;


            default:
                System.out.println("You entered an incorrect month! Please try again.");
        }

        if (isError){
            System.out.println("You entered an incorrect month! Please try again.");
        }else {
            System.out.println("Your horoscope: " + horoscope);
        }













    }

}