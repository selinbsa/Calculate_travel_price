import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean check = true;
        double distance;
        int age;
        int travel_type;


        while (true) {

            System.out.println("Mesafeyi km türünden giriniz: ");
            distance = scanner.nextDouble();

            if (distance > 0) {
                break;
            } else {
                System.out.println("Hatalı Veri Girdiniz! Lütfen pozitif bir değer giriniz.");
            }


        }
        System.out.println("Girilen mesafe " + distance);

        while (true) {

            System.out.println("Yaşınızı giriniz: ");
            age = scanner.nextInt();

            if (age > 0) {
                break;
            } else {
                System.out.println("Hatalı Veri Girdiniz! Lütfen pozitif bir değer giriniz.");
            }

        }
        System.out.println("Girilen yaş " + age);

        while (true) {

            System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş): ");
            travel_type = scanner.nextInt();

            if (travel_type == 1 || travel_type == 2) {
                break;
            } else {
                System.out.println("Hatalı Veri Girdiniz! Lütfen pozitif bir değer giriniz.");
            }

        }
        System.out.println("Yolculuk tipini " + travel_type);

        double unit_price = 0.10;
        double price = distance * unit_price;
        double discount_ratio = 0;

        //Checking discount for age
        if (age < 12) {
            discount_ratio = 0.50;
        } else if (age >= 12 && age <= 24) {
            discount_ratio = 0.10;
        } else if (age > 65) {
            discount_ratio = 0.30;
        }

        //Apply age discount
        double age_discount = price * discount_ratio;
        double total_price = price - age_discount;

        //Checking type of travel
        if (travel_type == 2) {
            total_price *= 0.80; //%20 discount
            total_price *= 2; // round trip times two price

        }

        System.out.println("Toplam tutar = " + total_price + " Tl");

    }
}

