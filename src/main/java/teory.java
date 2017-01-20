/**
 * Created by P-C on 1/14/2017.
 */
public class teory {
    //css Input.Formlass.ip.

    //xpath - первым делом указываем корень, / - корень всего документа
    //    //input[параметры по котрым хотим искать]...[]
    //  //Input[@class='Formclass']
    // //Input[contains(@class, 'Form')]
    // // - любой элемент за
    // / - следующий элемент
    // если много элементов для поиска - исспользовать xpath
    //div[Text()='SomeText']
    //dev[contains(Text, 'some text')]

//    Explicit Wait - явное (непосредственное, прямое)
//    ожидание используется "здесь и сейчас" на один конкретный поиск элемента.
//    WebDriver driver = new FirefoxDriver();
//    driver.get("http://someurl");
//    // ждем до 10 секунд
//    WebElement explicitWait = (new WebDriverWait(driver, 10))
//// или пока не появился элемент с id=bar
//            .until(ExpectedConditions.presenceOfElementLocated(By.id("bar")));


//    Implicit Wait - неявное (косвенное, скрытое)
//    ожидание устанавливается один раз в коде вне операции поиска и действительно до изменения.
//    WebDriver driver = new FirefoxDriver();
//// задает максимум 10 секунд ожидания для каждого поиска
//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//driver.get("http://someurl");
//    // ждёт до 10 секунд, пока элемент не будет найден
//    WebElement elem1 = driver.findElement(By.id("elem1"));
//    //... сто строк спустя...
//// тоже ждёт до 10 секунд
//    WebElement elem2 = driver.findElement(By.id("elem2"));
}
