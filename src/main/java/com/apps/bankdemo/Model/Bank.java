package com.apps.bankdemo.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "BANK")
public class Bank {

    @Id
    @Column(name = "BANK_ID")
    private Long bankId;
    @Column(name = "BANK_ACCOUNT")
    private Long account;
    @ManyToOne
    @JoinColumn(name = "customer_customer_id")
    private Customer customer;
    @Column(name = "BANK_LOCATION")
    private String location;
    @Column(name = "BANK_CONTACT")
    private int Contact;
    @Column(name = "BANK_LOAN")
    private Long loan;

    public Bank(Long bankId, Long account, Customer customer, String location, int contact, Long loan) {
        this.bankId = bankId;
        this.account = account;
        this.customer = customer;
        this.location = location;
        Contact = contact;
        this.loan = loan;
    }

    public Bank (){
    }

    public Long getBankId() {
        return bankId;
    }

    public void setBankId(Long bankId) {
        this.bankId = bankId;
    }

    public Long getAccount() {
        return account;
    }

    public void setAccount(Long account) {
        this.account = account;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getContact() {
        return Contact;
    }

    public void setContact(int contact) {
        Contact = contact;
    }

    public Long getLoan() {
        return loan;
    }

    public void setLoan(Long loan) {
        this.loan = loan;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankId=" + bankId +
                ", account=" + account +
                ", customer=" + customer +
                ", location='" + location + '\'' +
                ", Contact=" + Contact +
                ", loan=" + loan +
                '}';
    }
}
