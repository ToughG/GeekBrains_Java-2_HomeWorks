import animals.*;
import obstacles.*;
/** 
 * Java. Level 2. Lesson 1. Homework
 * Preparatory actions:
 * 1. Making animals.jar based on code in lesson 1:
 *    - compile sourse file
 *      > javac animals/*.java
 *    - make package using command:
 *      > jar -cvf animals.jar animals/*.class
 * 2. Making obstacles.jar from classes track, wall, water in the same way
 * 3. Move both packages to lib/ directory
 *    > move animals.jar lib
 *    > move obstacles.jar lib
 * 4. Compile using this command:
 *    > javac -cp lib/animals.jar;lib/obstacles.jar;. J2Lesson1.java
 *    Run compiled program this way:
 *    > java -cp lib/animals.jar;lib/obstacles.jar;. J2Lesson1
 * 5. Or put both packages to [JDK]/jre/lib/ext
 *    and compile and run this way:
 *    > javac HW1Lesson.java
 *    > java HW1Lesson
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