public class Abstract {
    public static void main(String[] args) {
        CounterTerrorist CT = new CounterTerrorist(); //! create CT object
        CT.shooting();
    }
}

//! abstract class
abstract class Character {
    //! abstract methode (does not have a body)
    public abstract void shooting();
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


