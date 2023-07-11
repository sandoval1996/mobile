package UI;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.time.Duration;

public class PageHomeWikipedia {



    public static final Target BOTON_OPCIONES = Target.the("Boton Id").located(By.id("org.wikipedia.alpha:id/menu_overflow_button")).waitingForNoMoreThan(Duration.ofSeconds(15));


    public static final Target BOTON_OPCION_LOGIN = Target.the("Boton Opcion Id").located(By.id("org.wikipedia.alpha:id/explore_overflow_account_name"));

    public static final Target CAMPO_USUARIO = Target.the("User").located(By.id("org.wikipedia.alpha:id/login_username_text"));

    public static final Target CAMPO_PASSWORD = Target.the("password").located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/TextInputLayout[2]/android.widget.FrameLayout/android.widget.EditText"));

    public static final Target BOTON_LOGUIN = Target.the("Boton login").located(By.id("org.wikipedia.alpha:id/login_button"));

    public static final Target TITULO =Target.the("titulo").located(By.id("org.wikipedia.alpha:id/explore_overflow_account_name")).waitingForNoMoreThan(Duration.ofSeconds(30));







}
