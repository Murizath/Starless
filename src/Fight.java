import org.newdawn.slick.*;
import org.newdawn.slick.state.*;



public class Fight extends BasicGameState {
	Animation gunshot, standattack1, knifetoss, playerattackSpecial;
	Animation idle, enemyattack1, enemyattack2, enemyattackSpecial;
	Image fightbattle, enemy, fight;
	float enemyPositionX = 0;
	float enemyPositionY = 0;
	
	public Fight(int state) {
		
	}
	
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		fightbattle = new Image("res/fightbattle.png");
		enemy = new Image("res/test.png");
		fight = new Image("res/fighticon.png");
		
	}

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		g.drawRect(52, 452, 698, 98);
		g.drawRect(52, 52, 698, 348);
		fightbattle.draw(enemyPositionX,enemyPositionY);
		enemy.draw(enemyPositionX + 300,enemyPositionY + 150);
		fight.draw(enemyPositionX + 70, enemyPositionY + 470);
		
	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
		
		
	}

	public int getID() {
		// TODO Auto-generated method stub
		return 2;
	}

}