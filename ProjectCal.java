
package projectcal;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
 
/**
 *
 * @author barniclaman
 */
public class ProjectCal  {
    
    /**
     *
     * @param stage
     * @throws Exception
     */
    public void start(Stage stage) throws Exception {
       Parent root = 
         FXMLLoader.load(getClass().getResource("ProjectCal.fxml"));

        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}











