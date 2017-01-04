

public class NativeApp {
   static {
      System.loadLibrary("NativeApp");
   }
   // Native method that receives a Java String and return a Java String
   private native String sayHello(String msg);
 
   public static void main(String args[]) {
      String result = new NativeApp().sayHello("Hello from Java");
      System.out.println("In Java, the returned string is: " + result);
   }
}