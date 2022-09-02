package com.apps.bankdemo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "LOAN")
public class Loan {
    @Id
    @Column(name = "LOAN_ID")
    private Long loanId;
    @Column(name = "LOAN_DURATION")
    private Long duration;

    public Loan(Long loanId, Long duration) {
        this.loanId = loanId;
        this.duration = duration;
    }

    public Long getLoanId() {
        return loanId;
    }

    public void setLoanId(Long loanId) {
        this.loanId = loanId;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public Loan(){
    }

    @Override
    public String toString() {
        return "Loan{" +
                "loanId=" + loanId +
                ", duration=" + duration +
                '}';
    }
}
