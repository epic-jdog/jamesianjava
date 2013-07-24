package jamesianjava;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import org.lwjgl.input.Mouse;


public class StartScn extends BasicGameState{
	
	public String mousecoords = "NAOP.";
	public int delaycount1 = 0; 
	public String info = "NAOP.";
	public StartScn(int state){
		
		
	}
	
	
	
	@Override
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{	

	

	
	
	}

	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{
	Sprites sprites = new Sprites();
		
	
	g.setBackground(Colours.backgroundstartscn);
	g.drawImage(sprites.ssbg, 0, 0);	
	g.setColor(new Color(Color.blue));
	g.drawString("DELAYCOUNT IIIS:", 100, 75);
	g.drawString("#Frames Delay:" + delaycount1, 575, 75);
	g.drawString(info, 350, 200);
	g.drawString(mousecoords, 100, 600);
	
	//g.drawRect(75, 75, 500, 20); //x, y, width, height
	
	}

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
		int mousex = Mouse.getX();
		int mousey = Mouse.getY();
		mousecoords = "X: " + mousex + " Y: " + mousey;
		
		delaycount1 += 1;
		
		if(delaycount1 == 120){
			
			info = " ";
			}
		if(delaycount1 == 240){
			
			info = "Press Enter To Continue!";
			delaycount1 = 0;		
		}
		Input input = gc.getInput();
		
		
		if(input.isKeyDown(Input.KEY_ENTER)){
			sbg.enterState(1);
		if(input.isMouseButtonDown(0)){
			sbg.enterState(1);
		
		
		}
		}
		
	}
	
	@Override
	public int getID(){
		return 0;
	}
	
	
	
}
