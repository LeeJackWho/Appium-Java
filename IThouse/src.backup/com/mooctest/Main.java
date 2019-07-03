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
    		/*资讯*/
        	driver.findElementById("com.danmo.ithouse:id/nav_item_news").click();
        	driver.findElementById("com.danmo.ithouse:id/menu_calendar").click();
        	driver.findElementByXPath("//android.widget.TextView[@text='要闻推�??']").click();
        	driver.findElementByXPath("//android.widget.TextView[@text='当日新闻']").click();
        	driver.findElementByXPath("//android.widget.TextView[@text='事件']").click();
        	driver.findElementByXPath("//android.widget.TextView[@text='浏览历史']").click();
        	driver.findElementById("com.danmo.ithouse:id/tv_tab_hotgoods").click();//辣品
        	driver.findElementById("com.danmo.ithouse:id/tv_tab_community").click();//圈子
        	driver.findElementById("com.danmo.ithouse:id/tv_tab_news").click();//新闻
        	driver.findElementByXPath("//android.widget.ImageButton").click();//返回
        	driver.findElementById("com.danmo.ithouse:id/option_search").click();//搜索
        	driver.findElementById("com.danmo.ithouse:id/option_search").sendKeys("中国");
        	driver.findElementById("com.danmo.ithouse:id/iv_search_clear").click();//清空
        	driver.findElementById("com.danmo.ithouse:id/iv_search_back").click();//返回
        	driver.findElementByXPath("//android.widget.ImageView[@index=2]").click();//设置
        	driver.findElementByXPath("//android.widget.TextView[@text='投稿']").click();
        	driver.findElementByXPath("//android.widget.ImageView[@index=2]").click();//设置
        	driver.findElementByXPath("//android.widget.TextView[@text='二维码扫�?']").click();
        	driver.findElementByXPath("//android.widget.ImageView[@index=2]").click();//设置
        	driver.findElementByXPath("//android.widget.TextView[@text='夜间模式']").click();
        	driver.findElementByXPath("//android.widget.ImageView[@index=2]").click();//设置
        	driver.findElementByXPath("//android.widget.TextView[@text='反馈']").click();
//        	driver.sendKeyEvent(AndroidKeyCode.BACK);//返回
        	driver.findElementById("com.danmo.ithouse:id/icon_toolbar_custom").click(); 	
        	driver.findElementByXPath("//android.widget.TextView[@text='�?�?']").click();
        	driver.findElementByXPath("//android.widget.TextView[@text='排行�?']").click();
        	driver.findElementsById("com.danmo.ithouse:id/item_container").get(0).click();
        	driver.findElementByXPath("//android.widget.ImageButton").click();//返回
        	driver.findElementByXPath("//android.widget.TextView[@text='oppo']").click();
        	driver.findElementsById("com.danmo.ithouse:id/item_container").get(0).click();
        	driver.findElementByXPath("//android.widget.ImageButton").click();//返回
        	driver.findElementByXPath("//android.widget.TextView[@text='上热�?']").click();
        	driver.findElementsById("com.danmo.ithouse:id/item_container").get(0).click();
        	driver.findElementByXPath("//android.widget.ImageButton").click();//返回
        	driver.findElementByXPath("//android.widget.TextView[@text='评测�?']").click();
        	driver.findElementsById("com.danmo.ithouse:id/item_container").get(0).click();
        	driver.findElementByXPath("//android.widget.ImageButton").click();//返回
        	driver.findElementByXPath("//android.widget.TextView[@text='发布�?']").click();
        	driver.findElementsById("com.danmo.ithouse:id/item_container").get(0).click();
        	driver.findElementByXPath("//android.widget.ImageButton").click();//返回
        	driver.findElementByXPath("//android.widget.TextView[@text='阳台']").click();
        	driver.findElementsById("com.danmo.ithouse:id/item_container").get(0).click();
        	driver.findElementByXPath("//android.widget.ImageButton").click();//返回
        	driver.findElementByXPath("//android.widget.TextView[@text='手机']").click();
        	driver.findElementsById("com.danmo.ithouse:id/item_container").get(0).click();
        	driver.findElementByXPath("//android.widget.ImageButton").click();//返回
        	driver.findElementByXPath("//android.widget.TextView[@text='数码']").click();
        	driver.findElementsById("com.danmo.ithouse:id/item_container").get(0).click();
        	driver.findElementByXPath("//android.widget.ImageButton").click();//返回
        	driver.findElementByXPath("//android.widget.TextView[@text='极客学院']").click();
        	driver.findElementsById("com.danmo.ithouse:id/item_container").get(0).click();
        	driver.findElementByXPath("//android.widget.ImageButton").click();//返回
        	driver.findElementByXPath("//android.widget.TextView[@text='VR']").click();
        	driver.findElementsById("com.danmo.ithouse:id/item_container").get(0).click();
        	driver.findElementByXPath("//android.widget.ImageButton").click();//返回
        	driver.findElementByXPath("//android.widget.TextView[@text='智能汽车']").click();
        	driver.findElementsById("com.danmo.ithouse:id/item_container").get(0).click();
        	driver.findElementByXPath("//android.widget.ImageButton").click();//返回
        	driver.findElementByXPath("//android.widget.TextView[@text='电脑']").click();
        	driver.findElementsById("com.danmo.ithouse:id/item_container").get(0).click();
        	driver.findElementByXPath("//android.widget.ImageButton").click();//返回
        	
        	/*辣品*/
//        	driver.findElementByXPath("//android.widget.TextView[@text='辣品']").click();
        	driver.findElementById("com.danmo.ithouse:id/nav_item_tweet").click();
        	driver.findElementsById("com.danmo.ithouse:id/hotgoods_rank_pic").get(0).click();
        	driver.sendKeyEvent(AndroidKeyCode.BACK);
        	driver.findElementByXPath("//android.widget.TextView[@text='辣榜']").click();
        	driver.findElementsById("com.danmo.ithouse:id/hotgoods_rank_pic").get(0).click();
        	driver.sendKeyEvent(AndroidKeyCode.BACK);
        	driver.findElementByXPath("//android.widget.TextView[@text='1元包�?']").click();
        	driver.findElementsById("com.danmo.ithouse:id/hotgoods_rank_pic").get(0).click();
        	driver.sendKeyEvent(AndroidKeyCode.BACK);
        	driver.findElementByXPath("//android.widget.TextView[@text='9�?9']").click();
        	driver.findElementsById("com.danmo.ithouse:id/hotgoods_rank_pic").get(0).click();
        	driver.sendKeyEvent(AndroidKeyCode.BACK);
        	driver.findElementByXPath("//android.widget.TextView[@text='19�?9']").click();
        	driver.findElementsById("com.danmo.ithouse:id/hotgoods_rank_pic").get(0).click();
        	driver.sendKeyEvent(AndroidKeyCode.BACK);
        	driver.findElementByXPath("//android.widget.TextView[@text='福包']").click();
        	driver.findElementsById("com.danmo.ithouse:id/hotgoods_rank_pic").get(0).click();
        	driver.sendKeyEvent(AndroidKeyCode.BACK);
        	
        	   	
        	/*圈子*/
        	driver.findElementById("com.danmo.ithouse:id/nav_item_explore").click();
        	driver.findElementByXPath("//android.widget.TextView[@text='畅谈']").click();
        	driver.findElementByXPath("//android.widget.TextView[@text='�?新回�?']").click();
        	driver.findElementByXPath("//android.widget.TextView[@text='热帖']").click();   
        	driver.findElementByXPath("//android.widget.TextView[@text='�?新发�?']").click();
        	driver.findElementById("com.danmo.ithouse:id/floatButton").click();
        	driver.findElementByXPath("//android.widget.ImageButton").click();//返回
        	
        	/*�?*/
        	driver.findElementById("com.danmo.ithouse:id/nav_item_me").click();
        	driver.findElementById("com.danmo.ithouse:id/btn_login").click();
        	driver.findElementById("com.danmo.ithouse:id/et_login_name").click();
        	driver.findElementById("com.danmo.ithouse:id/et_login_name").sendKeys("123456");
        	driver.findElementById("com.danmo.ithouse:id/et_login_password").click();
        	driver.findElementById("com.danmo.ithouse:id/et_login_password").sendKeys("123456");
        	driver.findElementById("com.danmo.ithouse:id/text_input_password_toggle").click();
        	driver.findElementById("com.danmo.ithouse:id/btn_login").click();
        	driver.findElementById("com.danmo.ithouse:id/iv_login_weixin").click();
        	driver.findElementById("com.danmo.ithouse:id/iv_login_qq").click();
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
        File app = new File(appDir, "IThouse.apk");
        
        //设置自动化相关参�?
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", "");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("appPackage", "com.danmo.ithouse");
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
