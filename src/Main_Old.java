import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main_Old extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("screen.fxml"));
        primaryStage.setTitle("L'attaque");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }


    public static void main(String[] args) { launch(args);}
}
    /*
    //Setup PART 1
    PLayer one = new Player(1, false);
    Player two = new Player(2, false);
    if(Math.random() * 2 > 1)
        one.setTurn();
        else
        two.setTurn();


    //Fight
    Public Piece fight(Piece a, Piece b){
        if(!(a instanceof Spy && b.getValue() == 10 || b instanceof Spy && a.getValue() == 10)){
            if(a.getValue() > b.getValue()){
                b.kill();
                return a;
            } else {
            if(b.getValue() > a.getValue()){
                a.kill();
                return b;
            } else {
            a.kill();
            b.kill();
            return null;
        } else {
        if(a instanceof Spy) {
            b.kill();
            return a;
        } else
        a.kill();
        return b;
    }


     */