package com.novando.springstripeexample.http;

import lombok.Data;

@Data
public class PaymentIntentDto {
    public enum Currency{
        usd, eur;
    }

    private String description;
    private int amount;
    private Currency currency;
}
