package isp;

import java.util.ArrayList;
import java.util.List;

public class LoanPayment implements Loan {

    // deleted after refactoring
    // @Override
    // public void initiatePayments() {
    //     throw new UnsupportedOperationException("This is not a bank payment");
    // }

    @Override
    public Object status() {
        // do something
        return this;
    }

    @Override
    public List<Object> getPayments() {
        // do something
        return new ArrayList<>();
    }

    @Override
    public void intiateLoanSettlement() {
        // do something
    }

    @Override
    public void initiateRePayment() {
        // do something
    }
}