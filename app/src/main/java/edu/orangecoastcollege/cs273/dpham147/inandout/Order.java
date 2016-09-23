package edu.orangecoastcollege.cs273.dpham147.inandout;

/**
 * Created by dpham147 on 2016-09-20.
 */
public class Order {
    public int mCheeseburgers;
    public int mDoubleDoubles;
    public int mFrenchFries;
    public int mLargeDrinks;
    public int mMediumDrinks;
    public int mShakes;
    public int mSmallDrinks;
    public static final double PRICE_CHEESEBURGER = 2.15;
    public static final double PRICE_DOUBLE_DOUBLE = 3.60;
    public static final double PRICE_FRENCH_FRIES = 1.65;
    public static final double PRICE_LARGE_DRINK = 1.75;
    public static final double PRICE_MEDIUM_DRINK = 1.55;
    public static final double PRICE_SHAKES = 2.20;
    public static final double PRICE_SMALL_DRINKS = 1.45;
    public static final double TAX_RATE = 0.08;

    public Order() {
        mCheeseburgers = 0;
        mDoubleDoubles = 0;
        mFrenchFries = 0;
        mLargeDrinks = 0;
        mMediumDrinks = 0;
        mShakes = 0;
        mSmallDrinks = 0;
    }

    public double calculateSubtotal(){
        return ((mCheeseburgers * PRICE_CHEESEBURGER) +
                (mDoubleDoubles * PRICE_DOUBLE_DOUBLE) +
                (mFrenchFries * PRICE_FRENCH_FRIES) +
                (mLargeDrinks * PRICE_LARGE_DRINK) +
                (mMediumDrinks * PRICE_MEDIUM_DRINK) +
                (mShakes * PRICE_SHAKES) +
                (mSmallDrinks * PRICE_SMALL_DRINKS));
    }

    public double calculateTax(){
        return (calculateSubtotal() * TAX_RATE);
    }

    public double calculateTotal(){
        return (calculateSubtotal() + calculateTax());
    }

    public int getCheeseburgers() {
        return mCheeseburgers;
    }

    public int getDoubleDoubles() {
        return mDoubleDoubles;
    }

    public int getFrenchFries() {
        return mFrenchFries;
    }

    public int getLargeDrinks() {
        return mLargeDrinks;
    }

    public int getMediumDrinks() {
        return mMediumDrinks;
    }

    public int getNumberItemsOrdered(){
        return mCheeseburgers + mDoubleDoubles + mFrenchFries + mLargeDrinks + mMediumDrinks
                + mShakes + mSmallDrinks;
    }

    public int getShakes() {
        return mShakes;
    }

    public int getSmallDrinks() {
        return mSmallDrinks;
    }

    public void setmCheeseburgers(int cheeseburgers) {
        mCheeseburgers = cheeseburgers;
    }

    public void setmDoubleDoubles(int doubleDoubles) {
       mDoubleDoubles = doubleDoubles;
    }

    public void setmFrenchFries(int frenchFries) {
        mFrenchFries = frenchFries;
    }

    public void setmLargeDrinks(int largeDrinks) {
        mLargeDrinks = largeDrinks;
    }

    public void setmMediumDrinks(int mediumDrinks) {
       mMediumDrinks = mediumDrinks;
    }

    public void setmShakes(int shakes) {
        mShakes = shakes;
    }

    public void setmSmallDrinks(int smallDrinks) {
        mSmallDrinks = smallDrinks;
    }
}
