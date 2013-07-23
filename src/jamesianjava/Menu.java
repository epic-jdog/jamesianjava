package jamesianjava;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import org.lwjgl.input.Mouse;



public class Menu extends BasicGameState{

	Image jwthing;
	int jwthingX = 300;
	int jwthingY = 300;
	
	
	
	
	public Menu(int state){
		
		
	}
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{	
	
		jwthing = new Image("images/JM2011.png");
	
	}

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{
		g.drawImage(jwthing, jwthingX, jwthingY);
	
	
	
	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
	
		Input input = gc.getInput();
		
		
		if(input.isKeyDown(Input.KEY_W)){
			jwthingY -= 2;
		}
		
		if(input.isKeyDown(Input.KEY_A)){
			jwthingX -= 2;
		}
		if(input.isKeyDown(Input.KEY_D)){
			jwthingX += 2;
			System.out.println("Vlee # D");
		
		}
		
		if(input.isKeyDown(Input.KEY_S)){
			jwthingY += 2;
			System.out.println("Vlee # S");
		}
	
	}
	
	public int getID(){
		return 1;
	}
	
	
	
}
