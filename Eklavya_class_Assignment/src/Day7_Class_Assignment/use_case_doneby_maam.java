package Day7_Class_Assignment;
class FoodDelivery extends Thread
{
	public FoodDelivery(String name)
	{

		setName(name);

	}
	public void run()

	{
		try
		{
			System.out.println(getName() + "started");
			Thread.sleep(2000);
			System.out.println(getName() + "completed");

		}
		catch(InterruptedException e)	{
			System.out.println(getName() + " interrupted");
		}
	}
}

public class use_case_doneby_maam{

public static void main(String[] args) throws InterruptedException {
	FoodDelivery order=new FoodDelivery(" order Processing");
	FoodDelivery kitchen=new FoodDelivery(" order Processing");
	FoodDelivery delivery=new FoodDelivery(" order Processing");
	order.setPriority(Thread.MAX_PRIORITY);
	kitchen.setPriority(Thread.NORM_PRIORITY);
	delivery.setPriority(Thread.MIN_PRIORITY);

	order.start();
	kitchen.start();

	System.out.println("Is order Alive? " +order.isAlive());

	order.join();
	kitchen.join();

	delivery.start();
	delivery.join();
	System.out.println("All tasks completed.");

	}
}
