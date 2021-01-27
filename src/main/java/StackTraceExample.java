public class StackTraceExample {
    public static void main(String[] args) {
        StackTraceExample stackTraceExample = new StackTraceExample();
//        stackTraceExample.method1();
        int numOfSeconds = 0;
        try {

            stackTraceExample.getNumberOfSeconds(-4);
        }catch (IllegalArgumentException e){
            numOfSeconds = stackTraceExample.getNumberOfSeconds(-4 * -1);
        }
        System.out.println(numOfSeconds);
    }

    public void method1(){
        method2();
    }

    public void method2(){
        method3();
    }

    public void method3(){
        throw new RuntimeException("Runtime Exceptions!");
    }

    public int getNumberOfSeconds(int hour){
        if (hour<0){
            throw new IllegalArgumentException("Hour must be >= 0: " + hour);
        }
        return hour * 60 * 60;
    }
}
