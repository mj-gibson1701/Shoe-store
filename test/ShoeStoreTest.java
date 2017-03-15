
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
import java.util.List;
import org.junit.Assert;
import org.junit.After;
import org.openqa.selenium.NoSuchElementException;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
public class ShoeStoreTest   {
   
  WebDriver driver = new ChromeDriver();
  @Test  
  public void testJanuary() {
  driver.get("http://shoestore-manheim.rhcloud.com/");                              //open website with driver
  WebElement monthLink = driver.findElement(By.linkText("January"));                //find month
  monthLink.click();                                                                //open month's page
  List<WebElement> shoeList = driver.findElements(By.xpath("//ul[@id='shoe_list']/li"));  //store list of shoes
  Assert.assertTrue(shoeList.size() > 0);                                           //test that the list is not empty
  for (int counter=0; counter<shoeList.size(); counter++){
      WebElement shoe = shoeList.get(counter);                                      //get individual shoe from the list, iteritive
      Assert.assertFalse(shoe.findElement(By.className("shoe_price")).getText().equals(""));            
      Assert.assertFalse(shoe.findElement(By.className("shoe_description")).getText().equals(""));
      Assert.assertFalse(shoe.findElement(By.className("shoe_image")).findElement(By.tagName("img")).getAttribute("src").equals(""));  //test that the blurb, price, and picture attributes are not empty
  }
  try{
    WebElement email = shoeList.get(0).findElement(By.name("email"));            //if it exists, find the email input box
    if (email != null){
        email.sendKeys("test@domain.com");                                      //input test email
        email = shoeList.get(0).findElement(By.className("notification_email_submit"));
        email.click();                                                          //submit test email
        Assert.assertTrue(driver.findElements(By.className("notice")).size() != 0);     //check that flash notification exists
    }
  }catch (NoSuchElementException e) {}
}
  @Test 
  public void testFebruary() {
  driver.get("http://shoestore-manheim.rhcloud.com/");
  WebElement monthLink = driver.findElement(By.linkText("February"));
  monthLink.click();
  List<WebElement> shoeList = driver.findElements(By.xpath("//ul[@id='shoe_list']/li"));
  Assert.assertTrue(shoeList.size() > 0);
  for (int counter=0; counter<shoeList.size(); counter++){
      WebElement shoe = shoeList.get(counter);
      Assert.assertFalse(shoe.findElement(By.className("shoe_price")).getText().equals(""));
      Assert.assertFalse(shoe.findElement(By.className("shoe_description")).getText().equals(""));
      Assert.assertFalse(shoe.findElement(By.className("shoe_image")).findElement(By.tagName("img")).getAttribute("src").equals(""));
  }
  try{WebElement email = shoeList.get(0).findElement(By.name("email"));
    if (email != null){
        email.sendKeys("test@domain.com");
        email = shoeList.get(0).findElement(By.className("notification_email_submit"));
        email.click();
        Assert.assertTrue(driver.findElements(By.className("notice")).size() != 0);
    }
  }catch (NoSuchElementException e) {}
}
  @Test 
  public void testMarch() {
  driver.get("http://shoestore-manheim.rhcloud.com/");
  WebElement monthLink = driver.findElement(By.linkText("March"));
  monthLink.click();
  List<WebElement> shoeList = driver.findElements(By.xpath("//ul[@id='shoe_list']/li"));
  Assert.assertTrue(shoeList.size() > 0);
  for (int counter=0; counter<shoeList.size(); counter++){
      WebElement shoe = shoeList.get(counter);
      String test = shoe.findElement(By.className("shoe_price")).getText();
      Assert.assertFalse(test.equals(""));
      Assert.assertFalse(shoe.findElement(By.className("shoe_description")).getText().equals(""));
      Assert.assertFalse(shoe.findElement(By.className("shoe_image")).findElement(By.tagName("img")).getAttribute("src").equals(""));
  }
  try{WebElement email = shoeList.get(0).findElement(By.name("email"));
    if (email != null){
        email.sendKeys("test@domain.com");
        email = shoeList.get(0).findElement(By.className("notification_email_submit"));
        email.click();
        Assert.assertTrue(driver.findElements(By.className("notice")).size() != 0);
    }
  }catch (NoSuchElementException e) {}
}
 @Test 
 public void testApril() {
  driver.get("http://shoestore-manheim.rhcloud.com/");
  WebElement monthLink = driver.findElement(By.linkText("April"));
  monthLink.click();
  List<WebElement> shoeList = driver.findElements(By.xpath("//ul[@id='shoe_list']/li"));
  Assert.assertTrue(shoeList.size() > 0);
  for (int counter=0; counter<shoeList.size(); counter++){
      WebElement shoe = shoeList.get(counter);
      Assert.assertFalse(shoe.findElement(By.className("shoe_price")).getText().equals(""));
      Assert.assertFalse(shoe.findElement(By.className("shoe_description")).getText().equals(""));
      Assert.assertFalse(shoe.findElement(By.className("shoe_image")).findElement(By.tagName("img")).getAttribute("src").equals(""));
  }
  WebElement email = shoeList.get(0).findElement(By.name("email"));
  if (email != null){
    email.sendKeys("test@domain.com");
    email = shoeList.get(0).findElement(By.className("notification_email_submit"));
    email.click();
    Assert.assertTrue(driver.findElements(By.className("notice")).size() != 0);
  }
}
 @Test 
 public void testMay() {
  driver.get("http://shoestore-manheim.rhcloud.com/");
  WebElement monthLink = driver.findElement(By.linkText("May"));
  monthLink.click();
  List<WebElement> shoeList = driver.findElements(By.xpath("//ul[@id='shoe_list']/li"));
  Assert.assertTrue(shoeList.size() > 0);
  for (int counter=0; counter<shoeList.size(); counter++){
      WebElement shoe = shoeList.get(counter);
      Assert.assertFalse(shoe.findElement(By.className("shoe_price")).getText().equals(""));
      Assert.assertFalse(shoe.findElement(By.className("shoe_description")).getText().equals(""));
      Assert.assertFalse(shoe.findElement(By.className("shoe_image")).findElement(By.tagName("img")).getAttribute("src").equals(""));
  }
  try{WebElement email = shoeList.get(0).findElement(By.name("email"));
    if (email != null){
        email.sendKeys("test@domain.com");
        email = shoeList.get(0).findElement(By.className("notification_email_submit"));
        email.click();
        Assert.assertTrue(driver.findElements(By.className("notice")).size() != 0);
    }
  }catch (NoSuchElementException e) {}
}
 @Test 
 public void testJune() {
  driver.get("http://shoestore-manheim.rhcloud.com/");
  WebElement monthLink = driver.findElement(By.linkText("June"));
  monthLink.click();
  List<WebElement> shoeList = driver.findElements(By.xpath("//ul[@id='shoe_list']/li"));
  Assert.assertTrue(shoeList.size() > 0);
  for (int counter=0; counter<shoeList.size(); counter++){
      WebElement shoe = shoeList.get(counter);
      Assert.assertFalse(shoe.findElement(By.className("shoe_price")).getText().equals(""));
      Assert.assertFalse(shoe.findElement(By.className("shoe_description")).getText().equals(""));
      Assert.assertFalse(shoe.findElement(By.className("shoe_image")).findElement(By.tagName("img")).getAttribute("src").equals(""));
  }
  try{WebElement email = shoeList.get(0).findElement(By.name("email"));
    if (email != null){
        email.sendKeys("test@domain.com");
        email = shoeList.get(0).findElement(By.className("notification_email_submit"));
        email.click();
        Assert.assertTrue(driver.findElements(By.className("notice")).size() != 0);
    }
  }catch (NoSuchElementException e) {}
}
 @Test 
 public void testJuly() {
  driver.get("http://shoestore-manheim.rhcloud.com/");
  WebElement monthLink = driver.findElement(By.linkText("July"));
  monthLink.click();
  List<WebElement> shoeList = driver.findElements(By.xpath("//ul[@id='shoe_list']/li"));
  Assert.assertTrue(shoeList.size() > 0);
  for (int counter=0; counter<shoeList.size(); counter++){
      WebElement shoe = shoeList.get(counter);
      Assert.assertFalse(shoe.findElement(By.className("shoe_price")).getText().equals(""));
      Assert.assertFalse(shoe.findElement(By.className("shoe_description")).getText().equals(""));
      Assert.assertFalse(shoe.findElement(By.className("shoe_image")).findElement(By.tagName("img")).getAttribute("src").equals(""));
  }
  try{WebElement email = shoeList.get(0).findElement(By.name("email"));
    if (email != null){
        email.sendKeys("test@domain.com");
        email = shoeList.get(0).findElement(By.className("notification_email_submit"));
        email.click();
        Assert.assertTrue(driver.findElements(By.className("notice")).size() != 0);
    }
  }catch (NoSuchElementException e) {}
}
 @Test 
 public void testAugust() {
  driver.get("http://shoestore-manheim.rhcloud.com/");
  WebElement monthLink = driver.findElement(By.linkText("August"));
  monthLink.click();
  List<WebElement> shoeList = driver.findElements(By.xpath("//ul[@id='shoe_list']/li"));
  Assert.assertTrue(shoeList.size() > 0);
  for (int counter=0; counter<shoeList.size(); counter++){
      WebElement shoe = shoeList.get(counter);
      Assert.assertFalse(shoe.findElement(By.className("shoe_price")).getText().equals(""));
      Assert.assertFalse(shoe.findElement(By.className("shoe_description")).getText().equals(""));
      Assert.assertFalse(shoe.findElement(By.className("shoe_image")).findElement(By.tagName("img")).getAttribute("src").equals(""));
  }
  try{WebElement email = shoeList.get(0).findElement(By.name("email"));
    if (email != null){
        email.sendKeys("test@domain.com");
        email = shoeList.get(0).findElement(By.className("notification_email_submit"));
        email.click();
        Assert.assertTrue(driver.findElements(By.className("notice")).size() != 0);
    }
  }catch (NoSuchElementException e) {}
}
 @Test 
 public void testSeptermber() {
  driver.get("http://shoestore-manheim.rhcloud.com/");
  WebElement monthLink = driver.findElement(By.linkText("September"));
  monthLink.click();
  List<WebElement> shoeList = driver.findElements(By.xpath("//ul[@id='shoe_list']/li"));
  Assert.assertTrue(shoeList.size() > 0);
  for (int counter=0; counter<shoeList.size(); counter++){
      WebElement shoe = shoeList.get(counter);
      Assert.assertFalse(shoe.findElement(By.className("shoe_price")).getText().equals(""));
      Assert.assertFalse(shoe.findElement(By.className("shoe_description")).getText().equals(""));
      Assert.assertFalse(shoe.findElement(By.className("shoe_image")).findElement(By.tagName("img")).getAttribute("src").equals(""));
  }
  try{WebElement email = shoeList.get(0).findElement(By.name("email"));
    if (email != null){
        email.sendKeys("test@domain.com");
        email = shoeList.get(0).findElement(By.className("notification_email_submit"));
        email.click();
        Assert.assertTrue(driver.findElements(By.className("notice")).size() != 0);
    }
  }catch (NoSuchElementException e) {}
}
 @Test 
 public void testOctober() {
  driver.get("http://shoestore-manheim.rhcloud.com/");
  WebElement monthLink = driver.findElement(By.linkText("October"));
  monthLink.click();
  List<WebElement> shoeList = driver.findElements(By.xpath("//ul[@id='shoe_list']/li"));
  Assert.assertTrue(shoeList.size() > 0);
  for (int counter=0; counter<shoeList.size(); counter++){
      WebElement shoe = shoeList.get(counter);
      Assert.assertFalse(shoe.findElement(By.className("shoe_price")).getText().equals(""));
      Assert.assertFalse(shoe.findElement(By.className("shoe_description")).getText().equals(""));
      Assert.assertFalse(shoe.findElement(By.className("shoe_image")).findElement(By.tagName("img")).getAttribute("src").equals(""));
  }
  try{WebElement email = shoeList.get(0).findElement(By.name("email"));
    if (email != null){
        email.sendKeys("test@domain.com");
        email = shoeList.get(0).findElement(By.className("notification_email_submit"));
        email.click();
        Assert.assertTrue(driver.findElements(By.className("notice")).size() != 0);
    }
  }catch (NoSuchElementException e) {}
}
 @Test 
 public void testNovermber() {
  driver.get("http://shoestore-manheim.rhcloud.com/");
  WebElement monthLink = driver.findElement(By.linkText("November"));
  monthLink.click();
  List<WebElement> shoeList = driver.findElements(By.xpath("//ul[@id='shoe_list']/li"));
  Assert.assertTrue(shoeList.size() > 0);
  for (int counter=0; counter<shoeList.size(); counter++){
      WebElement shoe = shoeList.get(counter);
      Assert.assertFalse(shoe.findElement(By.className("shoe_price")).getText().equals(""));
      Assert.assertFalse(shoe.findElement(By.className("shoe_description")).getText().equals(""));
      Assert.assertFalse(shoe.findElement(By.className("shoe_image")).findElement(By.tagName("img")).getAttribute("src").equals(""));
  }
  try{WebElement email = shoeList.get(0).findElement(By.name("email"));
    if (email != null){
        email.sendKeys("test@domain.com");
        email = shoeList.get(0).findElement(By.className("notification_email_submit"));
        email.click();
        Assert.assertTrue(driver.findElements(By.className("notice")).size() != 0);
    }
  }catch (NoSuchElementException e) {}
}
 @Test 
 public void testDecember() {
  driver.get("http://shoestore-manheim.rhcloud.com/");
  WebElement monthLink = driver.findElement(By.linkText("December"));
  monthLink.click();
  List<WebElement> shoeList = driver.findElements(By.xpath("//ul[@id='shoe_list']/li"));
  Assert.assertTrue(shoeList.size() > 0);
  for (int counter=0; counter<shoeList.size(); counter++){
      WebElement shoe = shoeList.get(counter);
      Assert.assertFalse(shoe.findElement(By.className("shoe_price")).getText().equals(""));
      Assert.assertFalse(shoe.findElement(By.className("shoe_description")).getText().equals(""));
      Assert.assertFalse(shoe.findElement(By.className("shoe_image")).findElement(By.tagName("img")).getAttribute("src").equals(""));
  }
  try{WebElement email = shoeList.get(0).findElement(By.name("email"));
    if (email != null){
        email.sendKeys("test@domain.com");
        email = shoeList.get(0).findElement(By.className("notification_email_submit"));
        email.click();
        Assert.assertTrue(driver.findElements(By.className("notice")).size() != 0);
    }
  }catch (NoSuchElementException e) {}
}
 
 

 
@After
public void afterTest(){
    driver.quit();
}
 
}
