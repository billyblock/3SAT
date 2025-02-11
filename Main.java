import java.util.*;

public class Main {
    public static void main(String[] args){
        List<int[]> equation = ThreeSatGenerator.generate(9,3);

        ThreeSatGenerator.print(equation);

    }
}
