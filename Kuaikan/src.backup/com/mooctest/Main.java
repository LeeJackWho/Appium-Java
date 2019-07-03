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
	 * "appPackage", "com.kuaikan.comic"
	 * "app-launchActivity", "com.kuaikan.comic.ui.LaunchActivity"
	 *  本示例脚本仅作为参�?�，具体请根据自己的测试机型可能出现的特殊情况进行脚本的编写调整
	 */
	
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
    		driver.findElementById("com.kuaikan.comic:id/btn_male").click();//点击男生
        	driver.findElementById("com.kuaikan.comic:id/switch_gender_image").click();//点击换�?�别
        	driver.findElementById("com.kuaikan.comic:id/banner_img").click();//点击轮播�?
//        	手动点返�?
//        	Thread.sleep(1000);
//        	driver.sendKeyEvent(AndroidKeyCode.BACK);
        	driver.findElementById("com.kuaikan.comic:id/search_layout").click();//点击分类
        	driver.findElementByXPath("//android.widget.TextView[@text='玄幻']").click();//点击玄幻
        	Thread.sleep(1000);
        	driver.findElementByXPath("//android.widget.TextView[@text='热血']").click();//点击热血
        	Thread.sleep(1000);
        	driver.findElementByXPath("//android.widget.TextView[@text='异能']").click();//点击异能
        	Thread.sleep(1000);
        	driver.findElementByXPath("//android.widget.TextView[@text='恋爱']").click();//点击恋爱
        	Thread.sleep(1000);
        	driver.findElementByXPath("//android.widget.TextView[@text='恐�??']").click();//点击恐�??
        	Thread.sleep(1000);
        	driver.findElementByXPath("//android.widget.TextView[@text='逆袭']").click();//点击逆袭
        	Thread.sleep(1000);
        	driver.findElementByXPath("//android.widget.TextView[@text='总裁']").click();//点击总裁
        	Thread.sleep(1000);
        	driver.findElementByXPath("//android.widget.TextView[@text='校园']").click();//点击校园
        	Thread.sleep(1000);
        	driver.findElementByXPath("//android.widget.TextView[@text='悬疑']").click();//点击悬疑
        	Thread.sleep(1000);
        	driver.findElementByXPath("//android.widget.TextView[@text='古风']").click();//点击古风
        	Thread.sleep(1000);
        	driver.findElementByXPath("//android.widget.TextView[@text='搞笑']").click();//点击搞笑
        	Thread.sleep(1000);
        	driver.findElementByXPath("//android.widget.TextView[@text='完结']").click();//点击完结
        	Thread.sleep(1000);
        	driver.findElementByXPath("//android.widget.TextView[@text='日漫']").click();//点击日漫
        	Thread.sleep(1000);
        	driver.findElementByXPath("//android.widget.TextView[@text='竞技']").click();//点击竞技
        	Thread.sleep(1000);
        	driver.findElementByXPath("//android.widget.TextView[@text='投稿']").click();//点击投稿
        	Thread.sleep(1000);
        	driver.findElementById("com.kuaikan.comic:id/order_new").click();//点击新上�?
        	driver.findElementById("com.kuaikan.comic:id/order_hot").click();//点击�?火热
        	driver.findElementById("com.kuaikan.comic:id/order_all").click();//点击推荐
        	driver.findElementById("com.kuaikan.comic:id/search_image").click();//点击搜索
        	driver.findElementById("com.kuaikan.comic:id/search_input").click();//点击搜索�?
        	Thread.sleep(1000);
        	driver.findElementById("com.kuaikan.comic:id/search_input").sendKeys("龙珠");
        	driver.findElementByXPath("//android.widget.TextView[@text='龙珠']").click();
        	driver.findElementById("com.kuaikan.comic:id/topic_name").click();//点击进入漫画详情
        	driver.findElementById("com.kuaikan.comic:id/topic_detail_header_collect").click();//点击关注
        	driver.findElementById("com.kuaikan.comic:id/login_toolbar_forget_pwd").click();//点击忘记密码
        	driver.sendKeyEvent(AndroidKeyCode.BACK);
        	driver.findElementById("com.kuaikan.comic:id/activity_login_account").click();//点击用户�?
        	driver.findElementById("com.kuaikan.comic:id/activity_login_account").sendKeys("12345678");
        	driver.findElementById("com.kuaikan.comic:id/activity_login_pwd").click();//点击密码
        	driver.findElementById("com.kuaikan.comic:id/activity_login_pwd").sendKeys("12345678");
        	driver.findElementById("com.kuaikan.comic:id/login_btn").click();//点击登录
        	driver.findElementById("com.kuaikan.comic:id/register_account").click();//点击立即注册
        	driver.sendKeyEvent(AndroidKeyCode.BACK);
        	driver.findElementById("com.kuaikan.comic:id/login_qq").click();//点击qq登录
        	driver.sendKeyEvent(AndroidKeyCode.BACK);
        	driver.findElementById("com.kuaikan.comic:id/login_weibo").click();//点击微博登录
        	driver.sendKeyEvent(AndroidKeyCode.BACK);
        	driver.findElementById("com.kuaikan.comic:id/tv_operate_entrance_nav").click();//点击马上领取
        	driver.findElementByXPath("//android.widget.ImageButton[@content-desc='转到上一层级']").click();//点击返回
        	driver.sendKeyEvent(AndroidKeyCode.BACK);
        	driver.findElementByXPath("//android.widget.TextView[@text='鸟山�?']").click();//点击鸟山�?
        	driver.findElementById("com.kuaikan.comic:id/author_tab_info").click();//点击资料
        	driver.findElementById("com.kuaikan.comic:id/author_tab_feed").click();//点击动�??
//        	driver.findElementById("com.kuaikan.comic:id/feed_item_layout").click();//动�?�内�?
        	driver.findElementById("com.kuaikan.comic:id/feed_content").click();//动�?�内�?
        	driver.findElementById("com.kuaikan.comic:id/feed_comment").click();//点击评论
        	driver.findElementById("com.kuaikan.comic:id/comment_list_hottest_tab").click();//点击评论�?�?
        	driver.findElementById("com.kuaikan.comic:id/nav_icon").click();//点击返回
        	driver.findElementById("com.kuaikan.comic:id/toolbar_nav_icon").click();//点击返回
        	driver.findElementById("com.kuaikan.comic:id/activity_author_back_layout").click();//点击返回
        	driver.findElementByXPath("//android.widget.TextView[@text='集英�?']").click();//点击集英�?
        	driver.findElementById("com.kuaikan.comic:id/activity_author_back_layout").click();//点击返回
        	driver.findElementById("com.kuaikan.comic:id/tab_comic_list").click();//点击选集
        	driver.findElementById("com.kuaikan.comic:id/wave_round_rect_layout").click();//点击正序
        	Thread.sleep(2000);
        	driver.findElementById("com.kuaikan.comic:id/wave_round_rect_layout").click();//点击倒序
        	driver.findElementByXPath("//android.widget.TextView[@text='�?2�? 龙珠不见了？']").click();//点击�?2�? 龙珠不见了？
        	driver.findElementById("com.kuaikan.comic:id/pre_comic_img").click();//点击上一�?
            driver.findElementById("com.kuaikan.comic:id/next_comic_img").click();//点击下一�?
        	driver.findElementById("com.kuaikan.comic:id/comment_count_layout").click();//点击评论
        	driver.findElementById("com.kuaikan.comic:id/comment_list_hottest_tab").click();//点击热门评论
        	driver.findElementById("com.kuaikan.comic:id/comment_list_newest_tab").click();//点击�?新评�?
        	driver.findElementById("com.kuaikan.comic:id/nav_icon").click();//点击返回
        	driver.findElementById("com.kuaikan.comic:id/comment_share").click();//点击分享
        	driver.sendKeyEvent(AndroidKeyCode.BACK);
            driver.findElementById("com.kuaikan.comic:id/setting_img").click();//点击设置
            driver.findElementById("com.kuaikan.comic:id/slide_flip_layout").click();//点击左右翻页
            driver.findElementById("com.kuaikan.comic:id/setting_img").click();//点击设置
        	driver.findElementById("com.kuaikan.comic:id/flip_switch_img").click();//点击点击翻页
        	driver.findElementById("com.kuaikan.comic:id/night_mode_switch_img").click();//点击夜间模式
        	driver.findElementById("com.kuaikan.comic:id/vertical_flip_layout").click();//点击上下翻页
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
        File app = new File(appDir, "kuaikan.apk");
        
        //设置自动化相关参�?
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", "");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("appPackage", "com.kuaikan.comic");
        capabilities.setCapability("appActivity", ".ui.LaunchActivity");
        capabilities.setCapability("noSign", "true");
        
        //设置apk路径
        capabilities.setCapability("app", app.getAbsolutePath()); 
        
        //设置app的主包名和主类名
        capabilities.setCapability("appPackage", "com.kuaikan.comic");
        capabilities.setCapability("appActivity", "com.kuaikan.comic.ui.LaunchActivity");
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
