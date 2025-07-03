package mobile;

import com.sun.tools.javac.Main;

public class Electronics {
    public String name;
    public String type;
    public double price;

    // fills the initial information
    // runs automatically when yiu create an object using new
    // no return type
    // Constructor name --> same as the class name

    public Electronics(String electronicsName, String type, double price){
        this.name = electronicsName;
        this.type = type;
        this.price = price;
    }

    public static String getID(){

        return "29i2kd0wi04204240";
    }

}
