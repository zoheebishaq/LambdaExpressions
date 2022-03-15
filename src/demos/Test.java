package demos;

@FunctionalInterface
interface Cab{
    public void bookCab();
}


// no Use anymore ligne 24 ()->System.out.println("Ola cab is bookes...");
//class Ola implements Cab{
//
//
//    public void bookCab() {
//        System.out.println("Ola cab is bookes...");
//    }
//
//
//    ()->System.out.println("Ola cab is bookes...");
//}

public class Test {
    public static void main(String[] args) {

        Cab cab = ()->System.out.println("Ola cab is bookes...");
        cab.bookCab();

    }
}
