package com.ihamen.factories;

import com.ihamen.CPU.CPU;
import com.ihamen.CPU.MobileCPU;
import com.ihamen.GPU.GPU;
import com.ihamen.GPU.MobileGPU;
import com.ihamen.Motherboard.MobileMotherboard;
import com.ihamen.Motherboard.Motherboard;

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
