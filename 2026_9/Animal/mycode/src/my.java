interface Feedable {

    String GetName();

    void food(String food);
}

//构造抽象类动物主体
abstract class Animal implements Feedable {
    protected String name;

    // 构造方法
    public Animal(String name) {
        this.name = name;
    }

    //重写方法获取动物名字
    @Override
    public String GetName(){
        return name;
    }

    //构造抽象方法动物叫声
    public abstract void cry();

}

//构造饲养员类
class Feeder {
    private String name;

    public Feeder(String name) {
        this.name = name;
    }

    //构造喂食方法
    public void Feed(Feedable animal,String food){
        System.out.println(name + "正在给" + animal.GetName() + "喂食" + food);
        animal.food(food);
    }
}

//构造子类Dog继承Animal
class Dog extends Animal {

    //构造方法用super关键字获取父类的name属性
    public Dog(String name) {
        super(name);
    }

    @Override
    public void cry() {
        System.out.println("大狗叫");
    }

    @Override
    public void food(String food) {
        if (food.equals("骨头")) {
            System.out.println(name + "看到" + food + "，开心地吃起来，");
            cry();
        }else {
            System.out.println(name + "闻了闻" + food + "，不感兴趣，");
            cry();
        }
    }
}

//构造子类Cat继承Animal
class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void cry(){
        System.out.println("老吴");
    }

    @Override
    public void food(String food) {
        if (food.equals("口香糖")){
            System.out.println(name + "看到"+ food + "；（￣︶￣）↗触发嚼口香糖回血　");
            cry();
        }else {
            System.out.println(name + "闻了闻" + food + "，哈气，");
            cry();
        }
    }
}

public class my {
    public static void main(String[] args) {
        Feeder feeder = new Feeder("张三");
        Dog dog = new Dog("大狗");
        Cat cat = new Cat("耄耋");

        feeder.Feed(dog, "骨头");
        feeder.Feed(cat, "口香糖");
    }
}
