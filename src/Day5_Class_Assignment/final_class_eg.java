package Day5_Class_Assignment;

final class SecurityModule {

    public void encryptData() {
        System.out.println("Encrypting data using secure algorithm...");
    }
}

// This will give ERROR
//class AdvancedSecurity extends SecurityModule {
//    public void extraFeature() {
//        System.out.println("Extra security feature");
//    }
//}


public class final_class_eg{
    public static void main(String[] args) {

        SecurityModule obj = new SecurityModule();
        obj.encryptData();
    }
}