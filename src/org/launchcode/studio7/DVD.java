package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc{
    public DVD(int storageCapacity, int data, double spinningSpeed, String name, String contents, String discType) {
        super(storageCapacity, data, spinningSpeed, name, contents, discType);
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of " + this.getSpinningSpeed());
    }

    @Override
    public void readDisc() {
        System.out.println("A DVD has a data amount of " + this.getData());
    }


}
