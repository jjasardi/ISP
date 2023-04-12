package isp;

import java.util.ArrayList;
import java.util.List;

public class BankPayment implements Bank {


    @Override
    public void initiatePayments() {
       // do something
    }

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


    // Deleted after refactoring
    // @Override
    // public void intiateLoanSettlement() {
    //     throw new UnsupportedOperationException("This is not a loan payment");
    // }

    // @Override
    // public void initiateRePayment() {
    //     throw new UnsupportedOperationException("This is not a loan payment");
    // }
}