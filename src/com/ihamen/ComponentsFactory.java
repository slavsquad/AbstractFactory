package com.ihamen;

/**
 * Created by stepanenko.sg on 13.09.2017.
 */
public interface ComponentsFactory {
    public abstract CPU createCPU();
    public abstract GPU createGPU();
    public abstract Motherboard createMotherboard();
}
