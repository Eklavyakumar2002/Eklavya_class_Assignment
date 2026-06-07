package Day3_class_Assignment;

class Car{
    private int speed;
    private int fuel;
    public void setSpeed(int s){
        if(s >= 0){
            speed = s;
            System.out.println("Speed set");
        }
        else{
            System.out.println("Invalid speed");
        }
    }
    public void setFuel(int f){
        if(f >= 0){
            fuel = f;
            System.out.println("Fuel set");
        }else{
            System.out.println("Invalid fuel");
        }
    }
    public void show(){
        System.out.println("Speed" + speed);
        System.out.println("Fuel" + fuel);
    }
    public static void main(String[] args){
        Car c = new Car();
        c.setSpeed(140);
        c.setFuel(30);
        c.show();
    }
}