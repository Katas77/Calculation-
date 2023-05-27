import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Calculation {
    int count = 0;

    public int getCount() {
        return count;
    }

    // 2008 руб пункт б, 1560 руб п.г
    String folloAction1 = "допрос подозреваемого ";
    String folloAction2 = "допрос обвиняемого";
    String folloAction3 = "предъявление постановления о назначении экспертизы  ";
    String folloAction4 = "предъявление заключения эксперта ";
    public String folloAction5 = "уведомление об окончании следственных действий ";
    public String folloAction6 = "ознакомление с материалами уголовного дела ";
    public String folloAction7 = "очная ставка";
    public String folloAction8 = " проверка показаний на месте";
    public String folloAction;
    public int total;
    public int getTotal() {
        return total;
    }

    public String resultB() {
        int a = 2008;
        String all = "";

        while (true) {
            System.out.println("Введите год");
            int year = new Scanner(System.in).nextInt();
            if (year == 0000) {
                return all;}
            count++;
            System.out.println("Введите месяц");
            int month = new Scanner(System.in).nextInt();
            System.out.println("Введите день");
            int day = new Scanner(System.in).nextInt();
            System.out.println("Вид следственного действия");
            int investigAtive = new Scanner(System.in).nextInt();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("EEEE").localizedBy(new Locale("ru"));
            formatter2.format(LocalDate.of(year, month, day).getDayOfWeek());
            String dayER = formatter.format(LocalDate.of(year, month, day));
            String sd = formatter2.format(LocalDate.of(year, month, day).getDayOfWeek());
            switch (investigAtive) {
                case 1 -> folloAction = folloAction1;
                case 2 -> folloAction = folloAction2;
                case 3 -> folloAction = folloAction3;
                case 4 -> folloAction = folloAction4;
                case 5 -> folloAction = folloAction5;
                case 6 -> folloAction = folloAction6;
                case 7 -> folloAction = folloAction7;
                case 8 -> folloAction = folloAction8;
            }
            if (sd.contains("суббота") || sd.contains("воскресенье")) {
                a = 3027;// 3027 пункт б
            }
            else a = 2008;
            total = total + a;
            all = all + dayER + " - " + sd + " - " + folloAction + "  " + a + "  руб." + System.lineSeparator();
        }

    }
    public String resultG() {
        int a = 1560;
        String all = "";

        while (true) {
            System.out.println("Введите год");
            int year = new Scanner(System.in).nextInt();
            if (year == 0000) {
                return all;}
            count++;
            System.out.println("Введите месяц");
            int month = new Scanner(System.in).nextInt();
            System.out.println("Введите день");
            int day = new Scanner(System.in).nextInt();
            System.out.println("Вид следственного действия");
            int investigAtive = new Scanner(System.in).nextInt();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("EEEE").localizedBy(new Locale("ru"));
            formatter2.format(LocalDate.of(year, month, day).getDayOfWeek());
            String dayER = formatter.format(LocalDate.of(year, month, day));
            String sd = formatter2.format(LocalDate.of(year, month, day).getDayOfWeek());
            switch (investigAtive) {
                case 1 -> folloAction = folloAction1;
                case 2 -> folloAction = folloAction2;
                case 3 -> folloAction = folloAction3;
                case 4 -> folloAction = folloAction4;
                case 5 -> folloAction = folloAction5;
                case 6 -> folloAction = folloAction6;
                case 7 -> folloAction = folloAction7;
                case 8 -> folloAction = folloAction8;
            }
            if (sd.contains("суббота") || sd.contains("воскресенье")) {
                a = 2132;// 3027 пункт б
            }
            else a = 1560;
            total = total + a;
            all = all + dayER + " - " + sd + " - " + folloAction + "  " + a + "  руб." + System.lineSeparator();
        }

    }

}
