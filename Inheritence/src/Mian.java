public class Mian {

    public static void main(String[] args) {
        
        mouse1 ms1 = new mouse1() ;
        mouse2 ms2 = new mouse2() ;



        System.out.println("mouse 1 featrures");
        System.out.println("-----------------");

        System.out.println(ms1.color);
        System.out.println(ms1.connectivity);
        ms1.rightClick();
        ms1.leftClick();
        ms1.rollup();
        ms1.rolldown();
System.out.println();
System.out.println();


        System.out.println("mouse 2 featrures");
        System.out.println("-----------------");

        System.out.println(ms2.color);
        System.out.println(ms2.connectivity);
        ms2.rightClick();
        ms2.leftClick();
        ms2.rollup();
        ms2.rolldown();


    }


}
