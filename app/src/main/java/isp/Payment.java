package isp;

import java.util.List;

public interface Payment { 
    // void initiatePayments(); deleted after refactoring
    Object status();
    List<Object> getPayments();
    // deleted after refactoring
    // void intiateLoanSettlement();
    // void initiateRePayment();
}