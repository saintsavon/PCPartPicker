
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CPU extends Product implements ProductPrint {
	private double baseClock;

	public String getCoresThreads() {
		return coresThreads;
	}

	public boolean isOverclock() {
		return overclock;
	}

	public String getSocketType() {
		return socketType;
	}

	public double getBaseClock() {
		return baseClock;
	}

	public double getBoostClock() {
		return boostClock;
	}

	private double boostClock;
	private String coresThreads;
	private boolean overclock;
	private String socketType;
	ArrayList<CPU> CPU = new ArrayList<CPU>();

	public CPU(double baseClock, double boostClock, String coresThreads, boolean overclock, String socketType,
			String productName, double productPrice, String productBrand) {
		this.baseClock = baseClock;
		this.boostClock = boostClock;
		this.coresThreads = coresThreads;
		this.overclock = overclock;
		this.socketType = socketType;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productBrand = productBrand;
	}

	public CPU() {
		this.baseClock = 0.0;
		this.boostClock = 0.0;
		this.coresThreads = null;
		this.overclock = false;
		this.socketType = null;
		this.productName = null;
		this.productPrice = 0.0;
		this.productBrand = null;
	}

	/**
	 * Reads the CPU text file into the ArrayList
	 * 
	 * @param readCPU Scanner
	 */
	public void readCPUTest(Scanner readCPU) {
		double baseClock, boostClock, productPrice;
		Boolean overclock;
		String socketType, coresThreads, productName, productBrand;
		for (int i = 0; i < 5; i++) {
			productName = readCPU.nextLine();
			productPrice = readCPU.nextDouble();
			readCPU.nextLine();
			productBrand = readCPU.nextLine();
			baseClock = readCPU.nextDouble();
			readCPU.nextLine();
			boostClock = readCPU.nextDouble();
			readCPU.nextLine();
			coresThreads = readCPU.nextLine();
			overclock = readCPU.nextBoolean();
			readCPU.nextLine();
			socketType = readCPU.nextLine();
			readCPU.nextLine();
			CPU object = new CPU(baseClock, boostClock, coresThreads, overclock, socketType, productName, productPrice,
					productBrand);
			CPU.add(object);
		}
		productName = readCPU.nextLine();
		productPrice = readCPU.nextDouble();
		readCPU.nextLine();
		productBrand = readCPU.nextLine();
		baseClock = readCPU.nextDouble();
		readCPU.nextLine();
		boostClock = readCPU.nextDouble();
		readCPU.nextLine();
		coresThreads = readCPU.nextLine();
		overclock = readCPU.nextBoolean();
		readCPU.nextLine();
		socketType = readCPU.nextLine();
		CPU object = new CPU(baseClock, boostClock, coresThreads, overclock, socketType, productName, productPrice,
				productBrand);
		CPU.add(object);
		readCPU.close();
	}

	/**
	 * Prints the CPU ArrayList
	 */
	public void printCPU() {
		for (int i = 0; i < CPU.size(); i++) {
			System.out.println(i + ". " + CPU.get(i).toString() + "\n");
		}
	}

	public CPU getCPU() throws IndexOutOfBoundsException, FileNotFoundException {
		CPU cpu = new CPU();
		Scanner input = new Scanner(System.in);
		File cputext = new File("cpu.txt");
		Scanner readCPU = new Scanner(cputext);
		System.out.println(
				"\n\nFirst, select a CPU. The CPU is the brain of the computer, which does all the calculations to make it run.\n\n");
		printCPU();
		System.out.print("\n\nEnter the number of the part you would like to choose: ");
		int cpuChoice = input.nextInt();
		try {
			cpu = CPU.get(cpuChoice);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("You entered an invalid number, please try again.");
			cpuChoice = input.nextInt();
		}
		System.out.println(cpu.toString());
		return cpu;
	}

	public void printSingle(int i) throws IndexOutOfBoundsException {
		System.out.println(CPU.get(i).toString());
	}

	@Override
	public String toString() {
		return ("Name: " + productName + "\nBrand: " + productBrand + "\nPrice: $" + productPrice + "0\nBase Clock: "
				+ baseClock + "GHz\nBoost Clock: " + boostClock + "GHz\nCores/Threads: " + coresThreads
				+ "\nCan overclock? " + overclock + "\nSocket Type: " + socketType);
	}

}
