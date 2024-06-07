

abstract class Dog {
    public void bark () {
        System.out.println("bark!");
    }
}

class Pitbull extends Dog {

}









public class Main {
    public static void main(String[] args) {

    // this wont wok   Dog d = new Dog() ;
   //                   d.bark();

   Pitbull p = new Pitbull();
   p.bark();
    
        
    }

}
