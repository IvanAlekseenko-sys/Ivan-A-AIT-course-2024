package exceptions.application;

import exceptions.exception_handling.NoSolutionException;
import exceptions.exception_handling.SolutionIsAnyNumber;

public class SolutionAppl {
    // a * X = b решение линейного уравнения
    // solution X = b / a
    // a = 0 && b != 0 => "Делить на 0 нельзя!", продолжить работу
    // a = 0 && b = 0 => "X - любое число"

    public static void main(String[] args) {
        int a = 0, b = 30;
        try {
            int x = solution(a, b);
            System.out.println("x = " + x);
        } catch (NoSolutionException e) {
            System.out.println(e.getMessage());
        } catch (SolutionIsAnyNumber e) {
            System.out.println(e.getMessage());
        }
    }

    private static int solution(int a, int b) throws NoSolutionException, SolutionIsAnyNumber {
        if (a == 0 && b != 0) {
            throw new NoSolutionException("No possible solution, division by 0 impossible!");
        }
        if (a == 0 && b == 0) {
            throw new SolutionIsAnyNumber("X - is any number!");
        }
        return b / a;
    }
}
