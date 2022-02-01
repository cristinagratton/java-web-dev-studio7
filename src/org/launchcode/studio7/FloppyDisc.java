package org.launchcode.studio7;

public class FloppyDisc extends BaseDisc implements ReadDisc{
    public FloppyDisc(int storageCapacity, int data, double spinningSpeed, String name, String contents, String discType) {
        super(storageCapacity, data, spinningSpeed, name, contents, discType);
    }

    @Override
    public void readDisc() {

    }
}
