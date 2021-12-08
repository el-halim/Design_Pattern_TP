import observable.Player;
import observers.Camera;
import observers.Couloir;
import observers.Gardien;
import observers.Observer;


public class Application {
    public static void main(String[] args) {
        Player observable= new Player();
        Observer camera = new Camera();
        Observer couloir = new Couloir();
        Observer gardien = new Gardien();


        observable.subscribe(camera);
        observable.subscribe(couloir);
        observable.subscribe(gardien);


        observable.setScore(10);
        System.out.println("********************");
       observable.setScore(60);


    }
}
