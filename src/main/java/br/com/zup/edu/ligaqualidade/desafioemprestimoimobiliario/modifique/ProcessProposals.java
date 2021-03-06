package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique;

import java.util.ArrayList;
import java.util.List;

public class ProcessProposals {


    public static  String process(List<String> messages) {
        List<Object> objects =new ArrayList<>();
        for (String message : messages) {
            String[] rows = message.split(",");
            objects.add(EventSchema.receiveData(rows[1], rows));
        }


         for(Object object: objects) {
             if(object instanceof Proposal){
                 new Loan().availableProposal((Proposal) object);
             }

         }


         objects.stream().forEach(System.out::println);
         return "";
    }

}
