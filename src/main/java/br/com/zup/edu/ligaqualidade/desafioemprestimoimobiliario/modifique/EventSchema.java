package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique;

public enum EventSchema {

    proposal {
        Object process(String[] rows) {
            return new Proposal(rows);
        }
    },
    warranty {
        Object process(String[] rows) {
            return new Warranty(rows);
        }
    },
    proponent {
        Object process(String[] rows) {
            return new Proponent(rows);
        }
    };

    public static Object receiveData(String event_action, String[] rows) {
        if (EventSchema.proposal.name().equals(event_action)) {
           return proposal.process(rows);
        }
        if (EventSchema.warranty.name().equals(event_action)) {
            return warranty.process(rows);
        }
        if (EventSchema.proponent.name().equals(event_action)) {
            return proponent.process(rows);
        }
        return null;
    }

    abstract Object process(String[] rows);


}
