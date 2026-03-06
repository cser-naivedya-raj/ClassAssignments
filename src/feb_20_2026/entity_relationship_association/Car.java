package feb_20_2026.entity_relationship_association;

public class Car {

    private String carBrand;
    private String modelName;
    private String manufactureYear;
    private double carPrice;

    // Association
    private Engine engineObj;
    private MediaPlayer mediaSystem;

    // Constructor Injection (Engine association)
    public Car(String carBrand, String modelName, String manufactureYear, double carPrice, Engine engineObj) {
        this.carBrand = carBrand;
        this.modelName = modelName;
        this.manufactureYear = manufactureYear;
        this.carPrice = carPrice;
        this.engineObj = engineObj;
    }

    // Getters
    public String getCarBrand() {
        return carBrand;
    }

    public String getModelName() {
        return modelName;
    }

    public String getManufactureYear() {
        return manufactureYear;
    }

    public double getCarPrice() {
        return carPrice;
    }

    public Engine getEngineObj() {
        return engineObj;
    }

    public MediaPlayer getMediaSystem() {
        return mediaSystem;
    }

    // Setter Injection (MediaPlayer association)
    public void setMediaSystem(MediaPlayer mediaSystem) {
        this.mediaSystem = mediaSystem;
    }

    public void showCarDetails() {
        System.out.println("Car Information:");
        System.out.println("---------------------");
        System.out.println("Brand: " + carBrand);
        System.out.println("Model: " + modelName);
        System.out.println("Year: " + manufactureYear);
        System.out.println("Price: " + carPrice);
        System.out.println();

        if (engineObj != null) {
            engineObj.displayEngineDetails();
        } else {
            System.out.println("Engine not available.");
        }

        if (mediaSystem != null) {
            mediaSystem.displayMediaPlayerDetails();
        } else {
            System.out.println("Media system not installed.");
        }
    }

    public void setMediaPlayer(MediaPlayer mediaSystem2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setMediaPlayer'");
    }
}