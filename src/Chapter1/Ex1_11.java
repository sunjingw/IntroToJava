package Chapter1;

public class Ex1_11 {
    public static void main(String[] args) {

        //Population Projection
        System.out.println("Population is 312,032,485");
        System.out.println("Year 1 = " + ((((86400.0/7) - (86400.0/13) + (86400.0/45)) * 365) + 312032485));
        System.out.println("Year 2 = " + ((((86400.0/7) - (86400.0/13) + (86400.0/45)) * 365) + 314812583));
        System.out.println("Year 3 = " + ((((86400.0/7) - (86400.0/13) + (86400.0/45)) * 365) + 317592679));
        System.out.println("Year 4 = " + ((((86400.0/7) - (86400.0/13) + (86400.0/45)) * 365) + 320372776));
        System.out.println("Year 5 = " + ((((86400.0/7) - (86400.0/13) + (86400.0/45)) * 365) + 323152873));
    }
}
