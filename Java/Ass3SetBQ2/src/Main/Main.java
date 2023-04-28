package Main;
import java.io.*;
class Game implements Serializable {

String game_name;
  int no_of_players;

  public Game(String name, int players) {
    this.game_name = name;
    this.no_of_players = players;
  }

  public String toString() {
   return "Game: " + game_name + ", Players: " + no_of_players;
  }
}

public class Main {

	public static void main(String[] args) {
		Game g[] = new Game[5];
		try {

		    g[0] = new Game("Football",22);
		    g[1] = new Game("Basketball",9);
		    g[2] = new Game("Cricket",11);
		    g[3] = new Game("Hockey",7);
		    g[4] = new Game("Baseball",8);

		   FileOutputStream fout = new FileOutputStream("game.ser");
           ObjectOutputStream out = new ObjectOutputStream(fout);

		   out.writeObject(g[0]);
		   out.writeObject(g[1]);
		   out.writeObject(g[2]);
		   out.writeObject(g[3]);
		   out.writeObject(g[4]);
		   out.flush();
		   out.close();
		   System.out.println("Serialization successful!");
		   }  
		   catch (Exception e){
		   System.out.println(e);
		   }
		try {
			Game G[] = new Game[5];

			   FileInputStream fin = new FileInputStream("game.ser");
			   ObjectInputStream in = new ObjectInputStream(fin);

			   G[0]= (Game)in.readObject();
			   G[1]= (Game)in.readObject();
			   G[2]= (Game)in.readObject();
			   G[3]= (Game)in.readObject();
			   G[4]= (Game)in.readObject();			 
			   in.close();
			   System.out.println(G[0]);
			   System.out.println(G[1]);
			   System.out.println(G[2]);
			   System.out.println(G[3]);
			   System.out.println(G[4]);
			   }			     
			   catch (Exception e){

			   System.out.println(e);
			   }

			}

		}