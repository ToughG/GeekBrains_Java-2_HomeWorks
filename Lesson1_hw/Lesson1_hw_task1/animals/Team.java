package animals;
import obstacles.*;

import java.util.Arrays;

/**
 * Java. Level 2. Lesson 1. Homework
 *
 * @author Rashit Ibragimov
 * @version dated Dec 23, 2017
 * @link https://github.com/ToughG/GeekBrains_Java-2_HomeWorks
 */
public class Team {
    private String name;
    private Animal[] animals;
    private String result;
    public Team(String name, Animal[] animals) {
        this.name = name;
        this.animals = animals;
        result = "";
    }

    public void doIt(Obstacle obstacle) {
        result += obstacle.toString() + "\n";
        for (Animal animal : animals)
            result += "> " + animal + " " + obstacle.doIt(animal) + "\n";
    }

    public void showResults() {
        System.out.println(result);
    }

    @Override
    public String toString() {
        return "Team: " + name + " " + Arrays.toString(animals);
    }
}