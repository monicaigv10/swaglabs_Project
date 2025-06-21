package listener;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import static java.sql.DriverManager.getDriver;

public class AllureListener implements ITestListener {

//    @Override
//    public void onTestFailure(ITestResult result){
//        Object testClas = result.getInstance();
//        if(testClas instanceof BaseTest) {
//            WebDriver driver = ((BaseTest) testClass).getDriver();
//            if(driver != null) {
//                byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//
//                //Este es el metodo clave para que Allure veo el screenshot como PNG y nombre el archivo correctamente
//                Allure.getlifecycle().addAttachment("Screenshot on Failure", "image/png", "png", screenshot);
//                System.out.println("Screenshot registrado correctamente con tipo PNG");
//            }
//        }
//    }
}
