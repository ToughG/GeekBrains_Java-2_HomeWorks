package obstacles;
import animals.*;

import java.util.Arrays;

/**
 * Java. Level 2. Lesson 1. Homework
 *
 * @author Rashit Ibragimov
 * @version dated Dec 23, 2017
 * @link https://github.com/ToughG/GeekBrains_Java-2_HomeWorks
 */
public class Courses {
    Obstacle[] obstacles;

    public Courses(Obstacle[] obstacles) {
        this.obstacles = obstacles;
    }

    public void doIt(Team team) {
        for (Obstacle obstacle : obstacles)
            team.doIt(obstacle);
    }

    @Override
    public String toString() {
        return Arrays.toString(obstacles);
    }

}