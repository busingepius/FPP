/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 23/01/2024
 * Time : 15:57
 * Project Name : assignment5.problem5
 */
package assignment5.problem5;

import java.util.Objects;

public class Computer {
    private String manufacturer;
    private String processor;

    private int ramSize;

    private double processorSpeed;

    public Computer(String manufacturer, String processor, int ramSize, double processorSpeed) {
        this.manufacturer = manufacturer;
        this.processor = processor;
        this.ramSize = ramSize;
        this.processorSpeed = processorSpeed;
    }

    public int getRamSize() {
        return ramSize;
    }

    public double getProcessorSpeed() {
        return processorSpeed;
    }

    public double computerPower() {
        return ramSize * processorSpeed;
    }

    @Override
    public String toString() {
        return "Computer{manufacturer: " + manufacturer + ", processor: " + processor + ", ramSize: " + ramSize + ", processorSpeed: " + processorSpeed + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Computer computer = (Computer) obj;
        return ramSize == computer.ramSize && processorSpeed == computer.processorSpeed && Objects.equals(manufacturer, computer.manufacturer) && Objects.equals(processor, computer.processor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processor, processorSpeed, ramSize, manufacturer);
    }

}
