package Arrays;

import java.util.Scanner;

public class Tic_Tac_Toe {
	
	static char[][] box= {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
	static char player='X';
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			display();
			System.out.println("for player : "+player);
			System.out.println("enter row num : ");
			int r=sc.nextInt();
			System.out.println("enter col num : ");
			int c=sc.nextInt();
			if((r<0 || r>2)||(c<0 || c>2)|| box[r][c]!=' ') {
				System.out.println("invalid selection!!");
				continue;
			}
			
			if(!(isempty())) {
				System.out.println("Game over box is full!!");
				break;
				
			}
			box[r][c]=player;
			if(iswin()) {
				System.out.println("Game Over, player "+player+ "win's");
				break;
			}
			player=player=='X'?'O':'X';
			
			
			
			
		}

		
		
		
	}


	private static boolean isempty() {
		for(char[] row:box) {
			for(char c:row) {
				if(c==' ')
					return true;
			}
		}
		
		return false;
	}


	private static boolean iswin() {
		//for rows
		for(int i=0;i<box.length;i++) {
			if(box[i][0]==player && box[i][1]==player && box[i][2]==player)
				return true;
		}
		//for cols
		for(int i=0;i<box.length;i++) {
			if(box[0][i]==player && box [1][i]==player && box[2][i]==player)
				return true;
		}
		//for right angle diag
		if(box[0][0]==player && box [1][1]==player && box[2][2]==player)
			return true;
		//for left angle diag
		if(box[0][2]==player && box [1][1]==player && box[2][0]==player)
			return true;

		return false;
	}


	private static void display() {
		System.out.println("-------------");
		for(char[] row:box) {
			System.out.print("| ");
			for(char c:row) {
				System.out.print(c+" | ");
				
			}
			
			System.out.println();
			System.out.println("-------------");
		}
		
	}

}
