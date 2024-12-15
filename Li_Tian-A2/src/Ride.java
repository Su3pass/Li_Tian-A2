import java.util.LinkedList;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;

public class Ride implements RideInterface {
    private String rideName;
    private int capacity;
    private Employee rideOperator;  // 游乐设施的操作员

    // 用于存储等待的访客队列
    private LinkedList<Visitor> queue;

    // 用于存储已经乘坐过游乐设施的访客历史记录
    private LinkedList<Visitor> history;

    // 默认构造函数
    public Ride() {
        this.rideName = "Unknown amusement facilities";
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

    // Getters 和 Setters
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
        if (queue.size() >= capacity) {
            System.out.println("The amusement facilities are full and cannot be used " + v.getName() + " add to queue.");
        } else if (queue.contains(v)) {
            System.out.println(v.getName() + " is already in the queue.");
        } else {
            queue.add(v);  // 将访客添加到队列
            System.out.println(v.getName() + "already joined the queue.");
        }
    }

    @Override
    public void removeVisitorFromQueue(Visitor v) {
        if (queue.remove(v)) {
            System.out.println(v.getName() + " has been removed from the queue.");
        } else {
            System.out.println(v.getName() + "is not in the queue.");
        }
    }

    @Override
    public void printQueue() {
        if (queue.isEmpty()) {
            System.out.println("The queue is empty.");
        } else {
            System.out.println("Visitors in the queue:");
            for (Visitor v : queue) {
                System.out.println(v.getName() + " - " + v.getAge() + " years old");
            }
        }
    }

    @Override
    public void runOneCycle() {
        if (!queue.isEmpty()) {
            Visitor visitor = queue.poll();  // 获取并移除队列中的第一个访客
            System.out.println(visitor.getName() + " is currently playing.");
            addVisitorToHistory(visitor);  // 将访客添加到历史记录
        } else {
            System.out.println("There are no visitors in the queue.");
        }
    }

    @Override
    public void addVisitorToHistory(Visitor v) {
        if (!history.contains(v)) {  // 确保历史记录中不重复添加访客
            history.add(v);  // 将访客添加到历史记录
            System.out.println(v.getName() + " has been added to the historical records of amusement facilities.");
        }
    }

    @Override
    public boolean checkVisitorFromHistory(Visitor v) {
        if (history.contains(v)) {
            System.out.println(v.getName() + " has already taken this amusement ride.");
            return true;
        } else {
            System.out.println(v.getName() + " has never taken this amusement ride before.");
            return false;
        }
    }

    @Override
    public int numberOfVisitors() {
        return history.size();
    }

    @Override
    public void PrintRideHistory() {
        if (history.isEmpty()) {
            System.out.println("No visitors have taken this amusement ride.");
        } else {
            System.out.println("Visitors who have already taken the amusement facilities:");
            Iterator<Visitor> iterator = history.iterator();
            while (iterator.hasNext()) {
                Visitor v = iterator.next();
                System.out.println(v.getName() + " - " + v.getAge() + " years old");
            }
        }
    }
    // 创建排序方法
    public void sortRideHistory(Comparator<Visitor> comparator) {
        Collections.sort(history, comparator);
        System.out.println("The historical records of amusement facilities have been sorted.");
    }
}
