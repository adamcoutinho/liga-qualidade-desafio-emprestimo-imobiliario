package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique;

public class Warranty {
    private String event_id ;
    private String event_schema;
    private String event_action;
    private String event_timestamp;
    private String proposal_id ;
    private String warranty_id;
    private String warranty_value;
    private String warranty_province;

    public Warranty(String event_id, String event_schema, String event_action, String event_timestamp, String proposal_id, String warranty_id, String warranty_value, String warranty_province) {
        this.event_id = event_id;
        this.event_schema = event_schema;
        this.event_action = event_action;
        this.event_timestamp = event_timestamp;
        this.proposal_id = proposal_id;
        this.warranty_id = warranty_id;
        this.warranty_value = warranty_value;
        this.warranty_province = warranty_province;
    }

    public Warranty(String[] rows) {
        this.event_id = rows[0];
        this.event_schema = rows[1];
        this.event_action = rows[2];
        this.event_timestamp = rows[3];
        this.proposal_id = rows[4];
        this.warranty_id = rows[5];
        this.warranty_value = rows[6];
        this.warranty_province = rows[7];
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

    public String getWarranty_id() {
        return warranty_id;
    }

    public String getWarranty_value() {
        return warranty_value;
    }

    public String getWarranty_province() {
        return warranty_province;
    }

    @Override
    public String toString() {
        return "Warranty{" +
                "event_id='" + event_id + '\'' +
                ", event_schema='" + event_schema + '\'' +
                ", event_action='" + event_action + '\'' +
                ", event_timestamp='" + event_timestamp + '\'' +
                ", proposal_id='" + proposal_id + '\'' +
                ", warranty_id='" + warranty_id + '\'' +
                ", warranty_value='" + warranty_value + '\'' +
                ", warranty_province='" + warranty_province + '\'' +
                '}';
    }
}
