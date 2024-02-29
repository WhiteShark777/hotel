public class DoubleRoom extends Room {
    public DoubleRoom(String roomNumber) {
        super(roomNumber, "двухместный");
    }

    @Override
    public void displayInfo() {
        System.out.println("Двухместный номер " + getRoomNumber() + " теперь " + (isAvailable() ? "доступен" : "не доступен"));
    }
}
