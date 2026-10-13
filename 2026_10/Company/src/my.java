public class my  {
    static class Person {
        protected String name;
        protected String address;

        public Person(String name, String address) {
            this.name = name;
            this.address = address;
        }



        public String toString() {
            return "姓名:" + name + " 地址:" + address;
        }
    }

    static class Employee extends my.Person {
        protected String id;
        protected int years;
        protected double salary;

        public Employee(String name, String address, String id, int years, double salary) {
           super(name, address);
            this.id = id;
            this.years = years;
            this.salary = salary;
        }

        public void raiseSalary(){
            salary = salary * 1.2;
        }

        public String toString() {
            return super.toString() + " ID:" + id + " 工作年限:" + years + " 薪水:" + String.format("%.2f", salary);
        }
    }

    static class Manager extends my.Employee{
        private int level;

        public Manager(String name, String address, String id, double salary, int years, int level) {
            super(name, address, id, years, salary);
            this.level = level;
        }

        @Override
        public void raiseSalary() {
            salary = salary * 1.2;
        }

        public String toString() {
            return super.toString() + " 级别:" + level;
        }
    }

    public static void main(String[] args) {
        my.Employee[] staff = {
                new my.Employee("张三", "北京市朝阳区", "E001", 5000, 3),
                new my.Manager("李四", "上海市浦东新区", "M001", 10000, 8, 3),
                new my.Employee("王五", "广州市天河区", "E002", 6000, 5),
                new my.Manager("赵六", "深圳市南山区", "M002", 12000, 10, 5)
        };

        System.out.println("===== 涨工资前 =====");
        for (my.Employee e : staff) {
            System.out.println(e);
        }

        for (my.Employee e : staff) {
            e.raiseSalary();
        }

        System.out.println("===== 涨工资后 =====");
        for (my.Employee e : staff) {
            System.out.println(e);
        }
    }
}

