
public  class AutoTest implements Comparable<AutoTest>
{

   int rollno;
   String name;
   int age;
   AutoTest(int rollno,String name,int age){
      this.rollno=rollno;
     this.name=name;
      this.age=age;
   }
   @Override
   public int compareTo(AutoTest t) {
      if(age==t.age) {
         return 0;
      }
      else if(age>t.age) {
         return 1;
      }
      else
      {
         return -1;
      }
   }

}
