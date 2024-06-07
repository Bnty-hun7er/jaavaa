

class bird {
    public  void sing () {
        System.out.println("peek peek peek");
    }
}

class cock extends bird {
    public void sing () {
        System.out.println("cok cok coooo");
    }
}


class pigon extends bird {
    public void sing (String sound) {
        System.out.println(sound + sound + sound );
    }

}


public class polymo {

    public  static void main(String[] args) {

        bird b = new bird() ;
        cock c =new cock();
        pigon p = new pigon();

        b.sing() ;
        c.sing();
        p.sing("brr");



        
    }

}
