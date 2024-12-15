public class AssignmentTwo {
    public static void main(String[] args) {
        AssignmentTwo assignment = new AssignmentTwo();
        assignment.partThree();  // 调用 partThree 方法
    }
    public void partThree(){
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

    }
    public void partFourA(){ }
    public void partFourB(){ }
    public void partFive(){ }
    public void partSix(){ }
    public void partSeven(){ }
}