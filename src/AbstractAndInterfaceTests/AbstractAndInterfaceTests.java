package AbstractAndInterfaceTests;

import animal.Animal;
import animal.Chicken;
import animal.Tiger;
import edible.Edible;
import fruit.Apple;
import fruit.Fruit;
import fruit.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals= new Animal[2];
        animals[0]= new Tiger();
        animals[1]= new Chicken();
        for( Animal animal: animals){
            System.out.println(animal.makeSound());
            //Cách 1:
            //Chỉ có đối tượng instance of class. ko có ngược lại Chicken instanceof animal
            //vì Down casting hay xảy ra lỗi nên người ta phải hay dùng instanceof
            if(animal instanceof Chicken){
                 Edible edible= (Chicken) animal;//Hiểu là 1 thằng cha 1 thằng con
                System.out.println(edible.howToEat());
            }
        }
        //cách 2:
        //System.out.println(((Chicken) animals[1]).howToEat());
        Fruit[] fruits= new Fruit[2];
        fruits[0]= new Orange();
        fruits[1]=new Apple();
        for (Fruit fruit:
             fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
