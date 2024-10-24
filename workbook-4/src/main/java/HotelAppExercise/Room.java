package HotelAppExercise;

public class Room {
    private int numOfBed;
    private double price;
    private boolean occupied;
    private boolean dirty;

    public Room(int numOfBed, double price, boolean occupied, boolean dirty) {
        this.numOfBed = numOfBed;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }

    public int getNumOfBed() {
        return numOfBed;
    }

    public void setNumOfBed(int numOfBed) {
        this.numOfBed = numOfBed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public void setDirty(boolean dirty) {
        this.dirty = dirty;
    }

    public boolean isAvailable() {
        return !occupied && !dirty;
    }

    public boolean checkIn() {
        return occupied && dirty;
    }

    public boolean checkOut() {
        return !occupied && dirty;
    }

    public boolean cleanRoom() {
        return isAvailable();
    }
}
