
/**
 * 手机系统演示程序
 * 题目：有两款配置和功能都不同的手机，实现查看手机配置及功能
 */
public class example2 {
    public static void main(String[] args) {
        // 创建两款不同配置的手机对象
        Phone phone1 = new ApplePhone("iPhone 15", "iOS 17", 7999, 256);
        Phone phone2 = new AndroidPhone("小米14", "MIUI 14", 4999, 512);

        System.out.println("========== 苹果手机信息 ==========");
        phone1.showConfig();
        phone1.call("张三");
        phone1.playGame();
        phone1.playMusic("《稻香》");

        System.out.println("\n========== 安卓手机信息 ==========");
        phone2.showConfig();
        phone2.call("李四");
        phone2.playGame();
        phone2.playMusic("《晴天》");
    }
}

/**
 * 手机父类 - 定义手机的通用属性和方法
 */
class Phone {
    protected String brand;      // 品牌
    protected String model;      // 型号
    protected String os;         // 操作系统
    protected int price;         // 价格（元）
    protected int memory;        // 内存（GB）

    // 构造方法
    public Phone(String model, String os, int price, int memory) {
        this.model = model;
        this.os = os;
        this.price = price;
        this.memory = memory;
    }

    // 显示手机配置信息
    public void showConfig() {
        System.out.println("品牌：" + brand);
        System.out.println("型号：" + model);
        System.out.println("操作系统：" + os);
        System.out.println("价格：" + price + "元");
        System.out.println("内存：" + memory + "GB");
    }

    // 自动拨号功能
    public void call(String name) {
        System.out.println("正在拨打 " + name + " 的电话...");
        System.out.println("通话中...");
    }

    // 游戏功能
    public void playGame() {
        System.out.println("正在启动游戏...");
        System.out.println("游戏中...");
    }

    // 播放歌曲功能
    public void playMusic(String songName) {
        System.out.println("正在播放歌曲：" + songName);
    }
}

/**
 * 苹果手机子类 - 继承Phone类
 */
class ApplePhone extends Phone {

    public ApplePhone(String model, String os, int price, int memory) {
        super(model, os, price, memory);
        this.brand = "Apple";
    }

    // 重写显示配置方法，添加苹果特色
    @Override
    public void showConfig() {
        super.showConfig();
        System.out.println("特色功能：Face ID 人脸识别");
    }

    // 重写游戏方法
    @Override
    public void playGame() {
        System.out.println("苹果手机正在启动游戏...");
        System.out.println("使用Metal图形引擎...");
    }
}

/**
 * 安卓手机子类 - 继承Phone类
 */
class AndroidPhone extends Phone {

    public AndroidPhone(String model, String os, int price, int memory) {
        super(model, os, price, memory);
        this.brand = "Android";
    }

    // 重写显示配置方法，添加安卓特色
    @Override
    public void showConfig() {
        super.showConfig();
        System.out.println("特色功能：支持NFC门禁卡");
    }

    // 重写游戏方法
    @Override
    public void playGame() {
        System.out.println("安卓手机正在启动游戏...");
        System.out.println("使用Vulkan图形引擎...");
    }
}