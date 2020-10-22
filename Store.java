import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.ArrayList;

public class Store {
    public static void main(String args[]) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        File cputext = new File("cpu.txt");
        Scanner readCPU = new Scanner(cputext);
        File cpuctext = new File("cpucooling.txt");
        Scanner readCPUCooler = new Scanner(cpuctext);
        File ramtext = new File("ram.txt");
        Scanner readRAM = new Scanner(ramtext);
        File gputext = new File("gpu.txt");
        Scanner readGPU = new Scanner(gputext);
        File mobotext = new File("motherboard.txt");
        Scanner readMobo = new Scanner(mobotext);
        File psuread = new File("powersupply.txt");
        Scanner readPSU = new Scanner(psuread);
        File caseread = new File("case.txt");
        Scanner readCase = new Scanner(caseread);

        File output = new File("builds.txt");
        PrintWriter out = new PrintWriter(output);

        ArrayList<Computer> computers = new ArrayList<Computer>();

        CPU cpu = new CPU();
        cpu.readCPUTest(readCPU);

        CPUCooling cpuc = new CPUCooling();
        cpuc.readCPUCooling(readCPUCooler);

        GPU gpu = new GPU();
        gpu.readGPU(readGPU);

        RAM ram = new RAM();
        ram.readRAM(readRAM);

        Motherboard mobo = new Motherboard();
        mobo.readMobo(readMobo);

        PowerSupply psu = new PowerSupply();
        psu.readPSU(readPSU);

        Case cases = new Case();
        cases.readCase(readCase);

        printGreeting();

        

        System.out.print("To begin, please enter yes. Otherwise, to exit enter no: ");
        String command = input.next();
        while (!(command.equals("no"))) {
            CPU tempCPU = cpu.getCPU();
            System.out.println(tempCPU);

            System.out.println("\n\nThen, select your cooler. The cooler keeps your CPU cool, ensuring it doesn't overheat.\n\n");
            cpuc.printCPUCooling();
            System.out.print("\n\nEnter the number of the part you would like to choose: ");
            int coolerChoice = input.nextInt();
            cpuc.printSingle(coolerChoice);
            CPUCooling tempCPUC = cpuc.getCPUC(coolerChoice);

            System.out.println("\n\nThen, select your motherboard. The motherboard holds all your components together, but has a negligible effect on performance.\n\n");
            if (tempCPU.getSocketType().equals("AM4")) {
                mobo.printMoboAMD();
            } else {
                mobo.printMoboIntel();
            }

            System.out.print("\n\nEnter the number of the part you would like to choose: ");
            int mobochoice = input.nextInt();
            try {
                mobo.getMobo(mobochoice);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("You entered an invalid number, please try again.");
                System.out.print("Enter the number of the part you would like to choose: ");
                mobochoice = input.nextInt();
            }
            Motherboard tempMobo = mobo.getMobo(mobochoice);


            System.out.println("\n\nThen, select your choice of RAM. The speed of the RAM has a small effect on Intel CPUs, and a larger effect on AMD CPUs.\n\n");
            ram.printRAM();
            System.out.print("\n\nEnter the number of the part you would like to choose: ");
            int ramchoice = input.nextInt();
            try {
                ram.getRAM(ramchoice);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("You entered an invalid number, please try again.");
                System.out.print("Enter the number of the part you would like to choose: ");
                ramchoice = input.nextInt();
            }
            RAM tempRAM = ram.getRAM(ramchoice);

            System.out.println("\n\nNext, pick what GPU you want.\nThe GPU handles graphically intensive workloads, such as gaming or rendering.\n\n");
            gpu.printGPU();
            System.out.print("\n\nEnter the number of the part you would like to choose: ");
            int gpuchoice = input.nextInt();
            try {
                gpu.getGPU(gpuchoice);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("You entered an invalid number, please try again.");
                System.out.print("Enter the number of the part you would like to choose: ");
                gpuchoice = input.nextInt();
            }
            GPU tempGPU = gpu.getGPU(gpuchoice);

            System.out.println("\n\nThen, pick which power supply you want. The power supply provides your system with power. More expensive power supplies are more efficient, but our selection will power any build you create.\n\n");
            psu.printPSU();
            System.out.print("\n\nEnter the number of the part you would like to choose: ");
            int psuchoice = input.nextInt();
            try {
                psu.getPSU(psuchoice);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("You entered an invalid number, please try again.");
                System.out.print("Enter the number of the part you would like to choose: ");
                psuchoice = input.nextInt();
            }
            PowerSupply tempPSU = psu.getPSU(psuchoice);

            System.out.println("\n\nFinally, pick which case you want. Our selection of cases all feature excellent airflow and all have a glass panel, allowing you a clear view of all your components.\n\n");
            cases.printCase();
            System.out.print("\n\nEnter the number of the part you would like to choose: ");
            int casechoice = input.nextInt();
            try {
                cases.getCase(casechoice);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("You entered an invalid number, please try again.");
                System.out.print("Enter the number of the part you would like to choose: ");
                casechoice = input.nextInt();
            }
            Case tempCase = cases.getCase(casechoice);

            Computer finalComputer = new Computer(tempCPU, tempCPUC, tempGPU, tempMobo, tempPSU, tempRAM, tempCase);


            System.out.println("\n\nThis is your final build: \n" + finalComputer.toString());

            System.out.print("\n\nWould you like to benchmark this system to see how it performs? (yes/no): ");
            if (input.next().equals("yes")) {
                System.out.println("\nThis computer scored " + finalComputer.calculatePerformance() + " on our synthetic benchmark.");
            }       

            System.out.print("\nWould you like to start over? (yes/no): ");
            if (input.next().equals("no")) {
                System.out.print("\nWe've printed your configuration to a text file so you can reference it in the future. Would you like to sort the builds by price? (yes/no): ");
                if (input.next().equalsIgnoreCase("yes")) {
                    computers = sortArray(computers);
                    for (int i = 0; i < computers.size(); i++) {
                        out.println("Build " + i + ": \n" + computers.get(i).toString() + "\n\n");
                    }

                    out.close();
                    System.out.println("Your build have been sorted by price.");
                    break;
                } else {
                    for (int i = 0; i < computers.size(); i++) {
                        out.println("Build " + (i + 1) + ": \n" + computers.get(i).toString() + "\n\n");
                    }

                    out.close();
                    break;
                }
            }
        }
    }

    /**
     * Prints out the greeting
     */
    public static void printGreeting() {
        StringBuffer greeting = new StringBuffer("Thanks for using PC Part Picker to build your dream system! (Please don't sue me PCPartPicker.com)");
        System.out.println(greeting);
    }

    /**
     *
     * @param computers The array to be sorted
     * @return The sorted array
     */
    public static ArrayList<Computer> sortArray(ArrayList<Computer> computers) {
        for (int i = 0; i < computers.size() - 1; i++) {
            if (computers.get(i + 1).calculateCost() > computers.get(i).calculateCost()) {
                Computer temp = computers.get(i);
                computers.set(i, computers.get(i + 1));
                computers.set(i + 1, temp);
            }
        }
        return computers;
    }

    /**
     *
     * @param computers The array to be sorted
     * @param search The CPU to be searched for
     * @return The location of the CPU
     */
    public static int search(ArrayList<Computer> computers, CPU search){
        for (int i = 0; i < computers.size(); i++){
            if(computers.get(i).cpu.equals(search)){
                return i;
            }
        }
        return -1;
    }
}
