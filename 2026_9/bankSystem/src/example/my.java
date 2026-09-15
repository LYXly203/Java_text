package example;

public class my {
    // 账户余额初始化为0
    static double money = 0;

    // 存款方法
    public void deposit(double money) {
        if (money > 0) {
            this.money += money;
            System.out.println("存入" + money + "元，当前余额：" + this.money + "元");
        } else {
            System.out.println("当前行为不合法！");
        }
    }

    // 取款方法
    public void withdraw(double money) {
        if (money <= 0) {
            System.out.println("取款金额必须大于0！");
        } else if (money > this.money) {
            System.out.println("余额不足！当前余额：" + this.money + "元");
        } else {
            this.money -= money;
            System.out.println("取出" + money + "元，当前余额：" + this.money + "元");
        }
    }

    // 查询余额方法
    public void checkBalance() {
        System.out.println("当前余额：" + this.money + "元");
    }

    // 主方法
    public static void main(String[] args) {
        System.out.println("=== 创建账户 ===");
        my account = new my();
        account.deposit(500);

        System.out.println("\n=== 存款操作 ===");
        account.deposit(1000);

        System.out.println("\n=== 取款操作 ===");
        account.withdraw(800);

        System.out.println("\n=== 查询余额 ===");
        account.checkBalance();
    }
}
