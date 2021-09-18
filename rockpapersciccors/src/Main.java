import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First player: ");
        String str1 = scanner.nextLine();
        System.out.print("Second player: ");
        String str2 = scanner.nextLine();

        String winnerName = nameOfTheWinner(str1,str2);
        System.out.println(winnerName);

    }

    public static String  nameOfTheWinner(String str1,String str2){
        //write in lowercase
        String user1 = str1.toLowerCase();
        String user2 = str2.toLowerCase();

        if(user1.equals("paper")&&user2.equals("rock")||user1.equals("rock")&&user2.equals("sciccors")||user1.equals("sciccors")&&user2.equals("paper"))
            return "1st win";

        if(user2.equals("paper")&&user1.equals("rock")||user2.equals("rock")&&user1.equals("sciccors")|| user2.equals("sciccors")&&user1.equals("paper"))
            return "2nd win";

        if (user1.equals(user2))
            return "Draw";

        return "";
    }
}
