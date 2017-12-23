package animals;
/**
 * Java. Level 2. Lesson 1. Homework
 *
 * @author Rashit Ibragimov
 * @version dated Dec 23, 2017
 * @link https://github.com/ToughG/GeekBrains_Java-2_HomeWorks
 */
public class Cat extends Animal implements Jumpable, Swimable {
    private int swim_limit;
    private float jump_limit;

    public Cat(String name) {
        this.name = name;
        this.run_limit = 100;
        swim_limit = 100;
        jump_limit = 3.8f;
    }



    public String voice() {
        return "meow";
    }

    public boolean swim(int length) {
        return swim_limit >= length;
    }

    public boolean jump(float height) {
        return jump_limit >= height;
    }
}