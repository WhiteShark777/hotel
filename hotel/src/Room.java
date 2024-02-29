import java.util.ArrayList;
import java.util.List;

public abstract class Room {
    private String roomNumber;
    private String type;
    private boolean isAvailable;
    private List<Observer> observers = new ArrayList<>();

    public Room(String roomNumber, String type) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.isAvailable = false;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public String getType() {
        return type;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
        if (isAvailable) {
            notifyObservers();
        }
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public abstract void displayInfo();
}
