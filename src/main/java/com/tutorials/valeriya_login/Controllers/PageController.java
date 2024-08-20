package com.tutorials.valeriya_login.Controllers;

import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

public class PageController implements Initializable {

    public MenuItem menu_Spanish_BTN;
    public MenuItem menu_French_BTN;
    public Text create_Acc_TXT;
    public Text create_Acc_subtext1_TXT;
    public Text create_Acc_subtext2_TXT;
    public TextField username_TF;
    public TextField email_TF;
    public TextField password_TF;
    public Button passwordvisualise_BTN;
    public Button signup_BTN;
    public Button contApp_BTN;
    public Button contgoogle_BTN;
    public Button signIn_BTN;
    public Text Accquest_txt;
    public MenuButton menu_default_BTN;
    public MenuItem menu_English_BTN;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        changeLanguages();
        Links();

    }

    private void changeLanguages() {
        menu_default_BTN.getItems().get(0).setOnAction(actionEvent -> {
            changeLanguageToSpanish();
        });

        menu_default_BTN.getItems().get(1).setOnAction(actionEvent -> {
           changeLanguageToFrench();
        });

        menu_default_BTN.getItems().get(2).setOnAction(actionEvent -> {
            changeLanguageToEnglish();
        });
    }

    public void changeLanguageToSpanish() {

        menu_Spanish_BTN.setOnAction(actionEvent -> {
            changeLanguageToSpanish();
        });

        create_Acc_TXT.setText("Crear una cuenta");
        create_Acc_subtext1_TXT.setText("Cree una cuenta para acceder a todas las funciones");
        create_Acc_subtext2_TXT.setText("sin anuncios por gratis");
        username_TF.setPromptText("Nombre de usuario");
        email_TF.setPromptText("Correo electrónico");
        password_TF.setPromptText("Contraseña");
        signup_BTN.setText("Registrarse");
        contApp_BTN.setText("Continuar con la aplicación");
        contgoogle_BTN.setText("Continuar con Google");
        signIn_BTN.setText("Iniciar sesión");
        Accquest_txt.setText("¿Ya tienes una cuenta?");


    }

    public void changeLanguageToFrench() {

        menu_French_BTN.setOnAction(actionEvent -> {
            changeLanguageToFrench();
        });
        create_Acc_TXT.setText("Créer un compte");
        create_Acc_subtext1_TXT.setText("Créez un compte pour accéder à toutes les fonctionnalités");
        create_Acc_subtext2_TXT.setText("sans publicité gratuitement");
        username_TF.setPromptText("Nom d'utilisateur");
        email_TF.setPromptText("Adresse e-mail");
        password_TF.setPromptText("Mot de passe");
        signup_BTN.setText("S'inscrire");
        contApp_BTN.setText("Continuer avec l'application");
        contgoogle_BTN.setText("Continuer avec Google");
        signIn_BTN.setText("Se connecter");
        Accquest_txt.setText("Vous avez déjà un compte?");


    }

    public void changeLanguageToEnglish() {

        menu_English_BTN.setOnAction(actionEvent -> {
            changeLanguageToEnglish();
        });
        create_Acc_TXT.setText("Create an account");
        create_Acc_subtext1_TXT.setText("Create an account to access all features");
        create_Acc_subtext2_TXT.setText("ad-free for free");
        username_TF.setPromptText("Username");
        email_TF.setPromptText("Email");
        password_TF.setPromptText("Password");
        signup_BTN.setText("Sign up");
        contApp_BTN.setText("Continue with app");
        contgoogle_BTN.setText("Continue with Google");
        signIn_BTN.setText("Sign in");
        Accquest_txt.setText("Already have an account?");


    }

    public void Links() {
        contgoogle_BTN.setOnAction(actionEvent -> {
            try {
                Desktop.getDesktop().browse(new URI("https://accounts.google.com/"));
            } catch (IOException e) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("");
                alert.setHeaderText("An Error Occurred");
                alert.setContentText("Opps! Something Went Wrong");;
            } catch (URISyntaxException e) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error Dialog");
                alert.setHeaderText("An Error Occurred");
                alert.setContentText("Can't Connect With Google");;
            }
        });

        contApp_BTN.setOnAction(actionEvent -> {
            try {
                Desktop.getDesktop().browse(new URI("https://www.icloud.com/"));
            } catch (IOException e) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("");
                alert.setHeaderText("An Error Occurred");
                alert.setContentText("Opps! Something Went Wrong");
            } catch (URISyntaxException e) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error Dialog");
                alert.setHeaderText("An Error Occurred");
                alert.setContentText("Can't Connect With Google");;
            }
        });
    }
}
