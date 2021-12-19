package ThreDs;
class O extends  Thread{
    public O (String name)
    {
        super(name);
    }

    @Override
    public void run() {
        for(int i = 0 ; i<=20;i++) {
            System.out.println("He he Boi " + this.getName());
        }
    }
}

public class Priority {
    public static void main(String[] args) {
        O g = new O("GALIB");
        O g1 = new O("SHANTO");
        O g2 = new O("REZA");
        O g3 = new O("Sumon");
        O g4 = new O("MAHI");
        g.start();
        g1.start();
        g2.start();
        g3.start();
        g4.start();

        g.setPriority(Thread.MAX_PRIORITY);
        g1.setPriority(Thread.NORM_PRIORITY);
        g2.setPriority(Thread.MIN_PRIORITY);
    }
}
