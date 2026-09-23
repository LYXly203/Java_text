/**
 * 模拟饲养员给动物喂食
 *
 * 设计说明：
 * 1. 接口 Feedable：声明喂食行为 feed(String food)，喂食时动物会发出叫声，并提供 getName() 获取名字。
 * 2. 抽象类 Animal：描述动物的共性（名字），实现接口的 getName()，并声明抽象方法 cry()，由子类实现叫声。
 * 3. Dog / Cat：继承 Animal，实现各自的叫声 cry() 和喂食反应 feed()。
 * 4. Feeder（饲养员）：面向接口 Feedable 编程，只调用接口方法，与具体动物解耦。
 */
public class example {

    public static void main(String[] args) {
        // 创建饲养员
        Feeder feeder = new Feeder("小明");

        // 创建小狗和小猫（用接口类型接收，面向接口编程）
        Feedable dog = new Dog("旺财");
        Feedable cat = new Cat("咪咪");

        // (1) 饲养员给小狗喂骨头，小狗"汪汪"叫
        feeder.feed(dog, "骨头");

        // (2) 饲养员给小猫喂小鱼，小猫"喵喵"叫
        feeder.feed(cat, "小鱼");
    }
}

/**
 * 接口：可喂食
 * 声明喂食行为和获取名字的方法
 */
interface Feedable {
    /** 获取动物名字 */
    String getName();

    /**
     * 喂食指定食物，动物吃食时会发出叫声
     *
     * @param food 食物名称
     */
    void feed(String food);
}

/**
 * 抽象类：动物
 * 提供名字属性，实现接口的 getName()，声明抽象的叫声方法 cry()，强制子类实现
 */
abstract class Animal implements Feedable {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    /** 动物的叫声，由具体子类实现 */
    public abstract void cry();
}

/**
 * 小狗类：继承 Animal，实现自己的叫声和喂食反应
 */
class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void cry() {
        System.out.println("汪汪！");
    }

    @Override
    public void feed(String food) {
        if ("骨头".equals(food)) {
            System.out.print(name + "看到" + food + "，开心地吃起来，");
            cry();
        } else {
            System.out.print(name + "闻了闻" + food + "，不太感兴趣，");
            cry();
        }
    }
}

/**
 * 小猫类：继承 Animal，实现自己的叫声和喂食反应
 */
class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void cry() {
        System.out.println("喵喵！");
    }

    @Override
    public void feed(String food) {
        if ("小鱼".equals(food)) {
            System.out.print(name + "看到" + food + "，开心地吃起来，");
            cry();
        } else {
            System.out.print(name + "闻了闻" + food + "，不太感兴趣，");
            cry();
        }
    }
}

/**
 * 饲养员类：负责给动物喂食
 * 只依赖接口 Feedable，不关心具体是哪种动物
 */
class Feeder {
    private String name;

    public Feeder(String name) {
        this.name = name;
    }

    /**
     * 给动物喂食
     *
     * @param animal 可喂食的动物（接口类型）
     * @param food   食物名称
     */
    public void feed(Feedable animal, String food) {
        System.out.print(name + "给" + animal.getName() + "喂" + food + "，");
        animal.feed(food);
    }
}
