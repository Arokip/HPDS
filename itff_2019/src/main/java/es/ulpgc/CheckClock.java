package es.ulpgc;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CheckClock implements InvocationHandler {

    private Clock clock;

    public CheckClock(Clock clock) {
        this.clock = clock;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Integer result = (Integer) method.invoke(clock, args);
        System.out.println("### El valor de getValue: " + result);
        return result;
    }

    public static Sensor getCheckClock(Object clock) {
        return (Sensor) java.lang.reflect.Proxy.newProxyInstance(clock.getClass().getClassLoader(),
                new Class[]{Sensor.class},
                new CheckClock((Clock)clock));
    }
}
