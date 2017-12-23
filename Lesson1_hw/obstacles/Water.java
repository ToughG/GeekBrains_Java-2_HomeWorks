package obstacles;
import animals.*;
/**
 * Java. Level 2. Lesson 1. Homework
 *
 * @author Rashit Ibragimov
 * @version dated Dec 23, 2017
 * @link https://github.com/ToughG/GeekBrains_Java-2_HomeWorks
 */
public class Water implements Obstacle{
    private int length;

    public Water(int length) {
        this.length = length;
    }

    public boolean doIt(Animal animal) {
        if(animal instanceof Swimable)
            return ((Swimable) animal).swim(length);
        else
            return false;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + " " + length + "m";
    }
}