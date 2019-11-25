package ulpgc.hpds.MyLogApi;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Logger {
    private String nameFile = "MyLogApi.log";
    private String nameClass;

    private Calendar calendar;

    public Logger(String nameClass) {
        this.nameClass = nameClass;

        this.calendar = new GregorianCalendar();
    }

    public void infoLog(String message) {
        System.out.println(date_hour() + "INFO >> " + nameClass + " : " + message);
    }

    public void errorLog(String message) {
        System.out.println(date_hour() + "ERROR >> " + nameClass + " : " + message);
    }

    private String date_hour() {
        return new String(
                calendar.get(Calendar.YEAR) + "/" +
                        calendar.get(Calendar.MONTH) + "/" +
                        calendar.get(Calendar.DAY_OF_MONTH) + " " +

                        calendar.get(Calendar.HOUR) + ":" +
                        calendar.get(Calendar.MINUTE)
        );
    }
}
