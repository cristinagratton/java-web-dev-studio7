package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc{
    public CD(int storageCapacity, int data, double spinningSpeed, String name, String contents, String discType) {
        super(storageCapacity, data, spinningSpeed, name, contents, discType);
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of " + this.getSpinningSpeed());
    }

    @Override
    public void readDisc() {
        System.out.println("A CD has a data amount of " + this.getData());
    }

}
