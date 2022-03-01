import java.util.ArrayList;

interface Eatable {}

class Fruit implements Eatable {
    public String toString() { return "Fruit";}
}

class Apple extends Fruit { public String toString() { return "Apple";}}
class Grape extends Fruit { public String toString() { return "Grape";}}
class Toy { public String toString() { return "Toy";}}

class Box<T>{
    ArrayList<T> list = new ArrayList<T>();
    void add(T item) {list.add(item);}
    T get(int i)    {return list.get(i);}
    int size()  {return list.size();}
    public String toString() {return list.toString();}
}

class FruitBox<T extends Fruit & Eatable> extends Box<T> {}



public class Ex12_2 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
        FruitBox<Apple> appleBox = new FruitBox<Apple>();
        FruitBox<Grape> grapeBox = new FruitBox<Grape>();
//        FruitBox<Grape> grapeBox = new FruitBox<Apple>(); 에러. 타입 불일치
//        FruitBox<Toy> ToyBox = new FruitBox<Toy>();

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        appleBox.add(new Apple());
//        appleBox.add(new Grape()); 에러. Grape는 Apple의 자손이 아니다.
    }
}
