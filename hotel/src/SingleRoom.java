import java.util.ArrayList;
import java.util.List;

public class SingleRoom extends Room {
    public SingleRoom(String roomNumber) {
        super(roomNumber, "одноместный");
    }

    @Override
    public void displayInfo() {
        System.out.println("Одноместный номер " + getRoomNumber() + " теперь " + (isAvailable() ? "доступен" : "не доступен"));
    }
}

