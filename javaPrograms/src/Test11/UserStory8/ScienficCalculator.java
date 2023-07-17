package Test11.UserStory8;

public class ScienficCalculator implements Calculator{
    @Override
    public int addition(int x, int y) {
        return x+y;
    }

    @Override
    public int subtraction(int x, int y) {
        return x-y;
    }

    @Override
    public int multiplication(int x, int y) {
        return x*y;
    }

    @Override
    public int division(int x, int y) {
        return x/y;
    }
}
