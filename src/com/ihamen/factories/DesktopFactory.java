package com.ihamen.factories;

import com.ihamen.CPU.CPU;
import com.ihamen.CPU.DesktopCPU;
import com.ihamen.GPU.DesktopGPU;
import com.ihamen.GPU.GPU;
import com.ihamen.Motherboard.DesktopMotherboard;
import com.ihamen.Motherboard.Motherboard;

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
