import mobile.Electronics;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Electronics mobile = new Electronics("Redmi5","mobile", 34000 );
        System.out.println(mobile.name);
        System.out.println(mobile.type);
        System.out.println(mobile.price);

        Electronics laptop = new Electronics("mac m1","laptop",92000);
        System.out.println(laptop.name);
        System.out.println(laptop.type);
        System.out.println(laptop.price);

        Electronics washingMachine = new Electronics("washingMachine1", "washingMachine", 21000);
        System.out.println(washingMachine.name);
        System.out.println(washingMachine.type);
        System.out.println(washingMachine.price);

        Electronics camera  = new Electronics("sony DSLR", "camera", 87000);
        System.out.println(washingMachine.name);
        System.out.println(washingMachine.type);
        System.out.println(washingMachine.price);



    }
}