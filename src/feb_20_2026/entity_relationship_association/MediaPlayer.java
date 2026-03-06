package feb_20_2026.entity_relationship_association;

public class MediaPlayer {

    private String mediaBrand;
    private String modelName;
    private double cost;

    public MediaPlayer(String mediaBrand, String modelName, double cost) {
        this.mediaBrand = mediaBrand;
        this.modelName = modelName;
        this.cost = cost;
    }

    public String getMediaBrand() {
        return mediaBrand;
    }

    public String getModelName() {
        return modelName;
    }

    public double getCost() {
        return cost;
    }

    public void showMediaDetails() {
        System.out.println("Media Player Information:");
        System.out.println("---------------------");
        System.out.println("Brand: " + mediaBrand);
        System.out.println("Model: " + modelName);
        System.out.println("Price: " + cost);
        System.out.println();
    }

    public void displayMediaPlayerDetails() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'displayMediaPlayerDetails'");
    }
}