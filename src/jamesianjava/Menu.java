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
		g.setBackground(Colours.backgroundmenu);
		g.setColor(Colours.backgroundmenu2);
		g.fillRoundRect(100, 100, 350, 500, 10);
		g.setColor(Colours.base2);
		g.fillRect(120, 120, 310, 460);
	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
	
		Input input = gc.getInput();
		
		
		if(input.isKeyDown(Input.KEY_W)){
			jwthingY -= 2;
		}else{
			if(input.isKeyDown(Input.KEY_UP)){
				jwthingY -= 3;
			}
		}
		
		if(input.isKeyDown(Input.KEY_A)){
			jwthingX -= 2;
		}else{
			if(input.isKeyDown(Input.KEY_LEFT)){
				jwthingY -= 3;
			}
		}
		if(input.isKeyDown(Input.KEY_D)){
			jwthingX += 2;
			//System.out.println("Vlee # D");
		
		}else{
			if(input.isKeyDown(Input.KEY_RIGHT)){
				jwthingY -= 3;
			}
		}
		
		if(input.isKeyDown(Input.KEY_S)){
			jwthingY += 2;
			//System.out.println("Vlee # S");
		}else{
			if(input.isKeyDown(Input.KEY_DOWN)){
				jwthingY -= 3;
			}
		}
	
	}
	
	public int getID(){
		return 1;
	}
	
	
	
}
