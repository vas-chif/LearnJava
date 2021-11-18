package src.accesmodifiersAndConstructor.constructors.rectangle;

public class Rectangle {
    private int wight;
    private int length;

    Rectangle() {
        this(0,0);
        // acelasi cod dar apeliaza contructorul doar cu o valibila "sideLength" dar acelasi risultat il avem
        //this(0);
       /* alta varianta si obtinem acelasi resultat
        wight = 0;
        length = 0;
        */
    }

    Rectangle(int wight, int newLength) {
        this.wight = wight;
        length = newLength;
    }

    Rectangle(int sideLength) {
        wight = length = sideLength;
        //ecelas  cod de mai sus
       //this(sideLength,sideLength);
        /*
        este acelas cod de mai sus
        length = sideLength;
        wight = sideLength;
         */
    }

    int getArea(){
        return wight * length;
    }
}
