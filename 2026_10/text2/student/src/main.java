/*
定义Student类，里面有ID、Name、Grade三个属性。
建立两个构造方法：第一个构造方法给ID赋值；
第二个构造方法给Name、Grade赋值，并在其中调用第一个构造方法给ID赋值。
建立一个printinfo()方法，输出学生信息。主方法中创建对象并输出。
 */
public class main {

    // 学生类
    static class Student {
        private String ID;   // 学号
        private String Name; // 姓名
        private int Grade;   // 成绩

        // 第一个构造方法：给ID赋值
        public Student(String ID) {
            this.ID = ID;
        }

        // 第二个构造方法：调用第一个构造方法给ID赋值，再给Name、Grade赋值
        public Student(String ID, String Name, int Grade) {
            this(ID); // 调用本类中的第一个构造方法
            this.Name = Name;
            this.Grade = Grade;
        }

        // 输出学生信息
        public void printinfo() {
            System.out.println("学号:" + ID + " 姓名:" + Name + " 成绩:" + Grade);
        }
    }

    public static void main(String[] args) {
        // 创建对象并输出学生信息
        Student s1 = new Student("2026001", "张三", 92);
        s1.printinfo();

        Student s2 = new Student("2026002", "李四", 85);
        s2.printinfo();
    }
}
