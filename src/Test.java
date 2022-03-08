import java.util.Scanner;

public class Test {
    /**
     * No arg Constructor
     * Parameterized Constructor
     * Default Constructor -> No arg Constructor
     */
    private String name;
    private int num1;
    private String PL;
    /**
     * No arg Constructor
     */
    // Test(){
    //     // constructor body
    //     System.out.println("Test class here! Constructor Called");
    //     name = "Marco";
    // }
    /**
     * parameterized Constructor
     * @param args
     * @throws Exception
     */
    Test(String ProgrammingLanguage){
        PL = ProgrammingLanguage;
        System.out.println("Programming Language Set is " + PL);
    }

    public static void main(String[] args) throws Exception {
        // parameterized constructor invoke
        Test newTest = new Test("Scratch");
        Test newTest2 = new Test("Perl");
        Test newTest3 = new Test("Java");
        // System.out.println("the name is" + newTest.name);
        Scanner sc = new Scanner(System.in);
    }
}
/**

 */