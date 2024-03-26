package Lesson6;

public class Credit {

    private Integer loanAmount;
    private Double annualLoanRate;
    private Integer loanTerm;
    private Integer numberOfPayments;
    private Double loanBalance;


    public Credit (Integer loanAmount, Double annualLoanRate, Integer loanTerm, Integer numberOfPayments, Double loanBalance) {

        this.loanAmount = loanAmount;
        this.annualLoanRate = annualLoanRate;
        this.loanTerm = loanTerm;
        this.numberOfPayments = numberOfPayments;
        this.loanBalance = loanBalance;
    }

    public Integer getLoanAmount() {
        return  loanAmount;
    }

    public Double getAnnualLoanRate() {
        return  annualLoanRate;
    }

    public Integer getLoanTerm() {
        return loanTerm;
    }

    public Integer getNumberOfPayments() {
        return numberOfPayments;
    }

    public void setLoanBalance(Double NewloanBalance) {
        this.loanBalance = NewloanBalance;
    }

}
