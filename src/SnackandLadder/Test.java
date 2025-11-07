package SnackandLadder;



import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Player p1 = new Player("Dhoni", false);
        Player p2 = new Player("Raina", false);
        Player p3 = new Player("Jaddu", false);
        Player p4 = new Player("Subhan", false);
        Player p5 = new Player("Guna2", false);
        ArrayList<Player> ar = new ArrayList<Player>();
        ar.add(p1);
        ar.add(p2);
        ar.add(p3);
        ar.add(p4);
        ar.add(p5);
        SnakeAndLadderformulti.play(ar);
	}

}