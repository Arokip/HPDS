package es.ulpgc;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Clock clock = new Clock();
        Sensor checkClock = CheckClock.getCheckClock(clock);


        System.out.println("El valor de getValue: " + clock.getValue());
        System.out.println("El valor de getValue: " + checkClock.getValue());
        System.out.println("El valor de getValue: " + clock.getValue());
        System.out.println("El valor de getValue: " + checkClock.getValue());
        System.out.println("El valor de getValue: " + clock.getValue());
        System.out.println("El valor de getValue: " + checkClock.getValue());
    }
}
