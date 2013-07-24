package jamesianjava;


import org.newdawn.slick.*;


public class Sprites {
	
    public Image ssbg;
    
    public Image menump;
    
    public Image menusp;
    
    public Image menuopt;
    
    public Image menuexit;

    public Sprites() throws SlickException {
        ssbg = new Image("images/Background.png");
        
        menump = new Image("images/Play MP.png");
        
        menusp = new Image("images/Play.png");
        
        menuopt = new Image("images/Options.png");
        
        menuexit = new Image("images/Exit.png");
    }

}
