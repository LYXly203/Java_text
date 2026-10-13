/*
某公司的人员分为员工和经理两种，
但经理也属于员工中的一种，公司的人员都有自己的姓名和地址，
员工和经理都有自己的工号、工资、工龄等属性，
但经理与员工的不同之处在于，经理有自己在公司对应的级别。
假设每次给员工涨一次工资能涨10%，经理能涨20%。本案例要求利用多态实现给员工和经理涨工资。
 */
public class example {

    // 人员类：员工和经理的共同父类，体现"经理也是一种员工"
    static class Person {
        protected String name;    // 姓名
        protected String address; // 地址

        public Person(String name, String address) {
            this.name = name;
            this.address = address;
        }

        public String toString() {
            return "姓名:" + name + " 地址:" + address;
        }
    }

    // 员工类
    static class Employee extends Person {
        protected String id;      // 工号
        protected double salary;  // 工资
        protected int years;      // 工龄

        public Employee(String name, String address, String id, double salary, int years) {
            super(name, address);
            this.id = id;
            this.salary = salary;
            this.years = years;
        }

        // 涨工资：员工涨 10%
        public void raiseSalary() {
            salary = salary * 1.1;
        }

        public String toString() {
            return super.toString() + " 工号:" + id + " 工龄:" + years
                    + " 工资:" + String.format("%.2f", salary);
        }
    }

    // 经理类：继承员工，额外有级别
    static class Manager extends Employee {
        private int level;        // 级别

        public Manager(String name, String address, String id, double salary, int years, int level) {
            super(name, address, id, salary, years);
            this.level = level;
        }

        // 重写涨工资方法：经理涨 20% —— 多态的体现
        @Override
        public void raiseSalary() {
            salary = salary * 1.2;
        }

        public String toString() {
            return super.toString() + " 级别:" + level;
        }
    }

    public static void main(String[] args) {
        // 父类引用指向子类对象
        Employee[] staff = {
                new Employee("张三", "北京市海淀区", "E001", 5000, 3),
                new Manager("李四", "上海市浦东新区", "M001", 10000, 8, 3),
                new Employee("王五", "广州市天河区", "E002", 6000, 5),
                new Manager("赵六", "深圳市南山区", "M002", 12000, 10, 5)
        };

        System.out.println("===== 涨工资前 =====");
        for (Employee e : staff) {
            System.out.println(e);
        }

        // 统一调用，运行时根据实际对象类型执行各自的涨薪逻辑
        for (Employee e : staff) {
            e.raiseSalary();
        }

        System.out.println("===== 涨工资后（员工+10%，经理+20%）=====");
        for (Employee e : staff) {
            System.out.println(e);
        }
    }
}
