package first_game;

import java.util.Random;
import java.util.Scanner;

public class game_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int iteration = 0;
		int nbr_juste = r.nextInt(20);
		int nbr_initiale = 1;		
		while (nbr_juste!=nbr_initiale) {
			System.out.println("Entrer un numero");
			Scanner scan = new Scanner(System.in);
			nbr_initiale =scan.nextInt();
			if(nbr_juste > nbr_initiale) {
				System.out.println("Encore plus!");
			}
			
			else {
				if(nbr_juste<nbr_initiale) {
				System.out.println("Encore moins haha!");
				}
				else {
					System.out.println("Bravo vous avez trouve le nombre : "+ nbr_initiale +" ,apres "+ iteration + " essais.");
				}	
				}
			iteration++;
			}
		}
	}


