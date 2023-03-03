package inheritance;

interface OldInterface {
    public void existingMethod();

    default public void DefaultMethod() {
        System.out.println("New default method" + " is added in interface");
    }
}
//following class compiles successfully in JDK 8
public class oldinheritance implements OldInterface {
	
    public void existingMethod() {
        System.out.println("normal method");

    }
    public static void main(String[] args) {
        oldinheritance obj = new oldinheritance ();
        // print “New default method add in interface”
        obj.DefaultMethod(); 
        obj.existingMethod();
    }
}

