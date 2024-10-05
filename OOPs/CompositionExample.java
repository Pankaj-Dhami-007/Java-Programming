// Human class (container)
class Human {
    Heart heart;

    public Human() {
        // Creating the Heart object within Human (Composition)
        this.heart = new Heart();
    }

    public void live() {
        heart.beat();
        // Human controls the Heart
    }
}

// Heart class (component)
class Heart {

    public void beat() {
        System.out.println("Heart is beating......");
    }
}

public class CompositionExample {
    public static void main(String[] args) {
        Human h = new Human();// When a Human is created, a Heart is created too
        h.live();// Heart "lives" only because the Human "lives"
        // If Human is destroyed, the Heart is also destroyed
    }
}
