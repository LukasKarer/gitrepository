public class App {
    public static void main(String[] args) throws Exception {
	    System.out.println("Hello, World! BugFix");
        System.out.println("Hello, World!");

	// make sure the code is actually executed properly
     	System.out.println("PID " + ProcessHandle.current().pid() + " says hello.");
        String javaCmd = System.getProperty("java.home") +
                         System.getProperty("file.separator") +
                         "bin" +
                         System.getProperty("file.separator") +
                         "java";
        String cp = System.getProperty("java.class.path");
        try {
	    while (true) {
            	Process p = Runtime.getRuntime().exec(new String[]{javaCmd, "-cp", cp, "App"});
	    }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void thisIsANewMethod() {
        System.out.println("This is a new method");
        System.out.println("Hier wird ein Bug gefixt!");
	    System.out.println("This is a new methodBUGFIX");
     }

    public void thisIsANewMethod2() {
        System.out.println("This is a new method 3");
    }
}
