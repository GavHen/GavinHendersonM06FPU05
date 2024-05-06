package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;


public class Main extends Application {

    private boolean gameStarted = false;
    private double deltaX = 2;
    private double deltaY = -2;
    private Button gameOverButton;
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Create root node (AnchorPane)
        AnchorPane root = new AnchorPane();

        // Create Circle (ball)
        Circle circle = new Circle(300, 300, 5, Color.DODGERBLUE);

        // Create Rectangle (paddle)
        Rectangle paddle = new Rectangle(256, 344, 88, 10);
        paddle.setFill(Color.DODGERBLUE);

        // Create Rectangle (bottom zone)
        Rectangle bottomZone = new Rectangle(0, 395, 600, 10);
        bottomZone.setFill(Color.TRANSPARENT);

        // Create Start Button
        Button startButton = new Button("START");
        startButton.setLayoutX(188);
        startButton.setLayoutY(145);
        startButton.setPrefSize(225, 111);

        // Add components to the root AnchorPane
        root.getChildren().addAll(circle, paddle, bottomZone, startButton);

        // Create scene
        Scene scene = new Scene(root, 600, 400);

        // Set scene and show stage
        primaryStage.setTitle("Block Breaker");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        // Create Game Over Button
        gameOverButton = new Button("Game Over! You hit the bottom.");
        gameOverButton.setLayoutX(200);
        gameOverButton.setLayoutY(270);
        gameOverButton.setPrefSize(200, 50);
        gameOverButton.setVisible(false); // Make the button invisible initially
        
        
        // Add the button to the root AnchorPane
        root.getChildren().add(gameOverButton);
    }
}