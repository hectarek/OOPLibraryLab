interface Loanable {
    
    boolean isLoanable();
    double lateFee();
    FeeFrequency lateFeeFrequency();
}