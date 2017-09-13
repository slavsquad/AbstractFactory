package com.ihamen;

/**
 * Created by stepanenko.sg on 13.09.2017.
 */
public class MobileFactory implements ComponentsFactory {
    @Override
    public CPU createCPU() {
        return new MobileCPU();
    }

    @Override
    public GPU createGPU() {
        return new MobileGPU();
    }

    @Override
    public Motherboard createMotherboard() {
        return new MobileMotherboard();
    }
}
