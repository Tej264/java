public class StaticDemo {
   private static int count=0;
   // int c=0;
   protected static int getcount()
   {
     return count;
     }
     public static void addCount()
     {
        count++;
     }
     public StaticDemo()
     {
       StaticDemo.addCount();
     }
     /* public void count()
     {
     c++;
     System.out.println(c);
     }*/
     public static void main(String args[])
     {
      System.out.println("Starting with"+ StaticDemo.getcount()+"counts");
      for(int i=0;i<10;i++)
      {
      StaticDemo obj= new StaticDemo();
      //obj.count();
      }
      System.out.println(StaticDemo.getcount());
        //for(int i=0;i<10;i++)
     }
  }
