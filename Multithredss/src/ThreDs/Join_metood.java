package ThreDs;
class t1 extends  Thread{

    public void run()
    {
         int i =0;
         while (i<5)
        {

            System.out.println("Child thred");
            i++;
        }


    }
}
class t2 extends  Thread{

    public void run()
    {
        int i=0;
        while(i<4) {
            System.out.println("Hi");
            i++;
        }
    }
}
public class Join_metood {
    public static void main(String[] args) {
        t1 t = new t1();
        t.start();
        try{
              t.join();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        t2 tt = new t2();
        tt.start();
    }
}
