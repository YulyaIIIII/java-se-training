public class Zoozoo {

    public static void main(String[] args) {
        Human[] myHuman = {
                new Human("Kolya", "Rhjdfhgjdf", "+380675987564"),
                new Human("Tanya", "Wmdfhhd", "+380699568755"),
                new Human("Andrei", "Tksdhfksd", "+380674588766")
        };
        Pet[] myPets = {
                new Dog(20, "Sharik", 4, myHuman[0]),
                new Cat(6, "Barsik", 4, myHuman[1]),
                new Parrot(1, "Kesha", 2, myHuman[2])
        };
        for (Pet p : myPets) {
            System.out.printf("(%s)'%s'.weight = %d (kg) " + "and he has %d legs. " + "Owner - %s %s (%s) %n", p.getType(), p.getName(), p.getWeight(), p.getlegs(), p.getowner().getName(), p.getowner().getSurname(), p.getowner().getphonenumber());
        }
    }
}

class Human {
    private String Name;
    private String Surname;
    private String phonenumber;

    public Human (String Name, String Surname, String phonenumber) {
        this.Name = Name;
        this.Surname = Surname;
        this.phonenumber = phonenumber;
    }
    public String getName() {
        return Name;
    }
    public String getSurname() {
        return Surname;
    }
    public String getphonenumber() {
        return phonenumber;
    }
}

class Animal {
    public static enum Type {
        AMPHIBIA,
        NATATORIAL,
        FLYING
    }

    private int weight;
    private int legs;
    private Type littletype;

    public Animal(int weight, int legs, Type littletype) {
        this.weight = weight;
        this.legs = legs;
        this.littletype = littletype;
    }

    public int getWeight() {
        return weight;
    }

    public int getlegs() {
        return legs;
    }
    public Type getType() {
        return littletype;
    }
}

class Pet extends Animal {

    private String name;
    private Human owner;

    public Pet(int weight, String name, int legs, Human owner, Type littletype) {
        super(weight, legs, littletype);
        this.name = name;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }
    public Human getowner() {
        return owner;

    }

}

class Cat extends Pet {

    public Cat(int weight, String name, int legs, Human owner) {
        super(weight, name, legs, owner, Type.NATATORIAL);
    }

    public void catchMouse() {
        System.out.println("Catching mice...");
    }
}

class Dog extends Pet {

    public Dog(int weight, String name, int legs, Human owner) {
        super(weight, name, legs, owner, Type.AMPHIBIA);
    }

    public void executeCommand(String command) {
        System.out.println("Doing '" + command + "'");
    }
}

class Parrot extends Pet {

    public Parrot(int weight, String name, int legs, Human owner) {
        super(weight, name, legs, owner, Type.FLYING);
    }

    public void repeatSmth() {
        System.out.println("Say 'Hello'");
    }
}