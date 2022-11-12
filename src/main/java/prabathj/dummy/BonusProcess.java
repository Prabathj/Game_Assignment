package main.java.prabathj.dummy;

import java.util.List;
import java.util.Random;

public class BonusProcess {

	private static final Random random = new Random();
	
	public static void processBonus(Player player, List<Player> playerList) {
		
		int bonusType=random.nextInt(3)+1;
		
		
		switch(bonusType) {
		
			case 1:
				int location=player.getLocation();
				player.setLocation(location+2);
				
				break;
		
			case 2:
				
				playerList.forEach((p) ->{ 
					
					if(p!=null) {
					
						int newl=p.getLocation()-2;
						if(newl<0)
							newl=0;
						
						p.setLocation(newl);
						
					}
				}  );
				
				player.setLocation(player.getLocation()+2);
				
				break;
				
			case 3:
				player.setSaveFromnextTrap(true);
				
				break;
				
			default:
				
				System.err.println("Error Bonus Type");
				break;
				
		}
		
		
		player.setsFieldActivated(false);
		
		
		
		
	}
	
	
	
	
}
