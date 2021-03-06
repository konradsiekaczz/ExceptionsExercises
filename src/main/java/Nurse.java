import java.io.IOException;

public class Nurse {
    private String name;
    private int age;

    public Nurse(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void doSomething() throws MyException {
        System.out.println("Exception notification!");
        throw new MyException();
    }
    public void testThrowingExceptions(){
        IOException e = new IOException("Throwing IOException!");
        try {
            throw e;
        }catch (IOException e1){
            e1.printStackTrace();
        }
    }

    public void testTwoThrowingExceptions() throws IOException{
        IOException e = new IOException("Throwing second IOException!");
            throw e;
    }
}
