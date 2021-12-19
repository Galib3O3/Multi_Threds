package ThreDs;

                                          //get_name, set_name, isALive, isDaemon, yeild, sleep//
//main thread name change
//public class change_name_get_set extends Thread{
//
//    public static void main(String[] args) {
//        System.out.println("Hi");
//        System.out.println(Thread.currentThread().getName());
//
//        Thread.currentThread().setName("JAVA main Thread");
//
//        System.out.println(Thread.currentThread().getName());
//    }
//}
 //ovverrride
//public class change_name_get_set extends Thread{
//    @Override
//    public void run() {
//        System.out.println("Thread task:"+currentThread().getName());
//    }
//
//    public static void main(String[] args) {
//        System.out.println("Hello "+Thread.currentThread().getName());
//        change_name_get_set t1 = new change_name_get_set();
//        t1.setName("Thread name change");
//        t1.start();
//    }
//}

//Runable
// class t implements Runnable {
//    public void run(){
//        System.out.println( Thread.currentThread().getName());
//        System.out.println("Runnable Thread");
//
//    }
//
//    public static void main(String[] args) throws InterruptedException {
//        t t1 = new t();
//        Thread test = new Thread(t1,"helo");
//        test.start();
//    }
//
//}

//isAlive
//public class change_name_get_set extends Thread{
//    @Override
//    public void run() {
//        System.out.println("Thread task "+Thread.currentThread().getName());
//    }
//
//    public static void main(String[] args) {
//        change_name_get_set t1 = new change_name_get_set();
//
//        System.out.println("Main thread Task "+Thread.currentThread().getName());
//        System.out.println("main thread alive "+Thread.currentThread().isAlive());
//        //System.out.println("t1 alive "+t1.isAlive()); //false
//        t1.start();
//        //System.out.println("t1 alive "+t1.isAlive()); //true
//    }
//}

//isDaemon,
//public class change_name_get_set extends  Thread {
//    @Override
//    public void run() {
//        if (Thread.currentThread().isDaemon())
//        {
//            System.out.println("Daemon thread");
//        }
//        else{
//            System.out.println("Child Thread");
//        }
//    }
//
//    public static void main(String[] args) {
//        System.out.println("main Thread");
//        change_name_get_set t1 = new change_name_get_set();
//        t1.setDaemon(true);
//
//        t1.start();
//        //t1.setDaemon(true);
//
//    }
//}

//public class change_name_get_set extends  Thread {                 //its throw exception
//    @Override
//    public void run() {
//        if (Thread.currentThread().isDaemon())
//        {
//            System.out.println("Daemon thread");
//        }
//        else{
//            System.out.println("Child Thread");
//        }
//    }
//
//    public static void main(String[] args) {
//        System.out.println("main Thread");
//        change_name_get_set t1 = new change_name_get_set();
//        t1.start();
//        t1.setDaemon(true);
//
//    }
//}

//public class change_name_get_set extends  Thread {                 // //its throw exception
//    @Override
//    public void run() {
//
//            System.out.println("Daemon thread");
//
//            System.out.println("Child Thread");
//        }
//
//
//    public static void main(String[] args) {
//        Thread.currentThread().setDaemon(true);
//        System.out.println("main Thread");
//        change_name_get_set t1 = new change_name_get_set();
//        t1.start();
//        t1.setDaemon(true);
//
//    }
//}

//public class change_name_get_set extends  Thread {                  // if main method not working rest of the task also not runnig
//    @Override
//    public void run() {
//        if (Thread.currentThread().isDaemon())
//        {
//            System.out.println("Daemon thread");
//        }
//        else{
//            System.out.println("Child Thread");
//        }
//    }
//
//    public static void main(String[] args) {
//        //System.out.println("main Thread");
//        change_name_get_set t1 = new change_name_get_set();
//        t1.setDaemon(true);
//        t1.start();
//
//
//    }
//}



/////////////////////////priority\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
//show priority
//public  class change_name_get_set extends Thread{
//    public static void main(String[] args) {
//        System.out.println("The Priority is: "+Thread.currentThread().getPriority());
//    }
//}


// child thread inherit priority
//public class change_name_get_set extends Thread{
//    public void run()
//    {
//        System.out.println("child Thred");
//        System.out.println("child thread priority: "+Thread.currentThread().getPriority());
//    }
//
//    public static void main(String[] args) {
//        System.out.println("Main Thread old Priority: "+Thread.currentThread().getPriority());
//        Thread.currentThread().setPriority(10);
//        System.out.println("Main Thread new Priority: "+Thread.currentThread().getPriority());
//        change_name_get_set t1 = new change_name_get_set();
//        t1.start();
//    }
//}

/////////////////////////sleep\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
//class sleep extends Thread{
//    @Override
//    public void run() {
//        try{
//            for(int i =0; i<5; i++)
//            {
//                System.out.println("Hello "+Thread.currentThread().getName());
//                Thread.sleep(1000);
//            }
//        }
//        catch (InterruptedException e)
//        {
//            e.printStackTrace();
//        }
//
//    }
//
//}
//
//public class change_name_get_set extends Thread{
//
//    public static void main(String[] args) {
//        sleep s1= new sleep();
//        s1.start();
//
//        sleep s2 = new sleep ();
//        s2.start();
//    }
//}

//////////////////Yeild()\\\\\\\\\\\\\\\\\\\\\\\\\\\
//class yeild extends Thread{
//    public void run() {
//        for (int i = 1; i <= 5; i++) {
//            System.out.println(Thread.currentThread().getName() + "-" + i);
//        }
//    }
//}
//
//public class change_name_get_set extends Thread{
//    public static void main(String[] args) {
//        yeild f = new yeild();
//        f.start();
//        Thread.yield();
//
//        for (int i = 1; i <= 5; i++) {
//            System.out.println(Thread.currentThread().getName() + "-" + i);
//        }
//    }
//}

//class Bike{                                // practice perpose
//    void run(){
//        System.out.println("running");
//    }
//}
//public class change_name_get_set extends Bike{
//    void run(){
//        System.out.println("running safely with 100kmph");
//    }
//    public static void main(String[] args) {
//        Bike bike= new change_name_get_set();
//        bike.run();
//    }
//}

//public class A {
//    final int x = 40;
//
//    void run() {
//        x = x + 400;                          // x = final so , we cant set x value
//        System.out.println("");
//    }
//
//    public static void main(String[] args) {
//        A ref = new A();
//        ref.run();
//    }
//}

//class staticD{
//    static int a = 10;
//
//    static void display()
//    {
//        System.out.println("h");
//    }
//    static {
//        System.out.println("hi");
//    }
//}
//public class change_name_get_set {
//    public static void main(String[] args) {
//        staticD s =new staticD();
//    }
//}


//public class change_name_get_set {
//    public static void main(String[] args) {
//        int n = 5;
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.println(i + "");
//            }
//            System.out.println();
//        }
//    }
//}





