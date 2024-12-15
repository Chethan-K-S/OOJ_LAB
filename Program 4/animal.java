abstract class Animals {
    public abstract String eat();
    public abstract String sleep();
}

class Lion extends Animals {
    @Override
    public String eat() {
        return "The lion eats";
    }

    @Override
    public String sleep() {
        return "Lion is sleeping";
    }
}

class Deer extends Animals {
    @Override
    public String eat() {
        return "The Deer eats";
    }

    @Override
    public String sleep() {
        return "Deer is sleeping";
    }
}

class Tiger extends Animals {
    @Override
    public String eat() {
        return "Tiger eats";
    }

    @Override
    public String sleep() {
        return "Tiger sleeps";
    }
}

public class animal{  
    public static void main(String[] args) {
        Lion L = new Lion();
        Deer D = new Deer();
        Tiger T = new Tiger();

        System.out.println(L.eat() + "\n" + L.sleep());
        System.out.println(D.eat() + "\n" + D.sleep());
        System.out.println(T.eat() + "\n" + T.sleep());
        System.out.print("Chethan K S\n1BM23CS074");
    }
}
