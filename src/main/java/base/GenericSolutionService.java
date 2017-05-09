package base;

import java.util.List;

public class GenericSolutionService {

    public static void run(List<Class<? extends Solution<?, ?>>> solutionClasses) {
        
        try {
            
            for (Class<? extends Solution<?, ?>> solutionClass : solutionClasses) {
                String fullName = solutionClass.getName();
                String shortName = fullName.substring(fullName.lastIndexOf('.') + 1);
                System.out.println("\n=== " + shortName + " ===\n");
                Solution<?, ?> solution = solutionClass.newInstance();
                solution.runTests();
            }
        } catch (InstantiationException e) {
            excetpMsg("InstantiationException", e);
        } catch (IllegalAccessException e) {
            excetpMsg("IllegalAccessException", e);
        }
    }

    private static void excetpMsg(String msg, Exception e) {
        System.out.println("Failed to instantiate: " + msg);
        System.out.println(e.getMessage());
    }

}
