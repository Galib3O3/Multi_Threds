package ThreDs;

//public class Garbage_c
//{
//    public static void main(String[] args) {
//        Garbage_c g1 = new Garbage_c();
//        Garbage_c g2 = new Garbage_c();
//       g1=g2;
//        //g1= null;
//        System.gc();
//
//       // g2=null;
//
//        Runtime.getRuntime().gc();
//
//
//    }
//
//    @Override
//    protected void finalize() throws Throwable {
//        System.out.println("GC called");
//        System.out.println("gc calllled"+this);
//    }
//}


//public class Garbage_c {
//    String name;
//    public Garbage_c(String obj_name)
//    {
//        this.name =obj_name;
//    }
//    static Garbage_c show()
//    {
//        String obj2 =("P");
//        String obj0 =("K");
//        return obj2;
//    }
//
//    public static void main(String[] args) {
//        new Garbage_c("J");
//        Garbage_c obj1 =show();
//        System.gc();
//    }
//
//    @Override
//    protected void finalize() throws Throwable {
//        System.out.println(this.name);
//    }
//}
