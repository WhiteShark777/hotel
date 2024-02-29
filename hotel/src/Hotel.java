public class Hotel {
    public static void main(String[] args) {
        Room singleRoom = new SingleRoom("101");
        Room doubleRoom = new DoubleRoom("102");

        Client client1 = new Client("Арман");
        Client client2 = new Client("Кемел");

        singleRoom.addObserver(client1);
        doubleRoom.addObserver(client2);

        singleRoom.setAvailable(true);
        doubleRoom.setAvailable(true);
    }
}
