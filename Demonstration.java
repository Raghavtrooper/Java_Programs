class Superclass {
    private int privateVar;

    public Superclass(int value) {
        privateVar = value;
    }

    public int getPrivateVar() {
        return privateVar;
    }
}

class Subclass extends Superclass {
    public Subclass(int value) {
        super(value);
    }

    public void display() {

        System.out.println("Private variable via public method: " + getPrivateVar());
    }
}

public class Demonstration {
    public static void main(String[] args) {
        Subclass obj = new Subclass(10);
        obj.display();
    }
}
