interface ABC
{
     void show();
}
public class interfaceWithAnonymous
{
  public static void main(String[] args) 
  {
      ABC obj = new ABC() 
      {
          public void show()
          {
              System.out.println("In the mess");
          }
          
      };
      obj.show();
  }  
}
