package D;

import java.util.ArrayList;
import java.util.Collections;

public class MiniMainSquare {
    public static void ExerciseD(){
        Square square1 = new Square(5, 6);
        Square square2 = new Square(2, 1);
        System.out.println(square1.compareTo(square2));

        ArrayList<Square> squareList = new ArrayList<>();
        squareList.add(square1);
        squareList.add(square2);
        Collections.sort(squareList);
        System.out.println("Den med den største omkreds står først: " + squareList);
    }
}
