package com.metanit;

class Cupboard extends Furniture {
    private String handleMaterial;
    private int numberOfDoor;
    private int numberOfDrawers;

    public Cupboard ( String name, Size size, int price, String handleMaterial, int numberOfDoor, int numberOfDrawers ) {
        super ( name, size, price );
        this.handleMaterial = handleMaterial;
        this.numberOfDoor = numberOfDoor;
        this.numberOfDrawers = numberOfDrawers;
    }

    @Override
    public String toString () {
        return super.toString () + ", тип: стол" +
                ", материал ручек: " + handleMaterial +
                ", число створок: " + numberOfDoor +
                ", число шкафчиков: " + numberOfDrawers;
    }
}
