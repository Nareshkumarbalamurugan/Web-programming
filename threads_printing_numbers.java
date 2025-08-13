class NumberPrinter extends Thread {
    private int start, end;
    
    public NumberPrinter(int start, int end) {
        this.start = start;
        this.end = end;
    }
    
    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(getName() + " -> " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        NumberPrinter t1 = new NumberPrinter(1, 5);
        NumberPrinter t2 = new NumberPrinter(6, 10);
        
        t1.start();
        t2.start();
    }
}
