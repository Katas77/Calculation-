import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Calculation {
    List<PaymentDay> paymentList = new ArrayList<>();
    public int count = 0;
    public String followupAction;
    public int total;

    public int getCount() {
        return count;
    }

    public String followupAction1 = "допрос подозреваемого ";
    public String followupAction2 = "допрос обвиняемого";
    public String followupAction3 = "предъявление постановления о назначении экспертизы  ";
    public String followupAction4 = "предъявление заключения эксперта ";
    public String followupAction5 = "уведомление об окончании следственных действий ";
    public String followupAction6 = "ознакомление с материалами уголовного дела ";
    public String followupAction7 = "очная ставка";
    public String followupAction8 = " проверка показаний на месте";
    public String followupAction9 = " составление протокола задержания  ";
    public String followupAction10 = " рассмотрение ходатайство следователя об избрании меры пресечения";
    public String followupAction11 = " рассмотрение ходатайство следователя о продлении срока содержания под стражей";
    public String followupAction12 = " изъятия предметов, имеющих значение для уголовного дела, выемка. ";


    public int getTotal() {
        return total;
    }

    public String resultB() {
        while (true) {
            System.out.println("Введите дату в формате ДДММГГ");
            String date = new Scanner(System.in).nextLine();
            if (date.startsWith("00")) {
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
                case 1 -> followupAction = followupAction1;
                case 2 -> followupAction = followupAction2;
                case 3 -> followupAction = followupAction3;
                case 4 -> followupAction = followupAction4;
                case 5 -> followupAction = followupAction5;
                case 6 -> followupAction = followupAction6;
                case 7 -> followupAction = followupAction7;
                case 8 -> followupAction = followupAction8;
                case 9 -> followupAction = followupAction9;
                case 10 -> followupAction = followupAction10;
                case 11 -> followupAction = followupAction11;
                case 12 -> followupAction = followupAction12;
            }
            PaymentDay payment = new PaymentDay(followupAction, LocalDate.of(year, month, day));
            paymentList.add(payment);


        }
    }

    String alla() {
        String all = "";
        int a = 2118;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("EEEE").localizedBy(new Locale("ru"));
        paymentList.sort(Comparator.comparing(PaymentDay::getDate));
        for (PaymentDay payment : paymentList) {
            String dayER = formatter.format(payment.getDate());
            String sd = formatter2.format(payment.getDate().getDayOfWeek());
            if (sd.contains("суббота") || sd.contains("воскресенье")) {
                a = 3193;// 3193 пункт б
            } else a = 2118;
            total = total + a;
            all = all + dayER + " - " + sd + " - " + payment.getAction() + "  " + a + "  руб." + System.lineSeparator();
        }

        return all;
    }


    public String resultG() {
        while (true) {
            System.out.println("Введите дату в формате ДДММГГ");
            String date = new Scanner(System.in).nextLine();
            if (date.startsWith("00")) {
                return alla2();
            }
            if (date.length()!=6)
            {resultG();}
            count++;
            String[] arrayDate = date.split("");
            String yearSt = "20" + arrayDate[4] + arrayDate[5];
            int year = Integer.parseInt(yearSt);
            String monthSt = arrayDate[2] + arrayDate[3];
            int month = Integer.parseInt(monthSt);
            String daySt = arrayDate[0] + arrayDate[1];
            int day = Integer.parseInt(daySt);
            System.out.println("Вид следственного действия");
            int active = new Scanner(System.in).nextInt();
            switch (active) {
                case 1 -> followupAction = followupAction1;
                case 2 -> followupAction = followupAction2;
                case 3 -> followupAction = followupAction3;
                case 4 -> followupAction = followupAction4;
                case 5 -> followupAction = followupAction5;
                case 6 -> followupAction = followupAction6;
                case 7 -> followupAction = followupAction7;
                case 8 -> followupAction = followupAction8;
                case 9 -> followupAction = followupAction9;
                case 10 -> followupAction = followupAction10;
                case 11 -> followupAction = followupAction11;
                case 12 -> followupAction = followupAction12;
            }
            PaymentDay payment = new PaymentDay(followupAction, LocalDate.of(year, month, day));
            paymentList.add(payment);


        }
    }

    String alla2() {
        String all = "";
        int a = 1646;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("EEEE").localizedBy(new Locale("ru"));
        paymentList.sort(Comparator.comparing(PaymentDay::getDate));
        for (PaymentDay payment : paymentList) {
            String dayER = formatter.format(payment.getDate());
            String sd = formatter2.format(payment.getDate().getDayOfWeek());
            if (sd.contains("суббота") || sd.contains("воскресенье")) {
                a = 2249;// 2249 пункт г
            } else a = 1646;
            total = total + a;
            all = all + dayER + " - " + sd + " - " + payment.getAction() + "  " + a + "  руб." + System.lineSeparator();
        }

        return all;
    }
//а) по делам, рассматриваемым судом с участием присяжных заседателей; по делам, рассматриваемым в Верховном Суде Российской Федерации; по делам, отнесенным к подсудности кассационного суда общей юрисдикции, апелляционного суда общей юрисдикции, кассационного военного суда, апелляционного военного суда, верховного суда республики, краевого или областного суда, суда города федерального значения, суда автономной области, суда автономного округа, окружного (флотского) военного суда:
//
//с 2019 года за один день участия в ночное время - 2150 рублей, за один день участия, являющийся нерабочим праздничным днем или выходным днем, включая ночное время, - 2750 рублей, в остальное время за один день участия - 1550 рублей;
//
//с 2020 года за один день участия в ночное время - 2500 рублей, за один день участия, являющийся нерабочим праздничным днем или выходным днем, включая ночное время, - 3100 рублей, в остальное время за один день участия - 1900 рублей;
//
//с 2021 года за один день участия в ночное время - 3025 рублей, за один день участия, являющийся нерабочим праздничным днем или выходным днем, включая ночное время, - 3350 рублей, в остальное время за один день участия - 2150 рублей;
//
//с 1 октября 2022 г. за один день участия в ночное время - 3146 рублей, за один день участия, являющийся нерабочим праздничным днем или выходным днем, включая ночное время, - 3484 рубля, в остальное время за один день участия - 2236 рублей;
//
//с 1 октября 2023 г. за один день участия в ночное время - 3319 рублей, за один день участия, являющийся нерабочим праздничным днем или выходным днем, включая ночное время, - 3676 рублей, в остальное время за один день участия - 2359 рублей;
//
//Подпункт "б" изменен с 7 октября 2023 г. - Постановление Правительства России от 27 сентября 2023 г. N 1568
//
//См. предыдущую редакцию
//





//б) по делам, в отношении 3 или более подозреваемых, обвиняемых (подсудимых); в случае предъявления обвинения по 3 или более инкриминируемым деяниям; по делам, объем материалов по которым составляет более 3 томов:
//
//с 2019 года за один день участия в ночное время - 1825 рублей, за один день участия, являющийся нерабочим праздничным днем или выходным днем, включая ночное время, - 2310 рублей, в остальное время за один день участия - 1330 рублей;
//
//с 2020 года за один день участия в ночное время - 2175 рублей, за один день участия, являющийся нерабочим праздничным днем или выходным днем, включая ночное время, - 2660 рублей, в остальное время за один день участия - 1680 рублей;
//
//с 2021 года за один день участия в ночное время - 2605 рублей, за один день участия, являющийся нерабочим праздничным днем или выходным днем, включая ночное время, - 2910 рублей, в остальное время за один день участия - 1930 рублей;
//
//с 1 октября 2022 г. за один день участия в ночное время - 2710 рублей, за один день участия, являющийся нерабочим праздничным днем или выходным днем, включая ночное время, - 3027 рублей, в остальное время за один день участия - 2008 рублей;
//


//с 1 октября 2023 г. за один день участия в ночное время - 2859 рублей, за один день участия, являющийся нерабочим праздничным днем или выходным днем, включая ночное время, - 3193 рубля, в остальное время за один день участия - 2118 рублей;
//
//Подпункт "в" изменен с 7 октября 2023 г. - Постановление Правительства России от 27 сентября 2023 г. N 1568
//
//См. предыдущую редакцию
//





//в) по делам, рассматриваемым в закрытых судебных заседаниях или вне зданий соответствующих судов; по делам, в отношении несовершеннолетних подозреваемых, обвиняемых либо с участием несовершеннолетних потерпевших, не достигших возраста 16 лет; по делам, в отношении подозреваемых, обвиняемых (подсудимых), не владеющих языком, на котором ведется судопроизводство; по делам, в отношении подозреваемых, обвиняемых (подсудимых), которые в силу физических или психических недостатков не могут самостоятельно осуществлять свое право на защиту:
//
//с 2019 года за один день участия в ночное время - 1500 рублей, за один день участия, являющийся нерабочим праздничным днем или выходным днем, включая ночное время, - 1880 рублей, в остальное время за один день участия - 1115 рублей;
//
//с 2020 года за один день участия в ночное время - 1850 рублей, за один день участия, являющийся нерабочим праздничным днем или выходным днем, включая ночное время, - 2230 рублей, в остальное время за один день участия - 1465 рублей;
//
//с 2021 года за один день участия в ночное время - 2190 рублей, за один день участия, являющийся нерабочим праздничным днем или выходным днем, включая ночное время, - 2480 рублей, в остальное время за один день участия - 1715 рублей;
//
//с 1 октября 2022 г. за один день участия в ночное время - 2278 рублей, за один день участия, являющийся нерабочим праздничным днем или выходным днем, включая ночное время, - 2580 рублей, в остальное время за один день участия - 1784 рубля;
//
//с 1 октября 2023 г. за один день участия в ночное время - 2403 рубля, за один день участия, являющийся нерабочим праздничным днем или выходным днем, включая ночное время, - 2722 рубля, в остальное время за один день участия - 1882 рубля;
//
//Подпункт "г" изменен с 7 октября 2023 г. - Постановление Правительства России от 27 сентября 2023 г. N 1568
//
//См. предыдущую редакцию






//
//г) в иных случаях, не предусмотренных подпунктами "а" - "в" настоящего пункта:
//
//с 2019 года за один день участия в ночное время - 1175 рублей, за один день участия, являющийся нерабочим праздничным днем или выходным днем, включая ночное время, - 1450 рублей, в остальное время за один день участия - 900 рублей;
//
//с 2020 года за один день участия в ночное время - 1525 рублей, за один день участия, являющийся нерабочим праздничным днем или выходным днем, включая ночное время, - 1800 рублей, в остальное время за один день участия - 1250 рублей;
//
//с 2021 года за один день участия в ночное время - 1775 рублей, за один день участия, являющийся нерабочим праздничным днем или выходным днем, включая ночное время, - 2050 рублей, в остальное время за один день участия - 1500 рублей;
//
//с 1 октября 2022 г. за один день участия в ночное время - 1846 рублей, за один день участия, являющийся нерабочим праздничным днем или выходным днем, включая ночное время, - 2132 рубля, в остальное время за один день участия - 1560 рублей;
//
//с 1 октября 2023 г. за один день участия в ночное время - 1948 рублей, за один день участия, являющийся нерабочим праздничным днем или выходным днем, включая ночное время, - 2249 рублей, в остальное время за один день участия - 1646 рублей.
}
