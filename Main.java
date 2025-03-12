//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class mmsysytem{
    String name;
    int age;
    boolean status;
    int duration;
    float fee;
    public mmsysytem(String name, int age, boolean status, int duration, float fee) {
        this.name = name;           // Initializing name
        this.age = age;             // Initializing age
        this.status = status;       // Initializing status
        this.duration = duration;   // Initializing duration
        this.fee = fee;

    }
    public float calculate_fee(){
        return fee*duration;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Status: " + (status ? "Active" : "Inactive"));
        System.out.println("Duration: " + duration);
        System.out.println("Fee : " + this.calculate_fee());
    }
}
public class Main {
    public static void main(String[] args) {
        mmsysytem m1 = new mmsysytem("john snow",20,true,12,5000);
        m1.displayInfo();


    }
}