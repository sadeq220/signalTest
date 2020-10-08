import sun.misc.Signal;

public class Test {
    public static void main(String... args){
        Signal.handle(new Signal("TERM"),signal ->{throw new RuntimeException("this SIG raise exception");});
        System.out.println(ProcessHandle.current().pid());
        Runtime.getRuntime().addShutdownHook(new ShutdownHook());
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    }
