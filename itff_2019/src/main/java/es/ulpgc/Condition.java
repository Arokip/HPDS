package es.ulpgc;

public class Condition {
    private int ID;
    private Object threshold;
    private ConditionOperator operator;
    private Sensor sensor;
    private Log log;

    public Condition(Object threshold, ConditionOperator operator, Sensor sensor, Log log) {
        this.threshold = threshold;
        this.operator = operator;
        this.sensor = sensor;
        this.log = log;
    }

    public Sensor getSensor() {
        return sensor;
    }

    public boolean isTrue() {
        return this.operator.evaluate(this.threshold, this.sensor.getValue());
    }

    public boolean evaluate() {
        Integer result = (Integer) this.sensor.getValue();
        this.log.writeLog("valor: " + result);
        return true;
    }
}
