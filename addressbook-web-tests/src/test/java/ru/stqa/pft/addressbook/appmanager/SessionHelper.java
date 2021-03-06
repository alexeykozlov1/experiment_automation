package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by alexeykozlov on 10/13/17.
 */
public class SessionHelper extends HelperBase {


  public SessionHelper(ChromeDriver wd) {
    super(wd);
  }

  public void login(String username, String password) {
    type(By.name("user"),username);
    type(By.name("pass"), password);
    click(By.xpath("//form[@id='LoginForm']/input[3]"));
  }
}
