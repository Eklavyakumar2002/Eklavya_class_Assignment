package Day10_class_assignment;

import java.io.*;
import java.util.Scanner;

class FoodDelivery {
	int orderId;
	String foodName;
	int quantity;
	double price;

	FoodDelivery(int orderId, String foodName, int quantity, double price) {
		this.orderId = orderId;
		this.foodName = foodName;
		this.quantity = quantity;
		this.price = price;
	}

	void showMenu() {
		System.out.println("1.pizza-200");
		System.out.println("2.papdi chat-80");
		System.out.println("3.Pasta-50");
		System.out.println("_____________");
	}
	void saveOrder() {
		try (PrintWriter printWriter = new PrintWriter(new FileWriter("orders.txt", true))) {
			printWriter.println("OrderId:" + orderId);
			printWriter.println("FoodName:" + foodName);
			printWriter.println("Quantity:" + quantity);
			printWriter.println("Price:" + price);
			printWriter.println("TotalAmount:" + (quantity * price));
			printWriter.println("----------------");

			System.out.println("OrderSavedSuccessfully");
			System.out.println("_____________");
		}

		catch (IOException exception) {
			System.out.println(exception);
		}
	}
	void deliveryLog() {
		try (PrintWriter printWriter = new PrintWriter(new FileWriter("delivery.txt", true))) {
			printWriter.println("OrderId:" + orderId);
			printWriter.println("FoodDelivered:" + foodName);
			printWriter.println("DeliveryStatus:Delivered");
			printWriter.println("----------------");

			System.out.println("DeliveryLogSaved");
			System.out.println("_____________");
		}

		catch (IOException exception) {

			System.out.println(exception);
		}
	}
	void readOrders() {
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader("orders.txt"))) {
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
		}
		catch (IOException exception) {

			System.out.println(exception);
		}
	}
}

public class food_deliverySystem{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FoodDelivery foodDelivery = new FoodDelivery(101, "Pizza", 2, 200);
		int choice = 0;
		while (choice != 5) {
			System.out.println("1.ShowMenu");
			System.out.println("2.SaveOrder");
			System.out.println("3.SaveDeliveryLog");
			System.out.println("4.ReadOrders");
			System.out.println("5.Exit");
			System.out.print("EnterChoice:");
			choice = scanner.nextInt();

			switch (choice) {

			case 1:
				foodDelivery.showMenu();
				break;
			case 2:
				foodDelivery.saveOrder();
				break;
			case 3:
				foodDelivery.deliveryLog();
				break;
			case 4:
				foodDelivery.readOrders();
				break;
			case 5:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid Choice");
			}
		}

		scanner.close();
	}
}