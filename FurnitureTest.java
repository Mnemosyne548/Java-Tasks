package com.metanit;

public class FurnitureTest {
    public static void main ( String[] args ) {
        Chair ch =
                new Chair (
                        "Венский стул",
                        new Furniture.Size ( 120, 45, 45 ),
                        6000,
                        4,
                        35,
                        true );

        System.out.println ( ch );

        Table t =
                new Table (
                        "Круглый стол",
                        new Furniture.Size ( 120, 120, 120 ),
                        10_000,
                        1,
                        new Table.TopArea ( 120, 120 ) );

        System.out.println ( t );

        Shelf sh =
                new Shelf (
                        "Книжная полка",
                        new Furniture.Size ( 25, 70, 45 ),
                        5000,
                        2,
                        new Shelf.Size[]{
                                new Shelf.Size ( 25, 25, 45 ),
                                new Shelf.Size ( 25, 45, 45 ),
                                new Shelf.Size ( 12, 12, 12 )} );

        System.out.println ( sh );

        Cupboard c =
                new Cupboard (
                        "Шкаф купе",
                        new Furniture.Size ( 220, 240, 60 ),
                        50_000,
                        "дерево",
                        6,
                        8 );

        System.out.println ( c );
        System.out.println ( t );
        System.out.println ( ch );
        System.out.println ( sh );
    }
}

class Furniture {
    private String name;
    private Size size;
    private int price;

    public Furniture ( String name, Size size, int price ) {
        this.name = name;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString () {
        return "Артикул: \"" + name + "\"" +
                ", габариты: " + size + " см" +
                ", цена: " + price + " руб.";
    }

    static class Size {
        private int height;
        private int width;
        private int length;

        public Size ( int height, int width, int length ) {
            this.height = height;
            this.width = width;
            this.length = length;
        }

        private String calculateSize () {
            return height * width * length + "";
        }

        @Override
        public String toString () {
            return calculateSize ();
        }
    }
}


