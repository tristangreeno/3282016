/**
 * Main is the main application
 * Main() is the main method
 * This is used to describe/detail the program and purpose
 *
 */

public class Main {

    public static void main(String[] args) {
        /*int[] scores = new int[4];
        for(int i = 0; i < 4a; ++i)
            {
                scores[i] = i*i;
            }
        System.out.println(scores[2]);*/

        //JavaDoc String for all packages


        /* System.out.println("The user name is " + userName + ".");
        System.out.println("The length is " + userName.length() + "."); */

        //System.out.println(Math.getExponent(2342.2));

        /*int lives;
        int health;*/

        /* String name = "catAchieve";
        achMet = true; */

        /* Object[] x = new Object[4];
        x[0] = "catChieve";
        x[1] = true;
         */

       /* Achievement a = new Achievement();
        Achievement b = new Achievement();
        Achievement c = new Achievement();
        Achievement d = new Achievement();
        Achievement e = new Achievement();


            a.name = "Player 1";
            a.achMet = false;

            b.name = "Player 2";
            b.achMet = true;

            c.name = "Player 3";
            c.achMet = false;

            d.name = "Player 4";
            d.achMet = true;

            a.name = "Player 5";
            a.achMet = false;


        Achievement[] achievements = new Achievement[5];

        achievements[0] = a;
        achievements[1] = b;
        achievements[2] = c;
        achievements[3] = d;
        achievements[4] = e;

        for (int i = 0; i < 4; ++i) {
            if (achievements[i].achMet) {
                System.out.println("You just received a trophy for " + achievements[i].name + "!");
            } else {
                System.out.println("Sorry, " + a.name[i] + ".");
            }

        }*/

        Team team = new Team();
        for(int i = 0; i < 3; ++i) {
            team.teamName[i] = "namey";
            team.mascot[i] = "mascoty";
        }

        for(int i = 0; i < 3; ++i){
        System.out.println("my team: " + team.teamName[i] +
        ", and " + team.coaches[i] + " coach is " + team.coachName[i] +". The mascot is " +
        team.mascot[i]);
        }
    }
}

/*class Achievement {
    String name;
    boolean achMet;
    final int CATMIN = 5;
}*/

/*class Person {
    String name;
    int age;
    boolean isChild;
}*/

class Team {
    String[] teamName = new String[3];
    final String[] coaches = {"head","assistant","pitching"};
    final String[] coachName = {"Joe","Susan","Perry"};

    String[] mascot = new String[3];
    final int teamNumber = 13;

}
