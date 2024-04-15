package Topics;

public class Counter {
    // static variables
    public static int COUNT = 0;

    Counter() {
        COUNT++;
    }



    // non-static variable
    public int PUB_COUNT = 1;
    //non-static instance Counter
    public void PubCounter() {
        this.PUB_COUNT++;
    }
}
