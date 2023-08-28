import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculation сalculation=new Calculation();
        System.out.println("Введите пункт  ' б' или 'г'");
        String punct= new Scanner(System.in).nextLine();
        if (punct.startsWith("б")){
            System.out.println(
                    сalculation.resultB());}

        if (punct.startsWith("г")){
            System.out.println(
                    сalculation.resultG());}

        System.out.println("Количество дней " + сalculation.getCount());
        System.out.println("Итого к выплате подлежит сумма  - " + сalculation.getTotal() + " руб, которую прошу перечислить на банковские реквизиты:");
    }

}