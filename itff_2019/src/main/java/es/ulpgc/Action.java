package es.ulpgc;

public class Action {
    private int ID;
    private Object actuatorParameter;
    private Actuator actuator;

    public Action(int ID, Object actuatorParameter, Actuator actuator) {
        this.ID = ID;
        this.actuatorParameter = actuatorParameter;
        this.actuator = actuator;
    }

}
