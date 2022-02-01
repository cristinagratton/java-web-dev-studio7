package org.launchcode.studio7;

public class VinylRecords extends BaseDisc implements SpinDisc {
    public VinylRecords(int storageCapacity, int data, double spinningSpeed, String name, String contents, String discType) {
        super(storageCapacity, data, spinningSpeed, name, contents, discType);
    }

    @Override
    public void spinDisc() {

    }
}
