package es.ulpgc;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private int ID;
    private String userNAme;
    private String usePassword;
    private Mail mail;

    List<Rule> rules;
    List<Sensor> sensors;
    List<Actuator> actuators;

    public Account(int ID, String userNAme, String usePassword, Mail mail) {
        this.ID = ID;
        this.userNAme = userNAme;
        this.usePassword = usePassword;
        this.mail = mail;
        this.rules = new ArrayList<Rule>();
        this.sensors = new ArrayList<Sensor>();
        this.actuators = new ArrayList<Actuator>();
    }


}
