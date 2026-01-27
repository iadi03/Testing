package TestingMGMeetaGeeksPUN_GM.TestingMGMeetaGeeksPUN_GM_selenium;


import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Collections;

public class DragAndDrop{
	
	static WebDriver driver = new EdgeDriver();
//    @Test
//    public void clickAndHold() {
//        driver.get("https://jqueryui.com/droppable/");
//
//        WebElement clickable = driver.findElement(By.id("clickable"));
//        new Actions(driver)
//                .clickAndHold(clickable)
//                .perform();
//
//        Assertions.assertEquals("focused", driver.findElement(By.id("click-status")).getText());
//    }
//
//    @Test
//    public void clickAndRelease() {
//        driver.get("https://jqueryui.com/droppable/");
//
//        WebElement clickable = driver.findElement(By.id("click"));
//        new Actions(driver)
//                .click(clickable)
//                .perform();
//
//        Assertions.assertTrue(driver.getCurrentUrl().contains("resultPage.html"));
//    }
//
//    @Test
//    public void rightClick() {
//        driver.get("https://jqueryui.com/droppable/");
//
//        WebElement clickable = driver.findElement(By.id("clickable"));
//        new Actions(driver)
//                .contextClick(clickable)
//                .perform();
//
//        Assertions.assertEquals("context-clicked", driver.findElement(By.id("click-status")).getText());
//    }
//
//    @Test
//    public void backClick() {
//        driver.get("https://jqueryui.com/droppable/");
//        driver.findElement(By.id("click")).click();
//        Assertions.assertEquals(driver.getTitle(), "We Arrive Here");
//
//        PointerInput mouse = new PointerInput(PointerInput.Kind.MOUSE, "default mouse");
//
//        Sequence actions = new Sequence(mouse, 0)
//                .addAction(mouse.createPointerDown(PointerInput.MouseButton.BACK.asArg()))
//                .addAction(mouse.createPointerUp(PointerInput.MouseButton.BACK.asArg()));
//
//        ((RemoteWebDriver) driver).perform(Collections.singletonList(actions));
//
//        Assertions.assertEquals("BasicMouseInterfaceTest", driver.getTitle());
//    }
//
//    @Test
//    public void forwardClick() {
//        driver.get("https://jqueryui.com/droppable/");
//        driver.findElement(By.id("click")).click();
//        driver.navigate().back();
//        Assertions.assertEquals(driver.getTitle(), "BasicMouseInterfaceTest");
//
//        PointerInput mouse = new PointerInput(PointerInput.Kind.MOUSE, "default mouse");
//
//        Sequence actions = new Sequence(mouse, 0)
//                .addAction(mouse.createPointerDown(PointerInput.MouseButton.FORWARD.asArg()))
//                .addAction(mouse.createPointerUp(PointerInput.MouseButton.FORWARD.asArg()));
//
//        ((RemoteWebDriver) driver).perform(Collections.singletonList(actions));
//
//        Assertions.assertEquals("We Arrive Here", driver.getTitle());
//    }
//
//    @Test
//    public void doubleClick() {
//        driver.get("https://jqueryui.com/droppable/");
//
//        WebElement clickable = driver.findElement(By.id("clickable"));
//        new Actions(driver)
//                .doubleClick(clickable)
//                .perform();
//
//        Assertions.assertEquals("double-clicked", driver.findElement(By.id("click-status")).getText());
//    }
//
    @Test
    public void hovers() {
		//public static void main(String[] args) {
			
       driver.get("https://vinothqaacademy.com/mouse-event/");

        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/div[3]/div[2]/div[2]/ul/li[7]")).click();
        
        WebElement Demo = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/div[3]/div[2]/div[2]/ul/li[7]/ul/li[2]"));
        
        Actions act = new Actions(driver);
                act.moveToElement(Demo).click()
               .build().perform();

//      Assertions.assertEquals("hovered", driver.findElement(By.id("move-status")).getText());
    }
//
//    @Test
//    public void moveByOffsetFromElement() {
//        driver.get("https://jqueryui.com/droppable/");
//        driver.manage().window().fullscreen();
//
//        WebElement tracker = driver.findElement(By.id("mouse-tracker"));
//        new Actions(driver)
//                .moveToElement(tracker, 8, 0)
//                .perform();
//
//        String[] result = driver.findElement(By.id("relative-location")).getText().split(", ");
//        Assertions.assertTrue(Math.abs(Integer.parseInt(result[0]) - 100 - 8) < 2);
//    }
//
//    @Test
//    public void moveByOffsetFromViewport() {
//        driver.get("https://jqueryui.com/droppable/");
//
//        PointerInput mouse = new PointerInput(PointerInput.Kind.MOUSE, "default mouse");
//
//        Sequence actions = new Sequence(mouse, 0)
//                .addAction(mouse.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), 8, 12));
//
//        ((RemoteWebDriver) driver).perform(Collections.singletonList(actions));
//
//        String[] result = driver.findElement(By.id("absolute-location")).getText().split(", ");
//        Assertions.assertTrue(Math.abs(Integer.parseInt(result[0]) - 8) < 2);
//        Assertions.assertTrue(Math.abs(Integer.parseInt(result[1]) - 12) < 2);
//    }
//
//    @Test
//    public void moveByOffsetFromCurrentPointer() {
//        driver.get("https://jqueryui.com/droppable/");
//
//        PointerInput mouse = new PointerInput(PointerInput.Kind.MOUSE, "default mouse");
//
//        Sequence actions = new Sequence(mouse, 0)
//                .addAction(mouse.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), 8, 11));
//        ((RemoteWebDriver) driver).perform(Collections.singletonList(actions));
//
//        new Actions(driver)
//                .moveByOffset(13, 15)
//                .perform();
//
//        String[] result = driver.findElement(By.id("absolute-location")).getText().split(", ");
//        Assertions.assertTrue(Math.abs(Integer.parseInt(result[0]) - 8 - 13) < 2);
//        Assertions.assertTrue(Math.abs(Integer.parseInt(result[1]) - 11 - 15) < 2);
//    }

//	@Test
//    public static class DragAndDropFunctionality {
//    	public static void main(String[] args) {
//    		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//    		
//    		driver.get("https://jqueryui.com/droppable/");
//    		
//    		//Switch to frames containing the demo
//    		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
//     
//    		WebElement draggable = driver.findElement(By.id("draggable"));
//            WebElement droppable = driver.findElement(By.id("droppable"));
//            new Actions(driver)
//                    .dragAndDrop(draggable, droppable)
//                    .perform();
//           
//            // Verify the drag-and-drop operation
//            String droppedText = droppable.getText();
//            if (droppedText.equals("Dropped!")) {
//            System.out.println("Drag and drop successfully done!");
//            } else {
//            System.out.println("Drag and drop not done successfully");
//            }
//    	}

//    @Test
//    public void dragsByOffset() {
//        driver.get("https://jqueryui.com/droppable/");
//
//        WebElement draggable = driver.findElement(By.id("draggable"));
//        Rectangle start = draggable.getRect();
//        Rectangle finish = driver.findElement(By.id("droppable")).getRect();
//        new Actions(driver)
//                .dragAndDropBy(draggable, finish.getX() - start.getX(), finish.getY() - start.getY())
//                .perform();
//
//        Assertions.assertEquals("dropped", driver.findElement(By.id("drop-status")).getText());
//    }
    }
