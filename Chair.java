package com.metanit;

class Chair extends Furniture {
    private int numberOfLegs;
    private int legHeight;
    private boolean doesBackExist;

    public Chair ( String name, Size size, int price, int numberOfLegs, int legHeight, boolean doesBackExist ) {
        super ( name, size, price );
        this.numberOfLegs = numberOfLegs;
        this.legHeight = legHeight;
        this.doesBackExist = doesBackExist;

    }

    @Override
    public String toString () {
        return super.toString () + ", тип: стул" +
                ", количество ножек: " + numberOfLegs +
                ", высота ножек: " + legHeight +
                ", наличие спинки: " + doesBackExist;
    }
}

