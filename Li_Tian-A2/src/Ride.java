import java.util.LinkedList;
import java.util.Queue;

public class Ride implements RideInterface {
    private String rideName;
    private int capacity;
    private Employee rideOperator;  // 操作游乐设施的员工

    // 用于存储等待的访客队列
    private Queue<Visitor> queue;

    // 用于存储已经乘坐过游乐设施的访客历史记录
    private LinkedList<Visitor> history;

    // 默认构造函数
    public Ride() {
        this.rideName = "Unknown Ride";
        this.capacity = 0;
        this.rideOperator = null;
        this.queue = new LinkedList<>();
        this.history = new LinkedList<>();
    }

    // 带参数的构造函数
    public Ride(String rideName, int capacity, Employee rideOperator) {
        this.rideName = rideName;
        this.capacity = capacity;
        this.rideOperator = rideOperator;
        this.queue = new LinkedList<>();
        this.history = new LinkedList<>();
    }

    // Getters and Setters
    public String getRideName() {
        return rideName;
    }

    public void setRideName(String rideName) {
        this.rideName = rideName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Employee getRideOperator() {
        return rideOperator;
    }

    public void setRideOperator(Employee rideOperator) {
        this.rideOperator = rideOperator;
    }

    // 实现 RideInterface 中的方法
    @Override
    public void addVisitorToQueue(Visitor v) {
        queue.add(v);  // 将访客添加到队列
        System.out.println(v.getName() + " has been added to the queue.");
    }

    @Override
    public void removeVisitorFromQueue(Visitor v) {
        if (queue.remove(v)) {
            System.out.println(v.getName() + " has been removed from the queue.");
        } else {
            System.out.println(v.getName() + " is not in the queue.");
        }
    }

    @Override
    public void printQueue() {
        if (queue.isEmpty()) {
            System.out.println("The queue is empty.");
        } else {
            System.out.println("Visitors in the queue:");
            for (Visitor v : queue) {
                System.out.println(v.getName());
            }
        }
    }

    @Override
    public void runOneCycle() {
        if (!queue.isEmpty()) {
            Visitor visitor = queue.poll();  // 获取并移除队列中的第一个访客
            System.out.println(visitor.getName() + " is now riding.");
            addVisitorToHistory(visitor);  // 将访客添加到历史记录
        } else {
            System.out.println("No visitors in the queue.");
        }
    }

    @Override
    public void addVisitorToHistory(Visitor v) {
        history.add(v);  // 将访客添加到历史记录中
        System.out.println(v.getName() + " has been added to the ride history.");
    }

    @Override
    public boolean checkVisitorFromHistory(Visitor v) {
        if (history.contains(v)) {
            System.out.println(v.getName() + " has ridden the attraction.");
            return true;
        } else {
            System.out.println(v.getName() + " has not ridden the attraction.");
            return false;
        }
    }
}
