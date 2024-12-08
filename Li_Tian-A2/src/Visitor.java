public class Visitor extends Person {
    private String ticketType;
    private int entryTime;

    // Default constructor
    public Visitor() {
        super();
        this.ticketType = "General";
        this.entryTime = 0;
    }

    // Constructor with parameters
    public Visitor(String name, int age, String contactNumber, String ticketType, int entryTime) {
        super(name, age, contactNumber);
        this.ticketType = ticketType;
        this.entryTime = entryTime;
    }

    // Getters and setters
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
}
