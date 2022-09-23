package app.model;

import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    private final Animal dog;
    private final Timer timer;

    public AnimalsCage(Animal dog, Timer timer) {
        this.dog = dog;
        this.timer = timer;
    }

    public Timer getTimer() {
        return timer;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(dog.toString());
        System.out.println("At:");
        System.out.println(getTimer().getTime());
        System.out.println("________________________");
    }
}
