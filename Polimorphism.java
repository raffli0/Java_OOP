class Character {
    public void shooting() {
        System.out.println("Character Shooting...");
    }
}

class CounterTerrorist extends Character {
    public void shooting() {
        System.out.println("Counter Terrorist Shooting...");
    }
}

class Terrorist extends Character {
    public void shooting() {
        System.out.println("Terrorist Shooting...");
    }
}


public class Polimorphism {
    public static void main(String[] args) {
        CounterTerrorist CT = new CounterTerrorist();
        Terrorist T = new Terrorist();

        CT.shooting();
        T.shooting();

    }
}


