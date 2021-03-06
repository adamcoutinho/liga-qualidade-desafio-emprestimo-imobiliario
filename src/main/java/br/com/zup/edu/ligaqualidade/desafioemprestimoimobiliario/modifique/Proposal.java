package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique;

import java.math.BigDecimal;

public class Proposal {
    private String event_id ;
    private String event_schema;
    private String event_action;
    private String event_timestamp;
    private String proposal_id;
    private BigDecimal proposal_loan_value;
    private Integer proposal_number_of_monthly_installments;

    public Proposal(String event_id, String event_schema, String event_action, String event_timestamp, String proposal_id, String proposal_loan_value, String proposal_number_of_monthly_installments) {
        this.event_id = event_id;
        this.event_schema = event_schema;
        this.event_action = event_action;
        this.event_timestamp = event_timestamp;
        this.proposal_id = proposal_id;
        this.proposal_loan_value = new BigDecimal(proposal_loan_value);
        this.proposal_number_of_monthly_installments = new Integer(proposal_number_of_monthly_installments);
    }

    public Proposal(String[] rows) {
        this.proposal_id=rows[0];
        this.event_schema=rows[1];
        this.event_action=rows[2];
        this.event_timestamp=rows[3];
        this.proposal_id=rows[4];
        this.proposal_loan_value=new BigDecimal(rows[5]);
        this.proposal_number_of_monthly_installments = new Integer(rows[6]);
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

    public BigDecimal getProposal_loan_value() {
        return proposal_loan_value;
    }

    public Integer getProposal_number_of_monthly_installments() {
        return proposal_number_of_monthly_installments;
    }

    @Override
    public String toString() {
        return "Proposal{" +
                "event_id='" + event_id + '\'' +
                ", event_schema='" + event_schema + '\'' +
                ", event_action='" + event_action + '\'' +
                ", event_timestamp='" + event_timestamp + '\'' +
                ", proposal_id='" + proposal_id + '\'' +
                ", proposal_loan_value='" + proposal_loan_value + '\'' +
                ", proposal_number_of_monthly_installments='" + proposal_number_of_monthly_installments + '\'' +
                '}';
    }
}
