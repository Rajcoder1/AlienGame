import processing.core.PApplet;

public class Game extends PApplet {
    public int camX=0;
    public int camY=0;
    public boolean shoot=false;
    public float angle = 0;

    public void settings() {
        size(800, 800);   // set the window size

    }

    public void setup() {
        // TODO: initialize game variables
        Alien bob = new Alien();
    }

    /***
     * Draws each frame to the screen.  Runs automatically in a loop at frameRate frames a second.
     * tick each object (have it update itself), and draw each object
     */
    public void draw() {
        background(0);    // paint screen white
        fill(255);




        fill(0,255,0);




        player.drawPlayer(this);
        bullet.drawBullet(this);
        Alien.drawAliens(this,camX,camY);
        if(shoot){
            bullet bullet1 = new bullet(this);
            shoot=false;
        }



         // draw circle at mouse loc

    }
    public void keyPressed(){

        if (key == 'w'){

            camY+=10;
        }else if(key == 's'){
            camY-=10;



        }else if(key=='a'){
            camX+=10;
            angle-=PI/100;

        }else if(key=='d'){
            camX-=10;

        }

        if(key=='e'){
            shoot=true;
        }

    }

    public static void main(String[] args) {
        PApplet.main("Game");
    }
}
