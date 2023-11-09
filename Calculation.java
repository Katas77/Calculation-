import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Calculation {
    List<Payment> paymentList = new ArrayList<>();

    int count = 0;
    public String folloAction;
    public int total;

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
    public String folloAction9 = " составление протокола задержания  ";
    public String folloAction10 = " рассмотрение ходатайство следователя об избрании меры пресечения";
    public String folloAction11 = " рассмотрение ходатайство следователя о продлении срока содержания под стражей";
    public String folloAction12 = " изъятия предметов, имеющих значение для уголовного дела, выемка. ";


    public int getTotal() {
        return total;
    }

    public String resultB() {
        while (true) {
            System.out.println("Введите дату");
            String date = new Scanner(System.in).nextLine();
            if (date.startsWith("000")) {
                return alla();
            }
            count++;
            String[] arrayDate = date.split("");
            String yearSt = "20" + arrayDate[4] + arrayDate[5];
            int year = Integer.parseInt(yearSt);
            String monthSt = arrayDate[2] + arrayDate[3];
            int month = Integer.parseInt(monthSt);
            String daySt = arrayDate[0] + arrayDate[1];
            int day = Integer.parseInt(daySt);
            System.out.println("Вид следственного действия");
            int investigAtive = new Scanner(System.in).nextInt();
            switch (investigAtive) {
                case 1 -> folloAction = folloAction1;
                case 2 -> folloAction = folloAction2;
                case 3 -> folloAction = folloAction3;
                case 4 -> folloAction = folloAction4;
                case 5 -> folloAction = folloAction5;
                case 6 -> folloAction = folloAction6;
                case 7 -> folloAction = folloAction7;
                case 8 -> folloAction = folloAction8;
                case 9 -> folloAction = folloAction9;
                case 10 -> folloAction = folloAction10;
                case 11 -> folloAction = folloAction11;
                case 12 -> folloAction = folloAction12;
            }
            Payment payment = new Payment(folloAction, LocalDate.of(year, month, day));
            paymentList.add(payment);


        }
    }

    String alla() {
        String all = "";
        int a = 2118;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("EEEE").localizedBy(new Locale("ru"));
        Collections.sort(paymentList, Comparator.comparing(Payment::getDate));
        for (Payment payment : paymentList) {
            String dayER = formatter.format(payment.getDate());
            String sd = formatter2.format(payment.getDate().getDayOfWeek());
            if (sd.contains("суббота") || sd.contains("воскресенье")) {
                a = 3193;// 3193 пункт б
            } else a = 2118;
            total = total + a;
            all = all + dayER + " - " + sd + " - " + payment.getAction()+ "  " + a + "  руб." + System.lineSeparator();
        }

        return all;
    }


    public String resultG() {
        while (true) {
            System.out.println("Введите дату");
            String date = new Scanner(System.in).nextLine();
            if (date.startsWith("000")) {
                return alla2();
            }
            count++;
            String[] arrayDate = date.split("");
            String yearSt = "20" + arrayDate[4] + arrayDate[5];
            int year = Integer.parseInt(yearSt);
            String monthSt = arrayDate[2] + arrayDate[3];
            int month = Integer.parseInt(monthSt);
            String daySt = arrayDate[0] + arrayDate[1];
            int day = Integer.parseInt(daySt);
            System.out.println("Вид следственного действия");
            int investigAtive = new Scanner(System.in).nextInt();
            switch (investigAtive) {
                case 1 -> folloAction = folloAction1;
                case 2 -> folloAction = folloAction2;
                case 3 -> folloAction = folloAction3;
                case 4 -> folloAction = folloAction4;
                case 5 -> folloAction = folloAction5;
                case 6 -> folloAction = folloAction6;
                case 7 -> folloAction = folloAction7;
                case 8 -> folloAction = folloAction8;
                case 9 -> folloAction = folloAction9;
                case 10 -> folloAction = folloAction10;
                case 11 -> folloAction = folloAction11;
                case 12 -> folloAction = folloAction12;
            }
            Payment payment = new Payment(folloAction, LocalDate.of(year, month, day));
            paymentList.add(payment);


        }
    }

    String alla2() {
        String all = "";
        int a = 1646;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("EEEE").localizedBy(new Locale("ru"));
        Collections.sort(paymentList, Comparator.comparing(Payment::getDate));
        for (Payment payment : paymentList) {
            String dayER = formatter.format(payment.getDate());
            String sd = formatter2.format(payment.getDate().getDayOfWeek());
            if (sd.contains("суббота") || sd.contains("воскресенье")) {
                a = 2249;// 2249 пункт г
            } else a = 1646;
            total = total + a;
            all = all + dayER + " - " + sd + " - " + payment.getAction()+ "  " + a + "  руб." + System.lineSeparator();
        }

        return all;
    }

}
