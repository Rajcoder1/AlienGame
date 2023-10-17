import java.util.ArrayList;

public class Alien {
    public static ArrayList<Alien> Aliens = new ArrayList<>();
    private int x,y;
    public Alien(){
        this.x=800;
        this.y=800;
        Aliens.add(this);
    }
    public static void drawAliens(Game g, int camX,int camY){
        for (int i = 0; i < Aliens.size(); i++) {

            g.fill(0,255,0);
            if (Aliens.get(i).x+camX>400 ){
                Aliens.get(i).x-=1;
            }else if(Aliens.get(i).x+camX<400){
                Aliens.get(i).x+=1;
            }
            if (Aliens.get(i).y+camY>400){
                Aliens.get(i).y-=1;
            }else if(Aliens.get(i).y+camY<400){
                Aliens.get(i).y+=1;
            }


            System.out.println((Aliens.get(i).x+camX));
            System.out.println(Aliens.get(i).y+camY);

            g.ellipse(Aliens.get(i).x+(camX),Aliens.get(i).y+(camY),20,20);

        }
    }
    public void isHit(Alien a){
        for (int i = 0; i < bullet.bullets.size(); i++) {
            if(bullet.bullets.get(i).x<a.x+20 && bullet.bullets.get(i).x>a.x-20){
                if(bullet.bullets.get(i).y<a.y+20 && bullet.bullets.get(i).y>a.y-20){

                }
            }
        }
    }
}
