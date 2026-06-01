package Day3_class_Assignment;

public class voting4 {

	
		// TODO Auto-generated method stub
		private boolean voted=false;
		public void vote() {
			if(voted==false) {
				System.out.println("allow to vote");
				voted=true;
			}
			else {
				System.out.println("Already done");
			}
		}
		public static void main(String[] args) {
			voting4 v1= new voting4();
			v1.vote();
			//v1.vote();
			
	}

}
