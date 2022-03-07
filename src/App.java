import java.util.Scanner;

public class App {
    /**
     * Integer Returntype method
     * @param x
     * @param y
     * @return
     */
    public int addNumbers(int x, int y){
        return x + y;
    }
    /**
     * Void method
     * Create a void method that displays a message
     * @param args
     * @throws Exception
     */
    public static void displayMessage(String name){
        System.out.println("Hello " + name);
    } 
    /**
     * Create a void method that displays the square of a number(integer)
     * @param args
     * @throws Exception
     */
    /*
    public static void square(int a, int b){
        int s = a * b;
        System.out.println("the square is: " + s);
    }
    */
    public static void square(int a){
        int s = a * a;
        System.out.println("the square is: " + s);
    }
    /**
     * Outline
     * Java methods
     * Method declaration
     * Calling methods
     * Method Return Types
     * Method Parameters
     * Java Constructors
     * @param args
     * @throws Exception
     */
    /**
     * Java Methods -> block of code/code segment meant to perform a specific task
     * e.g. draw a circle, levelUp()-> increase level
     * Two Types
     * User-Defined,Standard Library Methods
     * 
     * 
     * @param args
     * @throws Exception
     */
    /**
     * Java Constructors - method that is called/invoked when the Class/Object is created
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        App newApp = new App();
        int x = 100;
        int y = 200;
        // System.out.println(newApp.addNumbers(x, y));
        // displayMessage("Allen");
        // square(x);
        /**
         * Syntax for method
         * returnType methodName(){
         *  method body
         * }
         * Example
         * int addNumbers(){
         * return int
         * }
         * Complete Syntax
         * modifier static returnType nameOfMethod(param1,param2..){
         * // method body
         * }
         * static-> method can be accessed without creating objects
         */
        // System.out.println("The square root of 9 : "+Math.sqrt(9));
        /**
         * Call addNumber method
         */
        
        // System.out.println(addNumbers(2,3));
        // int a = addNumbers(3, 5);
        // System.out.println("Sum :" + a);
        Test newTest = new Test();
        // System.out.println("the name is " + newTest.name);
     
        
    }
}
/**
 * int a = addNumbers(3,5);
    println("sum:" + a);
 */

/* public static void displayMessage(){

    System.out.println("Hello");

} 
/**
public static void square(int a, int b){
    int s= a * b;
System.out.println("the square is: " + s);

}

 */
/**
 * displaySquareRoot(9);

Public static void displaySquareRoot(int a){
        System.out.println(Math.sqrt(a));
}
 */

/*java scary */