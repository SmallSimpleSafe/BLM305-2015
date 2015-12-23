import java.util.*; //for e-f
class Counter implements Runnable {
    static long t0; //d
    static Counter one; static Counter[] Y; 
    String name; int cnt; Thread thd; 
    public Counter(String s, int n) { //a1
        name = s; cnt = n;
        thd = new Thread(this);
    }
    public void run() {
        while (cnt > 0) try {
            cnt--; Thread.sleep(500); //wait for 0.5 sec
        } catch(InterruptedException e) { }
        report(); 
    }
    public void start() { thd.start(); }
    public void stop() { cnt = 0; } //a2
    public void report() {
        long t1 = System.currentTimeMillis(); //d
        System.out.printf("%s %s %n", t1-t0, one.thd.getState());
    }
    public static void main(String[] args) throws InterruptedException { //a3
        one = new Counter("bir", 4); one.start();
        t0 = System.currentTimeMillis(); //d
        Thread.sleep(1000);
        Counter two = new Counter("iki", 6); two.start(); 
        one.report();
        List<Counter> L = new ArrayList<>();  //e 
        for (int i=0; i<1000; i++) { L.add(one); L.add(two); }
        Y = new Counter[L.size()]; L.toArray(Y); //e
        Set<Counter> S = new HashSet<>(L);   //f
        // L.size() == 2000 >= S.size()  //g
        System.out.printf(" List:%s Set:%s %n", L.size(),S.size());
    }
}
/*
a) Fill in the blanks indicated by “...” within the code above
b) Draw a simplified object diagram for  one and Y
c) Draw a time-line showing when each thread begins and ends
d) Predict the output (exactly 3 lines) and the total runtime of this program
e) Show how to make array Y from List<Counter> L with 2000 elements
f) Show how to make a Set S from the List L
g) What can you say about the size of the array and the size of the set?
*/
