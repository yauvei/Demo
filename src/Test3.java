/* ������ : AbstractDemo.java */
public class Test3
{
   public static void main(String [] args)
   {
      Test2 s = new Test2("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
      Test1 e = new Test2("John Adams", "Boston, MA", 2, 2400.00);
 
      System.out.println("Call mailCheck using Salary reference --");
      s.mailCheck();
 
      System.out.println("\n Call mailCheck using Employee reference--");
      e.mailCheck();
    }
}