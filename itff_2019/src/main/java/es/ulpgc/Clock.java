package es.ulpgc;

import java.util.Random;

public class Clock implements Sensor{

    private Random random;

    public Clock(){
        this.random = new Random(System.currentTimeMillis());
    }

    @Override
    public Object getValue() {
        return this.random.nextInt(86400);
    }
}
