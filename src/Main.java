import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static java.lang.System.currentTimeMillis;

public class Main {
    public static void main(String[] args) {
        Date date = new Date (1000000000000L);
        System.out.println(date);

        System.out.println ("System.nanoTime() "+System.nanoTime());

        System.out.println ("currentTimeMillis() "+currentTimeMillis());

        Date date1 = new Date();
        System.out.println(date1.getTime());
        //1606942248901
        System.out.println (date1.getTime() - 1606942248901L);

        System.out.println ("2^31= "+(long) Math.pow ( 2,31 ));

        Calendar calendar = Calendar.getInstance();
        int era = calendar.get(Calendar.ERA);//Эра
        int year = calendar.get(Calendar.YEAR);//Год
        int month = calendar.get(Calendar.MONTH);//Месяц Jan = 0, dec = 11
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);//День месяца
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);//День недели
        int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);//Неделя года
        int weekOfMonth = calendar.get(Calendar.WEEK_OF_MONTH);//Неделя месяца

        int hour = calendar.get(Calendar.HOUR);//Час в 12 часовом формате
        int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);//Час в 24 часовом формате
        int minute = calendar.get(Calendar.MINUTE);//Минуты
        int second = calendar.get( Calendar.SECOND);//Секунды
        int millisecond = calendar.get(Calendar.MILLISECOND);//Миллисекунды

        System.out.println (era + "\n" + year + "\n" + month + "\n" + dayOfMonth + "\n" + dayOfWeek + "\n" + weekOfYear
                + "\n" + weekOfMonth + "\n" + hour + "\n" + hourOfDay + "\n" + minute + "\n" + second + "\n" + millisecond);

        SimpleDateFormat dateFormat = new SimpleDateFormat ("dd MMMMMMM yyyy HH:mm:ss");

        System.out.println("Сейчас: " + dateFormat.format(calendar.getTime()));
    }
}