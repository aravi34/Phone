package org.phone;

public class InternalStorage {
	private void processorName() {
System.out.println("Processor Name: Snapdragon");
	}
	private void ramSize() {
System.out.println("Ram Size: 8GB Memory Ram");
	}
public static void main(String[] args) {
	InternalStorage I = new InternalStorage();
    I.processorName();
    I.ramSize();
    ExternalStorage ES1 = new ExternalStorage();
    ES1.size();
}
}
