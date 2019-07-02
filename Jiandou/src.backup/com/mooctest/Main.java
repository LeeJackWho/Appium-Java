package com.mooctest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.AndroidKeyCode;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.UnreachableBrowserException;


public class Main {
	
	
	/**
	 * �?有和AppiumDriver相关的操作都必须写在该函数中
	 * @param driver
	 */
	public void test(AppiumDriver driver) {
		    	try {
			Thread.sleep(6000);		//等待6s，待应用完全启动
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS); //设置尝试定位控件的最长时间为8s,也就是最多尝�?8s
      /*
    	 * 余下的测试�?�辑请按照题目要求进行编�?
    	 */
    	try {
    		driver.findElementByXPath("//android.widget.ImageButton").click();//导航�?0
        	driver.findElementById("com.lhr.jiandou:id/design_menu_item_text").click();//电影栏目13.64
        	driver.findElementByXPath("//android.widget.TextView[@text='动作']").click();//14.77（每�?1.14�?
        	driver.findElementByXPath("//android.widget.TextView[@text='经典']").click();//15.91
        	driver.findElementByXPath("//android.widget.TextView[@text='科幻']").click();//17.05
        	driver.findElementByXPath("//android.widget.TextView[@text='动画']").click();//18.18
        	driver.findElementByXPath("//android.widget.TextView[@text='喜剧']").click();//19.32
        	driver.findElementByXPath("//android.widget.TextView[@text='爱情']").click();//20.45
        	driver.findElementById("com.lhr.jiandou:id/toolbar_menu_search").click();//搜索34.09
        	driver.findElementByXPath("//android.widget.TextView[@text='电影']").click();//35.23
        	driver.findElementByXPath("//android.widget.TextView[@text='图书']").click();//36.36
        	driver.findElementById("com.lhr.jiandou:id/search_bar").click();
        	driver.findElementById("com.lhr.jiandou:id/search_bar").sendKeys("111");
        	driver.findElementById("com.lhr.jiandou:id/search_go_btn").click();//37.50
        	driver.sendKeyEvent(AndroidKeyCode.BACK);
        	
        	driver.findElementByXPath("//android.widget.ImageButton").click();//导航�?
        	driver.findElementByXPath("//android.widget.CheckedTextView[@text='图书']").click();//图书栏目38.64
        	driver.findElementByXPath("//android.widget.TextView[@text='历史']").click();//39.77
        	driver.findElementByXPath("//android.widget.TextView[@text='编程']").click();//40.91
//        	driver.findElementByXPath("//android.widget.TextView[@text='爱情']").click();
//       	driver.findElementByXPath("//android.widget.TextView[@text='科幻']").click();
        	driver.findElementByXPath("//android.widget.TextView[@text='名著']").click();//42.05
        	driver.findElementByXPath("//android.widget.TextView[@text='小说']").click();//43.18

        	driver.findElementByXPath("//android.widget.ImageButton").click();//导航�?
        	driver.findElementByXPath("//android.widget.CheckedTextView[@text='电影榜单']").click();//44.32
        	//Thread.sleep(5000);
    	    //driver.findElementByXPath("//android.widget.TextView[@text='正在热映']").click();
    	    //driver.findElementByXPath("//android.widget.TextView[@text='即将上映']").click();
    	    //driver.findElementByXPath("//android.widget.TextView[@text='Top250']").click();
        	//APP会停止需要手动进去回到导航栏
        	driver.findElementById("android:id/button1").click();
        	driver.findElementByXPath("//android.widget.TextView[@text='�?�?']").click();
        	driver.findElementByXPath("//android.widget.ImageButton").click();//导航�?
        	driver.findElementByXPath("//android.widget.CheckedTextView[@text='我的收藏']").click();//44.32
        	driver.findElementById("com.lhr.jiandou:id/tab_actor").click();//59.09
        	driver.findElementById("com.lhr.jiandou:id/tab_book").click();//60.23
        	driver.findElementById("com.lhr.jiandou:id/tab_movie").click();//61.36
        	
        	driver.findElementByXPath("//android.widget.ImageButton").click();//导航�?
        	driver.findElementByXPath("//android.widget.CheckedTextView[@text='更改标签']").click();//62.50
        	driver.findElementById("com.lhr.jiandou:id/tv_btn_edit").click();//点击编辑
        	driver.findElementByXPath("//android.widget.TextView[@text='爱情']").click();//不要爱情标签
        	driver.findElementById("com.lhr.jiandou:id/tv_btn_edit").click();//点击完成65.91
        	driver.findElementByXPath("//android.widget.TextView[@text='图书标签']").click();//67.05
//        	driver.findElementById("com.lhr.jiandou:id/tv_btn_edit").click();//点击编辑
//        	driver.findElementByXPath("//android.widget.TextView[@text='中国']").click();
//        	driver.findElementById("com.lhr.jiandou:id/tv_btn_edit").click();//点击完成
        	
        	driver.findElementByXPath("//android.widget.ImageButton").click();//导航�?
        	driver.findElementByXPath("//android.widget.CheckedTextView[@text='设置']").click();//80.68
        	driver.findElementByXPath("//android.widget.RelativeLayout[@index=0]").click();
        	driver.findElementByXPath("//android.widget.CheckedTextView[@text='夜间']").click();
//        	driver.findElementById("android:id/button2").click();//点击取消81.82
        	driver.findElementByXPath("//android.widget.ImageButton").click();//导航�?
        	driver.findElementByXPath("//android.widget.CheckedTextView[@text='设置']").click();
        	driver.findElementById("android:id/checkbox").click();
//        	driver.findElementByXPath("//android.widget.TextView[@text='自动更换主题图片']").click();//82.95     	
        	driver.findElementByXPath("//android.widget.TextView[@text='清除缓存']").click();//84.09
        	driver.findElementByXPath("//android.widget.TextView[@text='源代�?']").click();//85.23
        	driver.sendKeyEvent(AndroidKeyCode.BACK);
        	driver.findElementById("android:id/button1").click();
        	driver.findElementByXPath("//android.widget.TextView[@text='�?源许�?']").click();//87.50
        	driver.findElementById("android:id/button1").click();
        	driver.findElementByXPath("//android.widget.TextView[@text='反馈与建�?']").click();//88.64
        	driver.sendKeyEvent(AndroidKeyCode.BACK);
        	driver.quit();
        } catch (Exception e) {
        }
	}
	
	/**
	 * AppiumDriver的初始化逻辑必须写在该函数中
	 * @return
	 */
	public AppiumDriver initAppiumTest() {
		
		AppiumDriver driver=null;
        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot, "apk");
        File app = new File(appDir, "Jiandou.apk");
        
        //设置自动化相关参�?
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", "");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("appPackage", "com.lhr.jiandou");
        capabilities.setCapability("appActivity", ".activity.MainActivity");
        capabilities.setCapability("noSign", "true");

        //设置apk路径
        capabilities.setCapability("app", app.getAbsolutePath()); 
        
        //设置使用unicode键盘，支持输入中文和特殊字符
        capabilities.setCapability("unicodeKeyboard","true");
        //设置用例执行完成后重置键�?
        capabilities.setCapability("resetKeyboard","true");
        //初始�?
        try {
			driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
        return driver;
	}
	
	public void start() {
		test(initAppiumTest());
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.start();
	}
	

}
