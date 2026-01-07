package com.loanapproval;

public class DriverClass {
    public static void main(String[] args) {
        Applicant applicant = new Applicant("Aman", 720, 40000, 500000);

        HomeLoan loan = new HomeLoan(120);
        System.out.println("Applicant : " + applicant.getName());

        if(loan.approveLoan(applicant)) {
            System.out.println(loan.loanType + " Approved");
            System.out.println("EMI : " + loan.calculateEMI(applicant));
        } 
        else {
            System.out.println(loan.loanType + " Rejected");
        }
    }
}
