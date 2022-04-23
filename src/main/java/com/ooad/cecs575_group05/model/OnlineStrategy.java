package com.ooad.cecs575_group05.model;

public class OnlineStrategy implements MainPayStrategy{

    private String email;
    private String pwd;

    public OnlineStrategy(String email, String pwd) {
        this.email = email;
        this.pwd = pwd;
    }

    @Override
    public void payment(int cost) {
        System.out.println(cost +"$ paid using Online Banking");
    }
}
