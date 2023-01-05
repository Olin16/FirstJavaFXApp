import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.paint.Color;
import javafx.scene.control.Slider;






public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Its a Small World");

        Label label1 = new Label("Hullo everyone");
        Label label2 = new Label(":)");
        Label label3 = new Label("<3");
        label1.setFont(new Font("Arial", 50));
        Button button1 = new Button("Click");

        GridPane gridPane = new GridPane();

        Button button2 = new Button("Press Me!");
        gridPane.add(button2,2,1,1, 1);

        button2.setOnAction(actionEvent -> {
            label3.setText("</3");
        });

        button1.setOnAction(actionEvent -> {
            label1.setText(":(");

        });

        TextField typeHere = new TextField("Please type here!");
        typeHere.setOnAction(actionEvent ->  {
            label2.setText(typeHere.getText());
        });

        Slider slider = new Slider(0, 100, 0);

        ChoiceBox choiceBox = new ChoiceBox();

        choiceBox.getItems().add("Ketchup");
        choiceBox.getItems().add("Mustard");
        choiceBox.getItems().add("Siracha");

        choiceBox.setOnAction((event) -> {
            int selectedIndex = choiceBox.getSelectionModel().getSelectedIndex();
            Object selectedItem = choiceBox.getSelectionModel().getSelectedItem();

            System.out.println("Selection made: [" + selectedIndex + "] " + selectedItem);
            System.out.println("   ChoiceBox.getValue(): " + choiceBox.getValue());

            if(selectedIndex == 0){
                System.out.println("Good choice");
            }
            if (selectedIndex == 1){
                System.out.println("EHHHH");
            }
            if(selectedIndex == 2){
                System.out.println("Very nice");
            }
        });




            ColorPicker colorPicker = new ColorPicker();


            colorPicker.setOnAction(actionEvent -> {
                Color value = colorPicker.getValue();
                label1.setTextFill(value);
    });

            VBox vbox = new VBox(label2, label3, button1, colorPicker, slider);
        HBox hbox = new HBox(20, label1, vbox, typeHere, gridPane, choiceBox);

        Scene scene = new Scene(hbox, 1000, 1000);
        primaryStage.setScene(scene);



        primaryStage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
