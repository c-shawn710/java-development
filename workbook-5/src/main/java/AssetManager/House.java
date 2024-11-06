package AssetManager;

import org.w3c.dom.ls.LSOutput;

public class House extends Asset {
    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public double getValue() {
        double value = 0;
        if (this.condition == 1) {
            value = (180 * this.squareFoot) + (.25 * this.lotSize);
        }
        if (this.condition == 2) {
            value = (130 * this.squareFoot) + (.25 * this.lotSize);
        }
        if (this.condition == 3) {
            value = (90 * this.squareFoot) + (.25 * this.lotSize);
        }
        if (this.condition == 4) {
            value = (80 * this.squareFoot) + (.25 * this.lotSize);
        } return value;
    }

    @Override
    public String toString() {
        return "House{" +
                "address='" + address + '\'' +
                ", condition=" + condition +
                ", squareFoot=" + squareFoot +
                ", lotSize=" + lotSize +
                '}';
    }
}
