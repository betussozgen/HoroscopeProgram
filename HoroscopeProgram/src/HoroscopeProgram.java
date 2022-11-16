//Kullanıcıdan veri alabilmek için Scanner sınıfını dahil ediyoruz.
import java.util.Scanner;

public class HoroscopeProgram
{
    public static void main(String[] args) {

        //Değişkenleri tanımlıyoruz.
        int month, day;

        String horoscope = " ";

        //hata var mı diye kontrol etmek ve kod daha temiz olsun diye isError kullandık.
        boolean isError = false;

        //Scanner sınıfını tanımladık.
        Scanner input = new Scanner(System.in);

        //Gün ve ay bilgisini kullanıcıdan alıyoruz.
        System.out.print("Enter the month you were born: ");
        month = input.nextInt();

        System.out.print("Enter the year you were born: ");
        day = input.nextInt();

        if(month >= 1 && month <= 12){ // girilecek ayın 1 ile 12 arasında olma şartını koşuyoruz.
            if(month == 1){
                if (day >= 1 && day <= 31){   // Ocak ayı
                    if (day < 22){   // 21 'ine kadar oğlak
                        horoscope = "Goat/oğlak";
                    }else {
                        horoscope = "Aquarius/kova";
                    }
                }else {
                    isError = true;
                }
            } else if (month == 2) {
                if (day >= 1 && day <= 28){
                    if (day < 20){
                        horoscope = "Aquarius/kova";
                    }else {
                        horoscope = "pisces/balık";
                    }
                }else {
                    isError = true;
                }
            } else if (month == 3) {
                if (day >= 1 && day <= 31){
                    if (day < 21){
                        horoscope = "pisces/balık";
                    }else {
                        horoscope = "aires/koç";
                    }
                }else {
                    isError = true;
                }
            }else if (month == 4){
                if (day >= 1 && day <= 30){
                    if (day < 21){
                        horoscope = "aires/koç";

                    }else {
                        horoscope = "taurus/boğa";
                    }
                }else {
                    isError = true;
                }
            } else if (month == 5) {
                if (day >= 1 && day <= 31){
                    if (day < 22){
                        horoscope = "taurus/boğa";

                    }else {
                        horoscope = "gemini/ikizler";
                    }
                }else {
                    isError = true;
                }
            } else if (month == 6) {
                if (day >= 1 && day <= 30){
                    if (day < 23){
                        horoscope = "gemini/ikizler";

                    }else {
                        horoscope = "cancer/yengeç";
                    }
                }else {
                    isError = true;
                }
            } else if (month == 7) {
                if (day >= 1 && day <= 31){
                    if (day < 23){
                        horoscope = "cancer/yengeç";

                    }else {
                        horoscope = "leo/aslan";
                    }
                }else {
                    isError = true;
                }
            } else if (month == 8) {
                if (day >= 1 && day <= 31){
                    if (day < 23){
                        horoscope = "leo/aslan";

                    }else {
                        horoscope = "virgo/başak";
                    }
                }else {
                    isError = true;
                }
            } else if (month == 9) {
                if (day >= 1 && day <= 30){
                    if (day < 23){
                        horoscope = "virgo/başak";

                    }else {
                        horoscope = "libra/terazi";
                    }
                }else {
                    isError = true;
                }
            } else if (month == 10) {
                if (day >= 1 && day <= 31){
                    if (day < 23){
                        horoscope = "libra/terazi";

                    }else {
                        horoscope = "scorpio/akrep";
                    }
                }else {
                    isError = true;
                }
            } else if (month == 11) {
                if (day >= 1 && day <= 30){
                    if (day < 22){
                        horoscope = "scorpio/akrep";

                    }else {
                        horoscope = "sagittarius/yay";
                    }
                }else {
                    isError = true;
                }
            } else if (month == 12) {
                if (day >= 1 && day <= 31){
                    if (day < 22){
                        horoscope = "sagittarius/yay";

                    }else {
                        horoscope = "goat/oğlak";
                    }
                }else {
                    isError = true;
                }
            }
        }else{
            isError = true;
            System.out.println("You entered an incorrect month! Please try again.");
        }

        if (isError) {
            System.out.println("Hatalı bir tarih girdiniz lütfen tekrar deneyin");
        } else {
            System.out.println("Burcunuz : " + horoscope);
        }

    }
}
