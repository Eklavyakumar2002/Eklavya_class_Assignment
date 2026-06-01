package Day8_class_Assignment;

import java.util.*;

class HospitalQueueLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> queue = new LinkedList<>();

        while(true) {
            System.out.println("\n1.Add Patient");
            System.out.println("2.Add Emergency Patient");
            System.out.println("3.Treat Patient");
            System.out.println("4.View Queue");
            System.out.println("5.Check First & Last");
            System.out.println("6.Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {

                case 1:
                    System.out.print("Enter patient name: ");
                    String name = sc.nextLine();
                    queue.addLast(name); 
                    System.out.println("Patient added");
                    break;

                case 2:
                    System.out.print("Enter emergency patient name: ");
                    String emergency = sc.nextLine();
                    queue.addFirst(emergency);
                    System.out.println("Emergency patient added");
                    break;

                case 3:
                    if(queue.isEmpty()) {
                        System.out.println("No patients");
                    } else {
                        System.out.println("Treated: " + queue.removeFirst());
                    }
                    break;

                case 4:
                    System.out.println("Queue: " + queue);
                    break;

                case 5:
                    if(queue.isEmpty()) {
                        System.out.println("Queue is empty");
                    } else {
                        System.out.println("First: " + queue.getFirst());
                        System.out.println("Last: " + queue.getLast());
                    }
                    break;
                case 6:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}