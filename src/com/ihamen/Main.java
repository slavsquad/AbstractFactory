package com.ihamen;

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
