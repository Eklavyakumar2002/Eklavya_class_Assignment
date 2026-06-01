//2.E-Commerce Application How can Java File Handling be used to save product orders, invoices, and customer shipping details?
package Day10_class_assignment;

import java.io.*;

class Ecommerce{
    int orderId;
    int quantity;
    String productName;
    double price;

    Ecommerce(int orderId, String productName, int quantity, double price) {
        this.orderId=orderId;
        this.productName=productName;
        this.quantity=quantity;
        this.price=price;
    }

    void saveOrder(){
    	
    	try(PrintWriter printWriter = new PrintWriter(new FileWriter("orders.txt", true))) {
            printWriter.println("OrderId:"+orderId);
            printWriter.println("ProductName:"+productName);
            printWriter.println("Quantity:"+quantity);
            printWriter.println("Price:"+price);
            printWriter.println("TotalAmount:"+(quantity*price));
            printWriter.println("----------------");

            System.out.println("OrderSavedSuccessfully");
        }

        catch(IOException exception){

            System.out.println(exception);
        }
    }

    void readOrder(){

        try(BufferedReader bufferedReader=
                    new BufferedReader(
                            new FileReader("orders.txt"))){

            String line;

            while((line=bufferedReader.readLine())!=null){

                System.out.println(line);
            }
        }

        catch(IOException exception){

            System.out.println(exception);
        }
    }
}

public class ecommerce_application{
    public static void main(String[] args){
    	Ecommerce ecommerce=new Ecommerce(101,"Laptop",2,45000);
        ecommerce.saveOrder();
        System.out.println("\nReadingDataFromFile\n");
        ecommerce.readOrder();
    }
}