package model.randoms;

public class RandomGenerator {
    private final int RAND_MAX = 8;
    private final int RAND_MIN = 0;

    private int min = RAND_MIN;
    private int max = RAND_MAX;

    private int rnd;

    public RandomGenerator(int max) {
        rnd = (int) (Math.random()*(max) + 1);
    }

    public int getRnd() {
        return rnd;
    }
}