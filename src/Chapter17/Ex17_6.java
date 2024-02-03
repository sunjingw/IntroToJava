package Chapter17;

import java.io.*;
import java.util.*;

public class Ex17_6 {
    public static void main(String[] args) throws FileNotFoundException {

        Loan l1 = new Loan();
        Loan l2 = new Loan();
        Loan l3 = new Loan();
        Loan l4 = new Loan();
        Loan l5 = new Loan();

        l1.setLoanAmount(500);
        l2.setLoanAmount(200);
        l3.setLoanAmount(100);
        l4.setLoanAmount(1);
        l5.setLoanAmount(23);

        File file = new File("./src/Ex17_6.dat");

        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(file))) {

            output.writeObject(l1);
            output.writeObject(l2);
            output.writeObject(l3);
            output.writeObject(l4);
            output.writeObject(l5);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
