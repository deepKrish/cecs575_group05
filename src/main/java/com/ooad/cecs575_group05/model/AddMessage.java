package com.ooad.cecs575_group05.model;

public class AddMessage extends SubscriptionPackageDecorator{
    public AddMessage(UserSubscription userSubscription) {
        super(userSubscription);
    }

    @Override
    public String description() {
        return super.description() + " Adding Message to it.";
    }
}
