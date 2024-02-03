package Chapter17;

import java.io.*;
import java.util.*;

public class Ex17_7 {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("./src/Ex17_7.dat");

        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(file))) {

            Loan loan;

            while ((loan = (Loan)input.readObject()) != null) {

                System.out.println(loan.getLoanAmount() + " ");

            }

        } catch (EOFException e) {
            System.out.println(e);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
