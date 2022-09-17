package ru.mirea.lab2.Ex4;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop implements methodsPC {
    public static List<PC> arrayPCs = new ArrayList<>();

    @Override
    public boolean deletePC(PC pc) {
        PC computer = searchPC(pc);
        if (computer != null) {
            System.out.println("Компьютер успешно удален!");
            return arrayPCs.remove(computer);
        } else {
            System.out.println("Компьютер не может быть удален!");
            return false;

        }

    }

    @Override
    public boolean addPC(PC pc) {
        System.out.println("Компьютер успешно добавлен!");
        return arrayPCs.add(pc);
    }

    @Override
    public PC searchPC(PC pc) {
        PC computer = null;

        for (PC comp : arrayPCs) {
            if (comp.getModel().equals(pc.getModel()) && comp.getColor().equals(pc.getColor()) && comp.getCpu().equals(pc.getCpu()) && comp.getRam().equals(pc.getRam())) {
                System.out.println("Компьютер найден!");
                computer = comp;
            }
        }
        System.out.println("Компьютер не найден!");
        return computer;
    }

    public PC input() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter model: ");
        String model = scanner.nextLine();
        System.out.println("Enter color: ");
        String color = scanner.nextLine();
        System.out.println("Enter cpu: ");
        String cpu = scanner.nextLine();
        System.out.println("Enter ram: ");
        String ram = scanner.nextLine();

        PC pc = new PC(model, color, cpu, ram);
        return pc;
    }
}