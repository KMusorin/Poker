package ru.mirea.lab4.Ex4;

public class Computer {
    private Manufacturer model;
    private Memory memory;
    private Monitor monitor;
    private Processor processor;

    public static void main(String[] args) {
        Memory memory = new Memory("DDR4", "128 GB");
        Monitor monitor = new Monitor(Manufacturer.LENOVO, "3440 × 1440");
        Processor processor = new Processor("Intel core i7", "3000 MHz");
        Computer computer = new Computer(Manufacturer.LENOVO, memory, monitor,processor);
        System.out.println(computer);
    }

    public Computer(Manufacturer model, Memory memory, Monitor monitor, Processor processor) {
        this.model = model;
        this.memory = memory;
        this.monitor = monitor;
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "Computer:" + "\n"+
                "model = '" + model + '\'' + "\n" +
                "memory = " + memory + "\n" +
                "monitor = " + monitor + "\n" +
                "processor = " + processor;
    }
}