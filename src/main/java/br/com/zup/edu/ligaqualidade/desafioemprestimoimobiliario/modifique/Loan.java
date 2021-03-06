package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique;

import java.math.BigDecimal;

public class Loan {
    /**
     * VALOR MÍNIMO
     */
    private BigDecimal VALOR_MINIMO = new BigDecimal("3000.00");
    /**
     *  VALOR MÁXIMO
     */
    private BigDecimal VALOR_MAXIMO= new BigDecimal("30000.00");

    /**
     *  2 anos
     */
    private int QUANTITY_MIN = 24;
    /**
     * 15 anos
     */
    private int QUANTITY_MAX = 180;

    public void availableProposal(Proposal proposal) {

        /**
         * REGRA - 1 (O valor do empréstimo deve estar entre R$ 30.000,00 e R$ 3.000.000,00)
         */
        if((proposal.getProposal_loan_value().compareTo(VALOR_MINIMO)==-1) && (proposal.getProposal_loan_value().compareTo(VALOR_MAXIMO)==1)) {
                   throw new RuntimeException("Não é possível fazer emprestimo.");
        }

        /**
         * REGRA 2 - (O empréstimo deve ser pago em no mínimo 2 anos e no máximo 15 anos)
         */
        if(proposal.getProposal_number_of_monthly_installments().compareTo(QUANTITY_MIN)==-1 && proposal.getProposal_number_of_monthly_installments().compareTo(QUANTITY_MAX)==1){
                    throw new RuntimeException("o número de parcelas não é pode aplicado para o emprestinmo.");
        }

    }

}
