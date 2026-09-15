package example;

public class bank {
    // 账户余额
    static double balance = 0;

    // 存款方法
    public static void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("存入 " + amount + " 元，当前余额: " + balance + " 元");
        } else {
            System.out.println("存款金额必须大于0！");
        }
    }

    // 取款方法
    public static void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("取款金额必须大于0！");
        } else if (amount > balance) {
            System.out.println("余额不足！当前余额: " + balance + " 元");
        } else {
            balance -= amount;
            System.out.println("取出 " + amount + " 元，当前余额: " + balance + " 元");
        }
    }

    // 查询余额方法
    public static void checkBalance() {
        System.out.println("当前余额: " + balance + " 元");
    }

    public static void main(String[] args) {
        // (1) 创建账户，初始存款为500元
        System.out.println("=== 创建账户 ===");
        deposit(500);

        // (2) 向账户存入1000元
        System.out.println("\n=== 存款操作 ===");
        deposit(1000);

        // (3) 从账户取出800元
        System.out.println("\n=== 取款操作 ===");
        withdraw(800);

        // 查询最终余额
        System.out.println("\n=== 查询余额 ===");
        checkBalance();
    }
}
