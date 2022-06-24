public class DoorTest{

    public static void main(String[] args) {
        Door door;
        door = new Door();

        if(door.isClosed()){
            if(door.isLocked()){
                door.unlock();
                door.open();
            }
            door.Avanza();
        }
    }
}