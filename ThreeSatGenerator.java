import java.util.*;

public class ThreeSatGenerator {
    public static final Random generator = new Random();

    // Generates a equation for a 3-sat problem, vars is the numbs of variables,
    // clauses is the number of clauses
    public static List<int[]> generate(int vars, int clauses) {

        List<int[]> equation = new ArrayList<>();

        for (int i = 0; i < clauses; i++) {
            // Create the variables for the clause
            int var1 = generator.nextInt(vars) + 1;
            int var2 = generator.nextInt(vars) + 1;
            int var3 = generator.nextInt(vars) + 1;

            // Ensure each variable is different then one another
            while (var2 == var1)
                var2 = generator.nextInt(vars) + 1;
            while (var3 == var2 || var3 == var1)
                var3 = generator.nextInt(vars) + 1;

            // Ranodmly negate each one with a 50 / 50 chance
            var1 = generator.nextBoolean() ? var1 : -var1;
            var2 = generator.nextBoolean() ? var2 : -var2;
            var3 = generator.nextBoolean() ? var3 : -var3;

            // Create the clause
            int[] clause = { var1, var2, var3 };

            // Add the clause to the equation
            equation.add(clause);

        }

        return equation;
    }

    public static List<int[]> generate() {
        int vars = (generator.nextInt(25) + 1);
        int clauses = (generator.nextInt(25) + 1);

        return generate(vars, clauses);
    }

    public static void print(List<int[]> equation) {
        System.out.println("equation: ");
        int i = 0;
        for (int[] eachClause : equation) {
            String var1 = format(eachClause[0]);
            String var2 = format(eachClause[1]);
            String var3 = format(eachClause[2]);
            if (i == 0)
                System.out.printf("(%s V %s V %s) ", var1, var2, var3);
            else
                System.out.printf("AND (%s V %s V %s) ", var1, var2, var3);
            i++;
        }
    }

    public static void printUnformatted(List<int[]> equation) {
        System.out.println("");
        System.out.println("Unformatted Equation: ");
        System.out.print("{ ");
        for(int i = 0; i < equation.size(); i++){
            System.out.print("[ ");
            for(int j = 0; j < equation.get(i).length; j++){
                System.out.print(equation.get(i)[j] + " ");
            }
            System.out.print("]");
        }
        System.out.print(" }");
    }

    private static String format(int literal) {
        return (literal < 0) ? "¬x" + (-literal) : "x" + literal;
    }

}