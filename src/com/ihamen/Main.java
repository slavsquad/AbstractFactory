package com.ihamen;

import com.ihamen.CPU.CPU;
import com.ihamen.GPU.GPU;
import com.ihamen.Motherboard.Motherboard;
import com.ihamen.factories.ComponentsFactory;
import com.ihamen.factories.DesktopFactory;

public class Main {

    public static void main(String[] args) {
        ComponentsFactory componentsFactory = new DesktopFactory();
        CPU cpu = componentsFactory.createCPU();
        GPU gpu = componentsFactory.createGPU();
        Motherboard motherboard = componentsFactory.createMotherboard();
        System.out.println(cpu.getInfo());
        System.out.println(gpu.getInfo());
        System.out.println(motherboard.getInfo());

    }
}
