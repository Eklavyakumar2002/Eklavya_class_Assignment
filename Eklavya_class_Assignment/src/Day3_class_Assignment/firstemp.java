package Day3_class_Assignment;

class firstemp{
	private int salary;

	public void setSalary(int s){
		if(s>0){
			salary=s;
		}
		else{
			System.out.println("Invalid");
		}
	}
	public int getSalary(){
		return salary;
	}

	public static void main(String[] args){
		firstemp e=new firstemp();
		e.setSalary(53000);
		System.out.println("Salary:"+e.getSalary());
	}
}
