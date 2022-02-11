package com.metanit;

class Shelf extends Furniture {
    private int numberOfSegments;
    private Size[] sizeOfSegment;

    {
        sizeOfSegment = new Size[numberOfSegments];
    }

    public Shelf ( String name, Furniture.Size size, int price, int numberOfSegments, Size[] sizeOfSegment ) {
        super ( name, size, price );
        this.numberOfSegments = numberOfSegments;
        this.sizeOfSegment = sizeOfSegment;
    }

    static class Size {
        private int height;
        private int width;
        private int depth;

        public Size ( int height, int width, int depth ) {
            this.height = height;
            this.width = width;
            this.depth = depth;
        }

        private int calculateSize () {
            return height * width * depth;
        }

        @Override
        public String toString () {
            return calculateSize () + "";
        }
    }

    @Override
    public String toString () {
        StringBuilder result = new StringBuilder ();
        for (int i = 0; i < numberOfSegments; i++) {
            result.append ( sizeOfSegment[i] + " см, " );
        }
        result.deleteCharAt ( result.length () - 2 );

        return super.toString () + ", тип: полка" +
                ", число сегментов: " + numberOfSegments +
                ", размеры сегментов: " + result;
    }
}
