package screenshot;
import io.cucumber.core.cli.Main;
 
public class runcucmbermain {
    public static void main(String[] args) {
        System.out.println("cwd: " + new java.io.File(".").getAbsolutePath());
        Main.main(new String[] {
            "--plugin", "pretty",
            "--plugin", "html:target/cucumber-report.html",
            "--glue", "screenshot",
            "C:/Users/aditya.sah/eclipse-workspace/Cucumber_Testing_02/Resource/ss.feature"
        });
    }
}