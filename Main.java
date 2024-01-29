import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculation payment=new Calculation();
        System.out.println("Введите пункт  ' б' или 'г'");
        String paragraph= new Scanner(System.in).nextLine();
        if (paragraph.startsWith("б")){
            System.out.println(
                    payment.resultB());}

        if (paragraph.startsWith("г")){
            System.out.println(
                    payment.resultG());}

        System.out.println("Количество дней " + payment.getCount());
        System.out.println("Итого к выплате подлежит сумма  - " + payment.getTotal() + " руб., которую прошу перечислить на банковские реквизиты:");
    }

}