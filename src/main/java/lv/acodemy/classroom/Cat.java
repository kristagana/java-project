package lv.acodemy.classroom;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@NoArgsConstructor
@ToString
public class Cat {
        // psvm ne delaem, potomu chto rabotaem nad objektom.
    private String name; //access modifier
    private String color;
    @Setter
    private int age;
    @Setter
    private double weight;
    private String breed;
    private String gender;
    private boolean hasFur;
    private final int MAX_ENERGY = 5; // v objekte uzhe budet 5 edinic
    private int energy = 5;


    public Cat(String name) {
        this.name = name;
    }
    // Create constructor with name, color, breed, gender, hasFur
    public Cat(String name, String color, String breed, String gender, boolean hasFur) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.gender = gender;
        this.hasFur = hasFur;
    }

//    public int getAge() {  //vozvrashaet znachenie peremennoj age. Imeet dostup k private variable
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public String getBreed() {
//        return breed;
//    }
//
//    public String getGender() {
//        return gender;
//    }
//
//    public boolean isHasFur() {
//        return hasFur;
//    }
//
//    public int getEnergy() {
//        return energy;
//    }

    public void speak() {
        System.out.println("Meoow!");
    }

    public void feed() {
        if (energy == MAX_ENERGY) {
            System.out.println("I can not eat anymore!");
        } else {
            energy++;
            System.out.println("Om-nom-nom");
        }
    }

    public void walk() {
        if (energy <= 0) {
            System.out.println("I do not have enough energy to walk!");
        } else{
            System.out.println("Walkie-walkie!");
            energy = energy - 1; // currentEnergy--
        }
    }

//    @Override
//    public String toString() {
//        // pereopredelili metod na to String, chtobi
//        // raspechatatj objekt v chitaemom formate
//        return "Cat{" +
//                "name='" + name + '\'' +
//                ", color='" + color + '\'' +
//                ", age=" + age +
//                ", weight=" + weight +
//                ", breed='" + breed + '\'' +
//                ", gender='" + gender + '\'' +
//                ", hasFur=" + hasFur +
//                '}';
//       }
}
