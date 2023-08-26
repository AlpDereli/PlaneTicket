import java.util.Scanner;
public class TicketMoney {
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        System.out.println("Travelled KM: ");
        float km = take.nextFloat();
        System.out.println("Age: ");
        int age = take.nextInt();
        System.out.println("(1) One Way;;(2) Two Way");
        int selevtion = take.nextInt();
        if (km >= 0 && age >= 0 &&(selevtion == 1 || selevtion == 2))
        {
            float agedis=0;
            float ticketdis = 0;
            float money = km * 0.1f;
            float remember = money;
            if (selevtion == 2)
            {
                money*=2;
                remember*=2;
                ticketdis = remember*0.2f;
            }
            if (age < 12)
            {
                agedis = remember*0.5f;
            } else if (age < 24) {
                agedis = remember*0.1f;
            }
            if (age > 65)
            {
                agedis = remember*0.3f;
            }
            System.out.println("Total: " + (money -agedis -ticketdis));
        }
        else {
            System.out.println("Wrong information");
        }
    }
}
