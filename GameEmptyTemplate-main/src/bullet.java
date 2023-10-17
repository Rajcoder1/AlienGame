import java.util.ArrayList;

public class bullet {
    public static ArrayList<bullet> bullets=new ArrayList<>();
    public int x;
    public int y;
    private int width;
    private int height;

    public bullet(Game g){
        this.x=400;
        this.y=420;
        this.width=10;
        this.height=10;
        bullets.add(this);

    }

    public static void drawBullet(Game g){
        if(bullets!=null){
            for (int i = 0; i < bullets.size(); i++) {
                bullets.get(i).y-=10;
                g.ellipse(bullets.get(i).x,bullets.get(i).y,bullets.get(i).width,bullets.get(i).height);
            }
        }

    }
}
