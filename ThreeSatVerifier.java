import java.util.*;

public class ThreeSatVerifier {

    public static boolean verify(List<int[]> formula, boolean[] solution) {
        if (!isCorrectFormat(formula))
            return false;

        List<boolean[]> solvedFormula = new ArrayList<boolean[]>();

        for (int i = 0; i < formula.size(); i++) {
            for(int j = 0; j < formula.get(i).length; j++){
                int var = formula.get(i)[j];
                
            }
        }

        return true;

    }

    private static boolean isCorrectFormat(List<int[]> formula) {

        if (formula.get(0).length % 3 != 0) {
            return false;
        }
        return true;
    }

}
