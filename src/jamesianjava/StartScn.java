package jamesianjava;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;



public class StartScn extends BasicGameState{

	
	public StartScn(int state){
		
		
	}
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{	
	}

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{
	
		
	Image ssbg = new Image("images/background.png");
	g.drawImage(ssbg, 0, 0);	
	//g.drawString("Ready For some JAMESIAN JAVA!??!?!??!?vlee.", 100, 75);
	//g.drawRect(75, 75, 500, 20); //x, y, width, height
	
	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
	}
	
	public int getID(){
		return 0;
	}
	
	
	
}
