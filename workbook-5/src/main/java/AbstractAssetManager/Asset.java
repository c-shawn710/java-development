package AbstractAssetManager;

import java.util.ArrayList;

public class Asset {
    private String description;
    private String dateAcquired;
    private double originalCost;

    public Asset(String description, String dateAcquired, double originalCost) {
        this.description = description;
        this.dateAcquired = dateAcquired;
        this.originalCost = originalCost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateAcquired() {
        return dateAcquired;
    }

    public void setDateAcquired(String dateAcquired) {
        this.dateAcquired = dateAcquired;
    }

    public double getOriginalCost() {
        return originalCost;
    }

    public void setOriginalCost(double originalCost) {
        this.originalCost = originalCost;
    }

    public double getValue() {

        return 0;
    }

    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<Asset>();

        House house1 = new House("My first house", "Jan. 1", 500000, "Ghetto st.", 3, 150, 50);
        House house2 = new House("My second house", "Dec. 1", 100000, "Rly Ghetto st.", 2, 100, 25);
        Vehicle vehicle1 = new Vehicle("My first car", "Jan. 1", 40000, "Toyota", 2017, 50000);
        Vehicle vehicle2 = new Vehicle("My second car", "Jan. 1", 40000, "Lambo", 2000, 200000);

        assets.add(house1);
        assets.add(house2);
        assets.add(vehicle1);
        assets.add(vehicle2);

        for(Asset a : assets) {
            System.out.println(a.getDescription() + " " + a.getDateAcquired() + " " + a.getOriginalCost() + " " + a.getValue());
        }
    }
}
