package animals;
/**
 * Java. Level 2. Lesson 1. Homework
 *
 * @author Rashit Ibragimov
 * @version dated Dec 23, 2017
 * @link https://github.com/ToughG/GeekBrains_Java-2_HomeWorks
 */
public abstract class Animal {
    protected String name;
    protected int run_limit;

    public abstract String voice();

    public boolean run(int length) {
        return run_limit >= length;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + " " + name;
    }
}