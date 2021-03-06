package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique;

public class Proponent {

    private String event_id;
    private String event_schema;
    private String event_action;
    private String event_timestamp ;
    private String proposal_id;
    private String proponent_id;
    private String proponent_name;
    private String proponent_age;
    private String proponent_monthly_income;
    private String proponent_is_main;


    public Proponent(String event_id, String event_schema, String event_action, String event_timestamp, String proposal_id, String proponent_id, String proponent_name, String proponent_age, String proponent_monthly_income, String proponent_is_main) {
        this.event_id = event_id;
        this.event_schema = event_schema;
        this.event_action = event_action;
        this.event_timestamp = event_timestamp;
        this.proposal_id = proposal_id;
        this.proponent_id = proponent_id;
        this.proponent_name = proponent_name;
        this.proponent_age = proponent_age;
        this.proponent_monthly_income = proponent_monthly_income;
        this.proponent_is_main = proponent_is_main;
    }

    public Proponent(String[] rows) {
        this.event_id = rows[0];
        this.event_schema = rows[1];
        this.event_action = rows[2];
        this.event_timestamp = rows[3];
        this.proposal_id = rows[4];
        this.proponent_id = rows[5];
        this.proponent_name = rows[6];
        this.proponent_age = rows[7];
        this.proponent_monthly_income = rows[8];
        this.proponent_is_main = rows[9];
    }

    public String getEvent_id() {
        return event_id;
    }

    public String getEvent_schema() {
        return event_schema;
    }

    public String getEvent_action() {
        return event_action;
    }

    public String getEvent_timestamp() {
        return event_timestamp;
    }

    public String getProposal_id() {
        return proposal_id;
    }

    public String getProponent_id() {
        return proponent_id;
    }

    public String getProponent_name() {
        return proponent_name;
    }

    public String getProponent_age() {
        return proponent_age;
    }

    public String getProponent_monthly_income() {
        return proponent_monthly_income;
    }

    public String getProponent_is_main() {
        return proponent_is_main;
    }

    @Override
    public String toString() {
        return "Proponent{" +
                "event_id='" + event_id + '\'' +
                ", event_schema='" + event_schema + '\'' +
                ", event_action='" + event_action + '\'' +
                ", event_timestamp='" + event_timestamp + '\'' +
                ", proposal_id='" + proposal_id + '\'' +
                ", proponent_id='" + proponent_id + '\'' +
                ", proponent_name='" + proponent_name + '\'' +
                ", proponent_age='" + proponent_age + '\'' +
                ", proponent_monthly_income='" + proponent_monthly_income + '\'' +
                ", proponent_is_main='" + proponent_is_main + '\'' +
                '}';
    }
}
