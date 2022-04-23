package com.ooad.cecs575_group05.model;

public class CardStrategy implements MainPayStrategy{

    private String name;
    private String cardNum;
    private String cvv;
    private String dateOfExp;

    public CardStrategy(String name, String cardNum, String cvv, String dateOfExp) {
        this.name = name;
        this.cardNum = cardNum;
        this.cvv = cvv;
        this.dateOfExp = dateOfExp;
    }

    @Override
    public void payment(int cost) {
        System.out.println(cost +"$ paid using credit or debit card");
    }
}
