package org.L1;

import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

/**
 * Created by P-C on 1/13/2017.
 */
public class TestAuto {
    public static void main(String[] args) throws IOException {
        String brows = "";
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter browser");
        brows = bufferedReader.readLine();
        if (brows.equals("ch")) {
            L1HW1.test1();
        } else if (brows.equals("ff"))
            L1HW1.test2();
        ;
    }
}
