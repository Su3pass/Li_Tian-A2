public interface RideInterface {
    void addVisitorToQueue(Visitor v);
    void removeVisitorFromQueue(Visitor v);
    void printQueue();
    void runOneCycle();
    void addVisitorToHistory(Visitor v);
    boolean checkVisitorFromHistory(Visitor v);
}
