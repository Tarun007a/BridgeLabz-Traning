package com.loanapproval;

public interface IApprovable {
    boolean approveLoan(Applicant applicant);
    double calculateEMI(Applicant applicant);
}
