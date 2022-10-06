import java.util.*;

class ticketClass implements Runnable {
    Random random = new Random();
    static int ticket = 10000;
    static int limit;
    int BTicket; //
    Thread B;

    ticketClass(String name) {
        BTicket = 0;
        B = new Thread(this, name);
        B.start();
    }

    public void run() {

        while (grabTicket() == true) {
            limit = random.nextInt(4) + 1;
            BTicket += limit;
            ticket = ticket - limit;
            System.out.println(B.getName() + "買到" + limit + "張票");
        }
        while (grabTicket() == false && ticket >= 1 && ticket <= 3) {
            limit = random.nextInt(ticket) + 1;
            BTicket += limit;
            ticket = ticket - limit;
            System.out.println(B.getName() + "買到" + limit + "張票");
        }
        System.out.println(B.getName() + "總共買到" + BTicket + "張票");
    }

    private static synchronized boolean grabTicket() {
        if (ticket >= 4) {
            // ticket = ticket - limit;
            return true;
        } else {
            return false;
        }
    }

}

public class hw2_1 {
    public static void main(String[] args) {
        ticketClass mA = new ticketClass("售票機A");
        ticketClass mB = new ticketClass("售票機B");
        ticketClass mC = new ticketClass("售票機C");
        ticketClass mD = new ticketClass("售票機D");
    }

}
