package lv.acodemy.classroom;

public class ObjectExample {
    public static void main(String[] args) {

//        Cat barsik = new Cat() - pustoj object poluchaet vse peremennie iz klassa Cat
        Cat barsik = new Cat("Barsik"); // objekt budet trebovatj vvesti imja
        System.out.println(barsik.getAge());
        System.out.println(barsik);

        barsik.setAge(4);
        System.out.println(barsik.getAge());

        barsik.speak();
        barsik.feed();

        //Create getters and setters for: weight
        // For all other fields create getter method;

        barsik.setWeight(5.16);
        System.out.println(barsik.getWeight());
        System.out.println(barsik);

        // Create constructor with name, color, breed, gender, hasFur
        // Create cat with all these fields passed into constructor
        // Print your cat

        // My cat's name is %s, My cat is %d years old. printf;

        Cat kota = new Cat("Kit","Grey","Russian Blue","female",true);
        kota.setAge(2);
        kota.setWeight(3.40);
        System.out.println(kota);

        System.out.printf("My cat's name is %s, My cat is %d years old.\n", kota.getName(), kota.getAge());

        kota.walk();
        kota.walk();
        kota.walk();
        kota.walk();
        kota.walk();
        kota.walk();
        System.out.println(kota.getEnergy());

        // Update method feed, so we can feed our cat;
        // Every feed method call increasy energy for 1;

        kota.feed();
        kota.feed();
        kota.feed();
        kota.feed();
        kota.feed();
        kota.feed();

    }

}
