package ThreDs;
//
//
////Scanner
////import java.util.Scanner;
//////public class scanner {
//////    public static void main(String[] args) {
//////        String name;
//////        int a;
//////        float b;
//////
//////        Scanner sc = new Scanner(System.in);
//////        name = sc.next();
//////        a=sc.nextInt();
//////        b=sc.nextFloat();
//////
//////        System.out.println(name);
//////        System.out.println(a);
//////        System.out.println(b);
//////
//////
//////    }
//////
//////}
//
//
//
////Buffered Reader
//import java.io.*;
//public class scanner {
//    public static void main(String[] args) throws IOException {
//        //InputStreamReader ir = new InputStreamReader(System.in);
//          FileReader fr = new FileReader("C:\\Users\\Unique-pc\\Pictures\\Slide Shows\\file.txt");
//        BufferedReader br = new BufferedReader(fr);
//       // int a =Integer.parseInt(br.readLine());
//        while(br.readLine()!=null)
//        {
//        String s = br.readLine();
//
//        System.out.println(s);
//      //  System.out.println(a);
//    }
//}
//}


//class A{
//    String obj_name;
//
//    public A (String obj_name)
//    {
//        this.obj_name = obj_name;
//    }
//    static A show()
//    {
//        A obj3 = new A("poli");
//        A obj2 =display();
//        return  obj2;
//    }
//    static A display()
//    {
//
//        return  new A("Food");
//    }
//
//    public static void main(String[] args) {
//        A obj2 = new  A("dust");
//        new A("junk");
//        A obj1 =show();
//        obj2 = obj1;
//        System.gc();
//    }
//
//    @Override
//    protected void finalize() throws Throwable {
//        System.out.println(this.obj_name+ " is a garbage");
//    }
//}