public class Animal {
    private int age;
    public Animal(int age) {
        this.age = age;
        System.out.println("An Animal has been created");
    }
    public void eat(){
        System.out.println("An animal is eating");
    }
    public int getAge(){
        return age;
    }
    public static void main(String[] args) {
        Animal a = new Animal(5);
        Dog d = new Dog();
        Cat c = new Cat();
        d.ruff();
        System.out.println("The dog age is: " + d.getAge());
        c.meow();
        System.out.println("The cat  age is: " + c.getAge());
        a.eat();
        d.eat();
        c.eat();
        d.run();
        c.prance();

        }
    }

