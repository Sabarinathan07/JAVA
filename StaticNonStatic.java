public class StaticNonStatic {
    public static void main(String args[]) {
       Tiger.roar();
       Tiger tiger = new Tiger();
       tiger.eat();
       tiger.roar();
    }
 }
 class Tiger {
    public void eat(){
       System.out.println("Tiger eats");
    }
    public static void roar(){
       System.out.println("Tiger roars");
    }
 }
 