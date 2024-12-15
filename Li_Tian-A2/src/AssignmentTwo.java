public class AssignmentTwo {
    public static void main(String[] args) {
        AssignmentTwo assignment = new AssignmentTwo();
        assignment.partThree();  // 调用 partThree 方法
        assignment.partFourA();
        assignment.partFourB();
    }
    public void partThree(){
        System.out.println("Part 3");
        // 创建一个新的 Ride 对象
        Ride ride = new Ride("Ferris Wheel", 10, null);  // 这里将操作员设置为 null，因为没有给出Employee类的要求

        // 创建至少 5 个 Visitor 对象并添加到队列
        Visitor visitor1 = new Visitor("Alice", 25, "1234567890", "VIP", 1001);
        Visitor visitor2 = new Visitor("Bob", 30, "0987654321", "General", 1002);
        Visitor visitor3 = new Visitor("Charlie", 28, "1122334455", "VIP", 1003);
        Visitor visitor4 = new Visitor("David", 35, "5566778899", "General", 1004);
        Visitor visitor5 = new Visitor("Eva", 22, "6677889900", "Student", 1005);

        // 将访客添加到队列
        ride.addVisitorToQueue(visitor1);
        ride.addVisitorToQueue(visitor2);
        ride.addVisitorToQueue(visitor3);
        ride.addVisitorToQueue(visitor4);
        ride.addVisitorToQueue(visitor5);

        // 从队列中移除一个访客
        ride.removeVisitorFromQueue(visitor3);

        // 打印队列中的所有访客
        ride.printQueue();
        System.out.println("——————————————————————————————————————————————————————————————————————————————————");
    }
    public void partFourA(){
        System.out.println("Part 4A");
        // 创建一个新的 Ride 对象
        Ride ride = new Ride("Ferris wheel", 10, null);  // 没有给出操作员的要求，所以这里传入 null

        // 创建至少 5 个 Visitor 对象并添加到队列
        Visitor visitor1 = new Visitor("Alice", 25, "1234567890", "VIP", 1001);
        Visitor visitor2 = new Visitor("Bob", 30, "0987654321", "普通", 1002);
        Visitor visitor3 = new Visitor("Charlie", 28, "1122334455", "VIP", 1003);
        Visitor visitor4 = new Visitor("David", 35, "5566778899", "普通", 1004);
        Visitor visitor5 = new Visitor("Eva", 22, "6677889900", "学生", 1005);

        // 将访客添加到队列
        ride.addVisitorToQueue(visitor1);
        ride.addVisitorToQueue(visitor2);
        ride.addVisitorToQueue(visitor3);
        ride.addVisitorToQueue(visitor4);
        ride.addVisitorToQueue(visitor5);

        // 运行一个循环，让访客体验游乐设施
        ride.runOneCycle();
        ride.runOneCycle();
        ride.runOneCycle();

        // 检查一个特定访客是否已体验过游乐设施
        ride.checkVisitorFromHistory(visitor3);

        // 打印游乐设施历史记录中的访客数量
        System.out.println("Number of visitors who have already taken the amusement facilities:" + ride.numberOfVisitors());

        // 打印所有已经乘坐过游乐设施的访客
        ride.PrintRideHistory();
        System.out.println("——————————————————————————————————————————————————————————————————————————————————");
    }
    public void partFourB(){
        System.out.println("Part 4B");
        // 创建一个新的 Ride 对象
        Ride ride = new Ride("Ferris Wheel", 10, null); // 这里操作员设为 null

        // 创建至少 5 个 Visitor 对象并添加到历史记录
        Visitor visitor1 = new Visitor("Alice", 25, "1234567890", "VIP", 1001);
        Visitor visitor2 = new Visitor("Bob", 30, "0987654321", "General", 1002);
        Visitor visitor3 = new Visitor("Charlie", 28, "1122334455", "VIP", 1003);
        Visitor visitor4 = new Visitor("David", 35, "5566778899", "General", 1004);
        Visitor visitor5 = new Visitor("Eva", 22, "6677889900", "Student", 1005);

        // 添加访客到历史记录
        ride.addVisitorToHistory(visitor1);
        ride.addVisitorToHistory(visitor2);
        ride.addVisitorToHistory(visitor3);
        ride.addVisitorToHistory(visitor4);
        ride.addVisitorToHistory(visitor5);

        // 打印原始的历史记录
        System.out.println("Original historical records of amusement facilities:");
        ride.PrintRideHistory();

        // 使用 VisitorComparator 排序
        VisitorComparator comparator = new VisitorComparator();
        ride.sortRideHistory(comparator);

        // 打印排序后的历史记录
        System.out.println("\nSorted amusement facility history:");
        ride.PrintRideHistory();
        System.out.println("——————————————————————————————————————————————————————————————————————————————————");
    }
    public void partFive(){ }
    public void partSix(){ }
    public void partSeven(){ }
}   