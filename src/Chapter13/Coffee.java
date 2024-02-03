package Chapter13;

import Chapter13.Machine;

import java.util.*;

public class Coffee {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            Machine m = new Machine();

            while (true) {
                System.out.println("Write action (buy, fill, take, remaining, exit): ");
                String s = input.next();

            if (s.equalsIgnoreCase("buy")) {
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                String buy = input.next();
                if (buy.equalsIgnoreCase("back"))
                    continue;
                else
                    buy(Integer.parseInt(buy), m);

            } else if (s.equalsIgnoreCase("fill")) {
                fill(m);
            } else if (s.equalsIgnoreCase("take")) {
                take(m);
            } else if (s.equalsIgnoreCase("remaining")) {
                remaining(m);
            } else if (s.equalsIgnoreCase("exit"))
                System.exit(1);

            }
        }

        public static String input(String str) {

            return "";
        }

        public static void take(Machine m) {
            System.out.println("I gave you $" + m.getMoney());
            m.setMoney(0);
        }
        public static void fill(Machine m) {
            Scanner input = new Scanner(System.in);
            System.out.println("Write how many ml of water you want to add: ");
            m.setWater(m.getWater() + input.nextInt());
            System.out.println("Write how many ml of milk you want to add: ");
            m.setMilk(m.getMilk() + input.nextInt());
            System.out.println("Write how many grams of coffee beans you want to add: ");
            m.setCoffee(m.getCoffee() + input.nextInt());
            System.out.println("Write how many disposable cups you want to add: ");
            m.setCups(m.getCups() + input.nextInt());
        }

        public static void remaining(Machine m) {

            System.out.println(m.getWater() + " ml of water");
            System.out.println(m.getMilk() + " ml of milk");
            System.out.println(m.getCoffee() + " g of coffee beans");
            System.out.println(m.getCups() + " disposable cups");
            System.out.println("$" + m.getMoney() + " of money");

        }

        public static boolean water(int n, Machine m) {
            if (n == 1) {
                if (m.getWater() >= 250)
                    return true;
            } else if (n == 2) {
                if (m.getWater() >= 350)
                    return true;
            } else if (n == 3) {
                if (m.getWater() >= 200)
                    return true;
            }
            return false;
        }
        public static boolean milk(int n, Machine m) {
            if (n == 1)
                return true;
            else if (n == 2) {
                if (m.getMilk() >= 75)
                    return true;
            } else if (n == 3) {
                if (m.getMilk() >= 100)
                    return true;
            }
            return false;
        }
        public static boolean coffee(int n, Machine m) {
            if (n == 1) {
                if (m.getCoffee() >= 16)
                    return true;
            } else if (n == 2) {
                if (m.getCoffee() >= 20)
                    return true;
            } else if (n == 3) {
                if (m.getCoffee() >= 12)
                    return true;
            }
            return false;
        }
        public static boolean money(int n, Machine m) {
            if (n == 1) {
                if (m.getMoney() >= 4)
                    return true;
            } else if (n == 2) {
                if (m.getMoney() >= 7)
                    return true;
            } else if (n == 3) {
                if (m.getMoney() >= 6)
                    return true;
            }
            return false;
        }

        public static void buy(int n, Machine m) {

            boolean enoughWater = water(n, m);
            boolean enoughCoffee = coffee(n, m);
            boolean enoughMilk = milk(n, m);
            boolean enoughMoney = money(n, m);

            if (enoughCoffee && enoughMilk && enoughWater && enoughMoney) {
                System.out.println("I have enough resources, making you a coffee!");
                if (n == 1) {
                    m.setWater(m.getWater() - 250);
                    m.setCoffee(m.getCoffee() - 16);
                    m.setMoney(m.getMoney() + 4);

                } else if (n == 2) {
                    m.setWater(m.getWater() - 350);
                    m.setMilk(m.getMilk() - 75);
                    m.setCoffee(m.getCoffee() - 20);
                    m.setMoney(m.getMoney() + 7);

                } else {
                    m.setWater(m.getWater() - 200);
                    m.setMilk(m.getMilk() - 100);
                    m.setCoffee(m.getCoffee() - 12);
                    m.setMoney(m.getMoney() + 6);
                }
                m.setCups(m.getCups() - 1);

            } else if (!enoughCoffee) {
                System.out.println("Sorry not enough coffee beans!");
            } else if (!enoughMilk) {
                System.out.println("Sorry not enough milk!");
            } else if (!enoughWater) {
                System.out.println("Sorry not enough water!");
            } else if (!enoughMoney) {
                System.out.println("Sorry not enough money!");
            }


        }
    }
