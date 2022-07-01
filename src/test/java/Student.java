
public class Student {

   int a=100;

   boolean b() {
      a=200;
      return true;
   }
	public static void main(String[] args)
   {
      Student s=new Student();
      System.out.println(s.a);
      System.out.println(s.b());
      System.out.println(s.a);
      System.out.println(s instanceof Student);
   }
}
