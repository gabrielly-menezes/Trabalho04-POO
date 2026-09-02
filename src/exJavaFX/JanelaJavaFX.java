package exJavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JanelaJavaFX extends Application {

    @Override
    public void start(Stage palcoPrincipal) {
        // Cria um elemento de texto
        Label texto = new Label("Olá do JavaFX!");

        // Cria um painel contêiner centralizado
        StackPane painel = new StackPane();
        painel.getChildren().add(texto);

        // Cria a cena com dimensões 400x250
        Scene cena = new Scene(painel, 400, 250);

        // Configura o palco (janela)
        palcoPrincipal.setTitle("Minha Primeira Janela JavaFX");
        palcoPrincipal.setScene(cena);
        palcoPrincipal.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
