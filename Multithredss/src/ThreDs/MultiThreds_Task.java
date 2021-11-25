package ThreDs;

class th1 extends  Thread{

    public void run()
    {

        System.out.println("Child thred");


    }
}



class th2 extends  Thread{

    public void run()
    {

        System.out.println("not me");


    }
}

public class MultiThreds_Task {
    public static void main(String[] args) {

        th1 t = new th1();
        t.start();
        th2 tt = new th2();
        tt.start();


    }
}
