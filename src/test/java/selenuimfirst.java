import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.print.DocFlavor;
import java.net.URL;

 public class selenuimfirst {
    public static WebDriver driver = new ChromeDriver();


    public static void main(String[] args) {

        //  openbroswer("https://the-internet.herokuapp.com/");

        openbrowserusingnavigation("https://the-internet.herokuapp.com/");
        openbrowserusingnavigation("https://www.google.com/");
        openbrowserusingnavigation("https://www.hp.com/us-en/home.html");

        forward();
        back();
        forward();
        maximize ();
        setsizeiphone12pro();
        Full();
        minimize();
    }

    public static void openbroswer(String Url) {
        driver.get(Url);
    }

    //navigation
    public static void openbrowserusingnavigation(String url) {
        driver.navigate().to(url);
    }



    public static void back() {
        driver.navigate().back();
    }


    public static void forward ()
    {
        driver.navigate().forward();

    }

    public static void maximize (){
        driver.manage().window().maximize();
    }


    public static void setsizeiphone12pro ()
    {
        Dimension dimension = new Dimension(390,844);
        driver.manage().window().setSize(new Dimension(390,844));
    }


    public static void Full ()
    {
        driver.manage().window().fullscreen();
    }


    public static void minimize ()
    {
        driver.manage().window().minimize();
    }
}





