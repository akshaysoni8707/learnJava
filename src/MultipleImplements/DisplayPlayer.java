package MultipleImplements;

import java.util.Scanner;

public class DisplayPlayer {
    public static void main(String[] args) {
        AllRounder ar = new AllRounder();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        ar.setName(sc.next());
        System.out.println("Enter team name");
        ar.setTeamName(sc.next());
        System.out.println("Enter runs");
        ar.setRuns(sc.nextInt());
        System.out.println("Enter wickets");
        ar.setWickets(sc.nextInt());

        System.out.println("-------------------------");

        System.out.println("Name " + ar.getName());
        System.out.println("Team Name " + ar.getTeamName());
        System.out.println("Runs " + ar.getRuns());
        System.out.println("Wickets " + ar.getWickets());
    }
}
