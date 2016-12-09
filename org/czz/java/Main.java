import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        //launch(args);
        HTMLGet icsRetriever1 = new HTMLGet();
        icsRetriever1.getHTML("https://zollhaus.churchtools.de/?q=churchcal/ical&security=kZlDb8iQWg8Y6heWRKnuw4wPdQwdxOUZ&id=7")
    }
}
