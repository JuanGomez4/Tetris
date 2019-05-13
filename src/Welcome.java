import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class Welcome extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Menu");
        Text welcome = new Text("Welcome to my Tetris game. I wanted to test my abilities" +
                " and have created this from scratch with as little help as possible. " +
                "Hit 'Start' to begin and enjoy. Thank you.");
        welcome.setWrappingWidth(400);
        Button btn = new Button();
        btn.setText("Start");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });

        //VBox root = new VBox();
        StackPane root = new StackPane();
        root.getChildren().addAll(welcome, btn);
        root.setAlignment(welcome, Pos.TOP_CENTER);
        root.setAlignment(btn, Pos.BOTTOM_CENTER);
        primaryStage.setScene(new Scene(root, 500, 300));
        primaryStage.show();
    }
}