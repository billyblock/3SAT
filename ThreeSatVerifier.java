import java.util.*;

public class ThreeSatVerifier {
    // Verifies the given equation against the solution given. Assuming it is given in Conjunctive Normal Form 
    public static boolean verify(List<int[]> equation, boolean[] solution) {
        if (!isCorrectFormat(equation))
            return false;

        List<boolean[]> solvedEquation = createSolvedEquation(equation, solution);

        for (boolean[] eachClause : solvedEquation) {
            // If the clause, x or x2 or x3 is false, then return false.
            if (!(eachClause[0] || eachClause[1] || eachClause[2])) {
                return false;
            }
        }

        return true;

    }

    // Checks if the List<int[]> is actually in 3sat equation formatiing.
    private static boolean isCorrectFormat(List<int[]> equation) {
        for (int[] eachClause : equation) {
            if (eachClause.length % 3 != 0) {
                return false;
            }
        }
        return true;
    }
    // Turns the equation into a solved equation with the solutions turth values instead of variables.
    public static List<boolean[]> createSolvedEquation(List<int[]> equation, boolean[] solution) {
        List<boolean[]> solved = new ArrayList<boolean[]>();

        for (int i = 0; i < equation.size(); i++) {
            boolean[] clause = new boolean[3];
            for (int j = 0; j < equation.get(i).length; j++) {
                int var = equation.get(i)[j];
                clause[j] = solution[var - 1];
            }
            solved.set(i, clause);
        }
        return solved;
    }

}
