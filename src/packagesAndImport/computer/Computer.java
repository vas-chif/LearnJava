package src.packagesAndImport.computer;

import src.packagesAndImport.computer.components.HardDrive;
import src.packagesAndImport.computer.components.Motherboard;
import src.packagesAndImport.computer.components.Processor;
import src.packagesAndImport.computer.peripherals.Keyboard;
import src.packagesAndImport.computer.peripherals.Monitor;
import src.packagesAndImport.computer.peripherals.Mouse;

import java.security.Key;
import java.util.Scanner;

/*1.
Create a new Java project.
        a.Deselect the box to create the main method. You will write the main method yourself in the next exercise.
2. Create a new Java package, like edu.tekwill.lesson.computer . //ok
3. Create a new Java class ﬁle in that package, called Computer . //ok
4. Create another package, called edu.tekwill.lesson.computer.components . //ok
5. Create the following three classes inside it: Processor , Motherboard , HardDrive . //ok
6. Add three ﬁelds, of type Processor , Motherboard and HardDrive , to the class Computer . Use the
import statement to make them available inside the Computer class.
7.Create another package, called edu.tekwill.lesson.computer.peripherals . //ok
8. Create the following three classes inside it: Monitor, Mouse, Keyboard . //ok
9. Add three ﬁelds, of type Monitor, Mouse and Keyboard , to the class Computer . Use the import
statement with a wildcard to import the whole package.
 */
public class Computer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Processor processor = new Processor();
        System.out.println("Please enter model Processor: ");
        processor.modelProcessor = sc.next();
        System.out.println("Please enter power Processor: ");
        processor.powerProcessor = sc.nextDouble();

        HardDrive hardDrive = new HardDrive();
        System.out.println("Please enter model HardDrive: ");
        hardDrive.modelHD = sc.next();
        System.out.println("Please enter capacity of HardDrive: ");
        hardDrive.capacity = sc.nextDouble();

        Motherboard motherboard = new Motherboard();
        System.out.println("Please enter model Motherboard: ");
        motherboard.modelMB = sc.next();
        System.out.println("Please enter power of Motherboard: ");
        motherboard.powerMB = sc.nextDouble();

        Keyboard keyboard = new Keyboard();
        System.out.println("Please enter model Keyboard: ");
        keyboard.modelKeyboard = sc.next();
        System.out.println("Please enter style Keyboard: ");
        keyboard.styleKeyboard = sc.next();

        Monitor monitor = new Monitor();
        System.out.println("Please enter model Monitor: ");
        monitor.modelMonitor = sc.next();
        System.out.println("Please enter dimension Monitor: ");
        monitor.dimensionMonitor = sc.nextDouble();

        Mouse mouse = new Mouse();
        System.out.println("Please enter model Mouse: ");
        mouse.modelMouse = sc.next();
        System.out.println("Please type Connection Mouse: ");
        mouse.typeConnectionMouse = sc.next();

        processor.stateProcessor();
        hardDrive.statesHardDrive();
        motherboard.stateMotherboard();
        keyboard.statesKeyBoard();
        monitor.propertiesMonitor();
        mouse.propertiesMouse();
    }

}
