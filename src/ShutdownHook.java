import sun.misc.SignalHandler;

public class ShutdownHook extends Thread {
    @Override
    public void run() {
throw new RuntimeException("this SIG raise Exception");
    }
}
