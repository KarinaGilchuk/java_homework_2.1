public class Main {
    public static void main(String[] args) {
        int milePrice = 20; // стоимость одной мили
        int ticketPrice = 80; // стоимость билета
        int miles; // количество миль к начислению

        miles = ticketPrice / milePrice;

        if (miles == 1) {
            System.out.println("Вам начислена " + miles + " миля");
        } else if (miles > 1 && miles <= 4) {
            System.out.println("Вам начислено " + miles + " мили");
        } else if (miles >= 5) {
            System.out.println("Вам начислено " + miles + " миль");
        } else if (miles == 0) {
            System.out.println("Билет бесплатный, мы не можем начислить мили");
        }
    }
}