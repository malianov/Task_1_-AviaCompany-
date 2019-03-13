package model.randoms;

public class RandomGenerator {
    private final int RAND_MAX = 8;
    private final int RAND_MIN = 0;

    private int min = RAND_MIN;
    private int max = RAND_MAX;

    private int rnd;

    public RandomGenerator() {
        rnd = (int) (Math.random()*(RAND_MAX - RAND_MIN) + RAND_MIN + 1);
        //System.out.println("Сработал дефолтный конструктор генератора случайных чисел");
    }

    public RandomGenerator(int min, int max) {
        rnd = (int) (Math.random()*(max - min) + min + 1);
        //System.out.println("Сработал min-max конструктор генератора случайных чисел");
    }

    public RandomGenerator(int max) {
        rnd = (int) (Math.random()*(max) + 1);
        //System.out.println("Сработал max конструктор генератора случайных чисел");
    }

    public int getRnd() {
        //System.out.println("Сделан запрос случайного числа");
        return rnd;
    }
}