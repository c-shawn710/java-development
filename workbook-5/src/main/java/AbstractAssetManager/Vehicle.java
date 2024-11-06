package AbstractAssetManager;

import java.time.LocalDate;

public class Vehicle extends Asset {
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue() {
        double value = getOriginalCost();
        int age = LocalDate.now().getYear() - this.year;

        if(getOdometer() > 100000 && !(this.makeModel.equalsIgnoreCase("honda") || this.makeModel.equalsIgnoreCase("toyota"))) {
            value *= (1 - .25);
        }

        if(age <= 3) {
            value *= (1 - .03 * age);
        } else if(age > 3 && age <= 6) {
            value *= (1 - .06 * (age - 3));
        } else if(age > 6 && age <= 10) {
            value *= (1 - .08 * (age - 6));
        } else if(age > 10) {
            value = 1000;
        }
        return value;
    }
}
