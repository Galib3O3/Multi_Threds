package ThreDs;

class G extends  Thread{
    public G (String name)
    {
        super(name);
    }

    @Override
    public void run() {
       // System.out.println("He he Boi");
    }
}

public class id_name_string {
    public static void main(String[] args) {
        G g = new G("Galib");
        g.start();
        G gg = new G("ok");
        gg.start();

         System.out.println("My ID is " + g.getId());
         System.out.println("My Name is " + g.getName());

        System.out.println("ok "+gg.getId());
        System.out.println("hehe "+gg.getName());


    }
}
