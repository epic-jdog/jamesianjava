package jamesianjava;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Game extends StateBasedGame{

	public static final String gamename = "Jamesian Java!?";	
	public static final int startscn = 0;
	public static final int menu = 1;
	public static final int play = 2;
	
	
	public Game(String gamename){
		
		super(gamename);
		
		this.addState(new Menu(menu));
		this.addState(new Play(play));
		this.addState(new StartScn(startscn));		
	}
	
	public void initStatesList(GameContainer gc) throws SlickException{
		this.getState(startscn).init(gc, this);
		this.getState(menu).init(gc, this);
		this.getState(play).init(gc, this);
		this.enterState(startscn);
		
	}

	
	public static void main(String[] args) {

		AppGameContainer appgc;
		try{
		
			appgc = new AppGameContainer(new Game(gamename));
			appgc.setDisplayMode(1000, 750, false);
			appgc.setTargetFrameRate(120);
			appgc.start();
			
		
		}catch(SlickException e){
			e.printStackTrace();
		}
		
		
		
	}



}
