package model.services;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {

    static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }
    
    public void processContract(Contract contract, int months){
        double installmentValue = contract.getTotalValue() / months;
        Date initialDate = contract.getDate();

        for(int i=1;i<=months;i++){

            double correctedValue;
            Date correctedDate;
            
            Calendar cal = Calendar.getInstance();
            cal.setTime(initialDate);
            cal.add(Calendar.MONTH, i);

            double aux = onlinePaymentService.interest(installmentValue, i);
            double finalResult = onlinePaymentService.paymentFee(aux);

            correctedValue = finalResult;
            correctedDate = cal.getTime();

            contract.addItem(new Installment(correctedDate, correctedValue));
        }

    }

}
