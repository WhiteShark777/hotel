public class Client implements Observer {
    private String name;

    public Client(String name) {
        this.name = name;
    }

    @Override
    public void update(Room room) {
        System.out.println("Уважаемый " + name + ", номер " + room.getRoomNumber() + " (" + room.getType() + ") теперь доступен для бронирования!");
    }
}
