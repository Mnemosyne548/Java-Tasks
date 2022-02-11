package com.metanit;

class Table extends Furniture {
    private int numberOfLegs;
    private TopArea topArea;

    public Table ( String name, Size size, int price, int numberOfLegs, TopArea topArea ) {
        super ( name, size, price );
        this.numberOfLegs = numberOfLegs;
        this.topArea = topArea;
    }

    static class TopArea {
        private int width;
        private int height;

        public TopArea ( int width, int height ) {
            this.width = width;
            this.height = height;
        }

        private int calculateSize () {
            return width * height;
        }

        @Override
        public String toString () {
            return calculateSize () + "";
        }
    }

    @Override
    public String toString () {
        return super.toString () + ", тип: стол" +
                ", количество ножек: " + numberOfLegs +
                ", площадь столешницы: " + topArea + " см";
    }
}
