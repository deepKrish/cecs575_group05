package com.ooad.cecs575_group05.model;

public class GiftWrap extends SubscriptionPackageDecorator{
    public GiftWrap(UserSubscription userSubscription) {
        super(userSubscription);
    }

    @Override
    public String description() {
        return super.description() + " Adding Gift Wrap to it.";
    }
}
