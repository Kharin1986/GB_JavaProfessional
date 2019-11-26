package HW1.FruitsTask;

import java.util.ArrayList;
import java.util.Arrays;


public class  Box <T extends Fruit> {
    private ArrayList <T>  fruits = new ArrayList<>();

    public Box(ArrayList<T> fruits) {
        this.fruits.addAll(fruits);
    }

    public Box(T... fruits) {
        this.fruits.addAll(Arrays.asList(fruits));
    }

    public boolean compareTo (Box <?> another){ // <?> - любой тип попадающий под описание T extends Fruit
        return Math.abs(this.getWeight()- another.getWeight())<0.0001f;
    }




    public float getWeight() {
        float weight=0.0f;
// Чисто поугарать))
//        try {
//            weight = this.fruits.size()*this.fruits.get(0).getWeight();
//        } catch (RuntimeException e) {
//            e.printStackTrace();
//        }
        for (T fruit:fruits) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public void addFruit (T fruit){
        fruits.add(fruit);
    }

    public void addAll(ArrayList <T> fruits){
        this.fruits.addAll(fruits);
    }
    public void addFromAnotherBox(Box<T> another){
        for (T fruit : fruits) {
            another.addFruit(fruit);
        }
        fruits.clear();
    }

    public void clear(){
        this.fruits.clear();
    }

}
