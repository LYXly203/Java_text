public class my {
    class Phone {
        protected String brand;      // 品牌
        protected String model;
        protected String os;
        protected int price;
        protected int memory;

        //构造方法
        public Phone(String brand, String model, String os, int price, int memory) {
            this.brand = brand;
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

        //自动拨号
        public void call(String number) {
            System.out.println("正在拨打 " + number + " 的电话...");
            System.out.println("通话中...");
        }

        //游戏功能
        public void Playgame(){
            System.out.println("正在启动游戏...");
            System.out.println("游戏中...");
        }

        //音乐功能
        public void Music(String song){
            System.out.println("正在播放歌曲：" + song);
        }
    }

    //创建子类（继承）
    class ApplePhone extends Phone {

        public ApplePhone(String model, String os, int price, int memory) {
            super("Apple", model, os, price, memory);
            this.brand = "Apple";
        }

        @Override
        public void showConfig() {
            super.showConfig();
            System.out.println("苹果特色：Face ID、iOS系统");
        }

    }

    class  AndroidPhone extends Phone {

        public AndroidPhone(String model, String os, int price, int memory) {
            super("Android", model, os, price, memory);
            this.brand = "Android";
        }

        @Override
        public void showConfig() {
            super.showConfig();
            System.out.println("安卓特色：多样化品牌、可定制化系统");
        }
    }

    //主方法
    public static void main(String[] args) {
        my myInstance = new my();

        // 创建苹果手机对象
        ApplePhone applePhone = myInstance.new ApplePhone("iPhone 15", "iOS 17", 9999, 128);
        System.out.println("=== 苹果手机信息 ===");
        applePhone.showConfig();
        applePhone.call("1234567890");
        applePhone.Playgame();
        applePhone.Music("Shape of You");

        System.out.println("\n=== 安卓手机信息 ===");
        // 创建安卓手机对象
        AndroidPhone androidPhone = myInstance.new AndroidPhone("Samsung Galaxy S23", "Android 13", 7999, 256);
        androidPhone.showConfig();
        androidPhone.call("0987654321");
        androidPhone.Playgame();
        androidPhone.Music("Blinding Lights");
    }
}
