package org.launchcode.studio7;

public abstract class BaseDisc {
    //fields in both (abstract class)
    private int storageCapacity;
    private int data;
    private double spinningSpeed;
    private String name;
    private String contents;
    private String discType;

    public BaseDisc(int storageCapacity, int data, double spinningSpeed, String name, String contents, String discType) {
        this.storageCapacity = storageCapacity;
        this.data = data;
        this.spinningSpeed = spinningSpeed;
        this.name = name;
        this.contents = contents;
        this.discType = discType;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public double getSpinningSpeed() {
        return spinningSpeed;
    }

    public void setSpinningSpeed(double spinningSpeed) {
        this.spinningSpeed = spinningSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public void printInformation() {
        System.out.println("Disc Information: ");
        System.out.println("Name: " + this.getName());
        System.out.println("Storage Capacity: " + this.getStorageCapacity());
        System.out.println("Contents: " + this.getContents());
        System.out.println("Disc Type: " + this.getDiscType());
    }

}
