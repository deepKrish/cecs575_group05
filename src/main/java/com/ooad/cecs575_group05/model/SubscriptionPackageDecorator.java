package com.ooad.cecs575_group05.model;

public class SubscriptionPackageDecorator implements UserSubscription{
    protected UserSubscription userSubscription;

    public SubscriptionPackageDecorator(UserSubscription userSubscription){
        this.userSubscription = userSubscription;
    }

    @Override
    public String description() {
        return this.userSubscription.description();
    }
}
