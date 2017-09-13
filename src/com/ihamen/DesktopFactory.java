package com.ihamen;

/**
 * Created by stepanenko.sg on 13.09.2017.
 */
public class DesktopFactory implements ComponentsFactory {
    @Override
    public CPU createCPU() {
        return new DesktopCPU();
    }

    @Override
    public GPU createGPU() {
        return new DesktopGPU();
    }

    @Override
    public Motherboard createMotherboard() {
        return new DesktopMotherboard();
    }
}
