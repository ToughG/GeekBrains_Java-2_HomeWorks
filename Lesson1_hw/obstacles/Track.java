package obstacles;
import animals.*;
/**
 * Java. Level 2. Lesson 1. Homework
 *
 * @author Rashit Ibragimov
 * @version dated Dec 23, 2017
 * @link https://github.com/ToughG/GeekBrains_Java-2_HomeWorks
 */
public class Track implements Obstacle{
    private int length;

    public Track(int length) {
        this.length = length;
    }

    public boolean doIt(Animal animal) {
        return animal.run(length);
    }

    @Override
    public String toString() {
        return this.getClass().getName() + " " + length + "m";
    }
}