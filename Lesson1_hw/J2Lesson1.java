import animals.*;
import obstacles.*;
/**
 * Java. Level 2. Lesson 1. Homework
 *
 * @author Rashit Ibragimov
 * @version dated Dec 23, 2017
 * @link https://github.com/ToughG/GeekBrains_Java-2_HomeWorks
 */
public class J2Lesson1 {

    public static void main(String[] args) {
        Courses cource = new Courses(new Obstacle[]{
                new Track(50),
                new Water(50),
                new Wall(2)});
        Team team = new Team("Animals", new Animal[]{
                new Cat("Murzik"),
                new Cat("Barsik"),
                new Hen("Izzy"),
                new Hippo("Hippy")});
        System.out.println(team);
        cource.doIt(team);
        team.showResults();
    }
}