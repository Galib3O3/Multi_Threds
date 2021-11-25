package ThreDs;
class ExtedsThred extends  Thread{
    public void run()
    {
        for(int i=0; i<10; i++)
        {
            System.out.println("Hello");
            try
            {
                Thread.sleep(1);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }


      //  System.out.println("Hi");
    }
}

public class M_Threds_loops {
    public static void main(String[] args) {
        ExtedsThred et = new ExtedsThred();
        et.start();

        for(int i=0; i<10; i++)
        {
            System.out.println("Brother");
            try
            {
                Thread.sleep(1);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }


        ExtedsThred th = new ExtedsThred();

        th.start();
        ExtedsThred th2 = new ExtedsThred();
        th2.start();


    }

}
