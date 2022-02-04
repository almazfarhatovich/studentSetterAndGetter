package peaksoft.company;

public class Laptop {

    private String laptopName;
    private int memory;
    private String color;
    private String CPU;


    public void turnOn(){
        System.out.println(getLaptopName()+" жанды");

    }

    public void shutDown(){
        System.out.println(getLaptopName()+" өчтү");
    }

    public void showInfo() {
        System.out.println("+----------------------------------------------------+");
        System.out.println("info about laptop");
        System.out.println("laptopName = " + laptopName);
        System.out.println("memory = " + memory);
        System.out.println("color = " + color);
        System.out.println("CPU = " + CPU);
        System.out.println("+----------------------------------------------------+");
    }
    public String getLaptopName() {
        return laptopName;
    }

    public void setLaptopName(String laptopName) {
        this.laptopName = laptopName;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }
}