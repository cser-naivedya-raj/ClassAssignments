package feb_20_2026.entity_relationship_association;

public class JavaApp {

    public static void startApplication() {

        // Create Engine object
        Engine engineObj = new Engine(1500, "Water Based", 4);

        // Constructor Injection (Engine association)
        Car vehicle = new Car("Hyundai", "Creta", "Made in India", 963963.96, engineObj);

        // Create MediaPlayer object
        MediaPlayer mediaSystem = new MediaPlayer("Boat", "Music Player", 369369.36);

        // Setter Injection (MediaPlayer association)
        vehicle.setMediaPlayer(mediaSystem);

        // Display car information
        vehicle.showCarDetails();
    }

    public static void execution() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'execution'");
    }
}