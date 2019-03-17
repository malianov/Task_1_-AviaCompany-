package model.randoms;

public class RandomGenerator {
    private int rnd;

    public RandomGenerator(int max) {
        rnd = (int) (Math.random()*(max) + 1);
    }

    public int getRnd() {
        return rnd;
    }
}