public class Test {
    private String name;
    Test(){
        // constructor body
        System.out.println("Test class here! Constructor Called");
        name = "Marco";
    }

    public static void main(String[] args) throws Exception {
        Test newTest = new Test();
        System.out.println("the name is" + newTest.name);
    }
}
/**

 */