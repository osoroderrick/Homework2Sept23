public class Main {


    public static void main(String[] args) {
        Person person1 = new Person("John","Doe");
        Person person2 = new Person("Jane","Doe");
        Person person3 = new Person("John", "Wick");
        Person person4 = new Person("Jackie", "Chan");

        Person[] personArray = {person1,person2,person3,person4};


        PersonHandler this1 = new PersonHandler(personArray);
        System.out.println(this1.forEachLoop());
        System.out.println(this1.whileLoop());
        System.out.println(this1.forLoop());
    }
}
