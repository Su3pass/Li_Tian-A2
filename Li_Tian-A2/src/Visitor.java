public class Visitor extends Person {
    private String ticketType;
    private int entryTime;

    // 默认构造函数
    public Visitor() {
        super();
        this.ticketType = "General";
        this.entryTime = 0;
    }

    // 只需要名字和年龄的构造函数
    public Visitor(String name, int age) {
        super(name, age, "Unknown"); // 假设 contactNumber 默认为 "Unknown"
        this.ticketType = "General"; // 默认为 "General"
        this.entryTime = 0; // 默认值为 0
    }

    // 带参数的构造函数
    public Visitor(String name, int age, String contactNumber, String ticketType, int entryTime) {
        super(name, age, contactNumber);
        this.ticketType = ticketType;
        this.entryTime = entryTime;
    }

    // Getters 和 Setters
    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public int getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(int entryTime) {
        this.entryTime = entryTime;
    }
    @Override
    public String getName() {
        return super.getName();  // Call the getName() method from the Person class
    }
}
