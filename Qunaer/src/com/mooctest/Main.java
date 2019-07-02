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
	 * "appPackage", "com.Qunar"
	 * "app-launchActivity", "com.mqunar.splash.SplashActivity"
	 *  本示例脚本仅作为参考，具体请根据自己的测试机型可能出现的特殊情况进行脚本的编写调整
	 */
	
	/**
	 * 所有和AppiumDriver相关的操作都必须写在该函数中
	 * @param driver
	 */
	public void test(AppiumDriver driver) {
		int screen_width = driver.manage().window().getSize().width;//screen width
		int screen_height = driver.manage().window().getSize().height; //screen height
		    	try {
			Thread.sleep(6000);		//等待6s，待应用完全启动
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS); //设置尝试定位控件的最长时间为8s,也就是最多尝试8s
    	driver.findElementById("android:id/button1").click();//创建桌面快捷键
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //设置尝试定位控件的最长时间为10s,也就是最多尝试10s
    	driver.findElementById("com.mqunar.atom.attemper:id/atom_atte_iv_close").click();//关闭更新
    	driver.findElementById("com.mqunar.atom.alexhome:id/atom_alexhome_order_default").click();//点击订单
    	driver.findElementById("com.mqunar.patch:id/pub_pat_ll_left_area").click();//点击返回
    	driver.findElementById("com.mqunar.atom.alexhome:id/atom_alexhome_finding_default").click();//点击发现
    	try {
			Thread.sleep(6000);		//等待6s，待应用完全启动
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	driver.sendKeyEvent(AndroidKeyCode.BACK);//返回
    	driver.findElementById("com.mqunar.atom.alexhome:id/atom_alexhome_service_default").click();//点击服务
    	driver.sendKeyEvent(AndroidKeyCode.BACK);//返回
    	driver.findElementById("com.mqunar.atom.alexhome:id/atom_alexhome_uc_default").click();//点击我的
    	driver.sendKeyEvent(AndroidKeyCode.BACK);//返回
    	driver.findElementById("com.mqunar.atom.alexhome:id/atom_alexhome_mod_sight").click();//点击景点·门票
    	driver.findElementById("com.mqunar.atom.sight:id/atom_sight_main_tv_city_icon").click();//点击选择城市
    	driver.findElementByXPath("//android.widget.TextView[@text='N']").click();//点击N
    	driver.findElementByXPath("//android.widget.TextView[@text='南京']").click();//点击南京
    	driver.findElementById("com.mqunar.atom.sight:id/atom_sight_main_tv_searchbox").click();//点击搜索框
    	driver.findElementById("com.mqunar.atom.sight:id/atom_sight_suggest_et_search").sendKeys("南京");//输入南京
    	driver.findElementById("com.mqunar.atom.sight:id/atom_sight_suggest_ivDelete").click();//点击清空
    	driver.findElementById("com.mqunar.atom.sight:id/atom_sight_suggest_iv_backpress").click();//点击返回
    	driver.findElementByXPath("//android.widget.TextView[@text='景点门票']").click();//点击景点门票
    	driver.findElementById("com.mqunar.atom.sight:id/atom_sight_list_tv_searchbox").click();//点击搜索栏
    	driver.findElementById("com.mqunar.atom.sight:id/atom_sight_suggest_ivDelete").click();//点击清空
    	driver.findElementById("com.mqunar.atom.sight:id/atom_sight_suggest_et_search").sendKeys("666");//输入南京
    	driver.findElementById("com.mqunar.atom.sight:id/atom_sight_suggest_iv_backpress").click();//点击返回
    	driver.findElementById("com.mqunar.atom.sight:id/atom_sight_list_map_icon").click();//点击地图
    	driver.findElementById("com.mqunar.atom.sight:id/atom_sight_list_map_icon").click();//点击列表
    	driver.findElementByXPath("//android.widget.TextView[@text='可订今日']").click();//点击可订今日
    	driver.findElementByXPath("//android.widget.TextView[@text='可订明日']").click();//点击可订明日
    	driver.findElementByXPath("//android.widget.TextView[@text='热销景点']").click();//点击热销景点
    	driver.findElementById("com.mqunar.atom.sight:id/atom_sight_bottom_bar_tv_right").click();//点击排序
    	driver.findElementByXPath("//android.widget.TextView[@text='离我最近']").click();//点击离我最近
    	driver.findElementById("com.mqunar.atom.sight:id/atom_sight_bottom_bar_tv_right").click();//点击排序
    	driver.findElementByXPath("//android.widget.TextView[@text='销量最高']").click();//点击销量最高
    	driver.findElementById("com.mqunar.atom.sight:id/atom_sight_bottom_bar_tv_right").click();//点击排序
    	driver.findElementByXPath("//android.widget.TextView[@text='价格最高']").click();//点击价格最高
    	driver.findElementById("com.mqunar.atom.sight:id/atom_sight_bottom_bar_tv_right").click();//点击排序
    	driver.findElementByXPath("//android.widget.TextView[@text='价格最低']").click();//点击价格最低
    	driver.findElementById("com.mqunar.atom.sight:id/atom_sight_bottom_bar_tv_right").click();//点击排序
    	driver.findElementByXPath("//android.widget.TextView[@text='推荐排序']").click();//点击推荐排序
    	driver.findElementById("com.mqunar.atom.sight:id/atom_sight_bottom_bar_tv_left").click();//点击景点门票
    	driver.findElementByXPath("//android.widget.TextView[@text='户外拓展']").click();//点击户外拓展
    	driver.findElementById("com.mqunar.atom.sight:id/atom_sight_bottom_bar_tv_left").click();//点击景点门票
    	driver.findElementByXPath("//android.widget.TextView[@text='文化古迹']").click();//点击文化古迹
    	driver.findElementById("com.mqunar.atom.sight:id/atom_sight_bottom_bar_tv_left").click();//点击景点门票
    	driver.findElementByXPath("//android.widget.TextView[@text='农家度假']").click();//点击农家度假
    	driver.findElementById("com.mqunar.atom.sight:id/atom_sight_bottom_bar_tv_left").click();//点击景点门票
    	driver.findElementByXPath("//android.widget.TextView[@text='展馆']").click();//点击展馆
    	
    	driver.findElementById("com.mqunar.atom.sight:id/atom_sight_bottom_bar_tv_left").click();//点击景点门票
    	driver.findElementByXPath("//android.widget.TextView[@text='全部分类']").click();//点击全部分类
//    	driver.findElementById("com.mqunar.atom.sight:id/atom_sight_bottom_bar_tv_left").click();//点击景点门票
//    	driver.findElementByXPath("//android.widget.TextView[@text='一日游']").click();//点击一日游
//    	driver.findElementByXPath("//android.widget.TextView[@text='游乐场']").click();//点击游乐场
//    	driver.findElementById("com.mqunar.atom.sight:id/atom_sight_bottom_bar_tv_left").click();//点击一日游
//    	driver.findElementByXPath("//android.widget.TextView[@text='文化古迹']").click();//点击文化古迹
//    	driver.findElementById("com.mqunar.atom.sight:id/atom_sight_bottom_bar_tv_left").click();//点击一日游
//    	driver.findElementByXPath("//android.widget.TextView[@text='全部一日游']").click();//点击全部一日游
//    	driver.findElementById("com.mqunar.atom.sight:id/atom_sight_bottom_bar_tv_left").click();//点击一日游
//    	driver.findElementByXPath("//android.widget.TextView[@text='景点门票']").click();//点击景点门票
//    	driver.findElementByXPath("//android.widget.TextView[@text='全部分类']").click();//点击全部分类
    	
    	driver.findElementByXPath("//android.widget.TextView[@text='中山陵(5A)']").click();//点击中山陵(5A)
    	driver.findElementById("com.mqunar.atom.sight:id/atom_sight_detail_titlebar_tv_collect").click();//点击心形
    	driver.sendKeyEvent(AndroidKeyCode.BACK);//返回
    	driver.findElementById("com.mqunar.atom.sight:id/atom_sight_detail_titlebar_tv_share").click();//点击分享
    	driver.findElementByXPath("//android.widget.TextView[@text='去哪儿好友']").click();//点击去哪儿好友
    	driver.sendKeyEvent(AndroidKeyCode.BACK);//返回
    	driver.findElementById("com.mqunar.atom.sight:id/atom_sight_iv_img_title").click();//点击图片
    	driver.sendKeyEvent(AndroidKeyCode.BACK);//返回
    	driver.findElementById("com.mqunar.atom.sight:id/atom_sight_ll_location_layout").click();//点击地图
    	driver.sendKeyEvent(AndroidKeyCode.BACK);//返回
    	driver.findElementById("com.mqunar.atom.sight:id/atom_sight_btn_sight_desc").click();//点击景点简介
    	driver.sendKeyEvent(AndroidKeyCode.BACK);//返回
    	driver.findElementById("com.mqunar.atom.sight:id/atom_sight_cardview_ll_comment_layout").click();//点击评论
    	driver.sendKeyEvent(AndroidKeyCode.BACK);//返回
    	driver.findElementByXPath("//android.widget.TextView[@text='一日游']").click();//点击一日游
    	driver.findElementByXPath("//android.widget.TextView[@text='门票']").click();//点击门票
    	int startx1 = screen_width/2;
		int starty1 = screen_height*8/10;
		int endx1 = startx1;
		int endy1 = screen_height/10;
		driver.swipe(startx1, starty1, endx1, endy1, 1000);
		driver.swipe(startx1, starty1, endx1, endy1, 1000);
		driver.swipe(startx1, starty1, endx1, endy1, 1000);
		driver.findElementById("com.mqunar.atom.sight:id/atom_sight_tv_more").click();//点击查看全部评论
		driver.findElementByXPath("//android.widget.TextView[@text='好评(999+)']").click();//点击好评(999+)
		driver.findElementById("com.mqunar.atom.sight:id/atom_sight_btn_comment_share").click();//点击写点评
		driver.findElementById("com.mqunar.atom.sight:id/atom_sight_titlebar_back").click();//点击返回
		driver.findElementById("com.mqunar.atom.sight:id/atom_sight_detail_titlebar_tv_backpress").click();//点击返回
    	driver.findElementById("com.mqunar.atom.sight:id/atom_sight_list_iv_backpress").click();//点击返回
    	
    	driver.findElementByXPath("//android.widget.TextView[@text='名胜古迹']").click();//点击名胜古迹
    	driver.findElementById("com.mqunar.atom.sight:id/atom_sight_list_iv_backpress").click();//点击返回
    	
    	driver.findElementByXPath("//android.widget.TextView[@text='泡温泉']").click();//点击泡温泉
    	driver.findElementById("com.mqunar.atom.sight:id/atom_sight_list_iv_backpress").click();//点击返回
    	
    	driver.findElementByXPath("//android.widget.TextView[@text='亲子游']").click();//点击亲子游
    	driver.findElementById("com.mqunar.atom.sight:id/atom_sight_list_iv_backpress").click();//点击返回
    	
    	driver.findElementByXPath("//android.widget.TextView[@text='一日游']").click();//点击一日游
    	driver.findElementById("com.mqunar.atom.sight:id/atom_sight_list_iv_backpress").click();//点击返回
    	
    	driver.findElementByXPath("//android.widget.TextView[@text='自然风光']").click();//点击自然风光
    	driver.findElementById("com.mqunar.atom.sight:id/atom_sight_list_iv_backpress").click();//点击返回
    	
    	driver.findElementByXPath("//android.widget.TextView[@text='游乐场']").click();//点击游乐场
    	driver.findElementById("com.mqunar.atom.sight:id/atom_sight_list_iv_backpress").click();//点击返回
    	
    	driver.findElementByXPath("//android.widget.TextView[@text='必游榜单']").click();//点击必游榜单
    	driver.findElementById("com.mqunar.atom.sight:id/atom_sight_list_iv_backpress").click();//点击返回
    	
		int startx = screen_width*9/10;
		int starty = screen_height/2;
		int endx = screen_width/10;
		int endy = starty;
		driver.swipe(startx, starty, endx, endy, 1000);
		driver.findElementByXPath("//android.widget.TextView[@text='展馆']").click();//点击展馆
    	driver.findElementById("com.mqunar.atom.sight:id/atom_sight_list_iv_backpress").click();//点击返回
    	
    	driver.findElementByXPath("//android.widget.TextView[@text='公园']").click();//点击公园
    	driver.findElementById("com.mqunar.atom.sight:id/atom_sight_list_iv_backpress").click();//点击返回
    	
    	driver.findElementByXPath("//android.widget.TextView[@text='演出']").click();//点击演出
    	driver.findElementById("com.mqunar.atom.sight:id/atom_sight_list_iv_backpress").click();//点击返回
    	
    	driver.findElementByXPath("//android.widget.TextView[@text='农家度假']").click();//点击农家度假
    	driver.findElementById("com.mqunar.atom.sight:id/atom_sight_list_iv_backpress").click();//点击返回
    	
    	driver.findElementByXPath("//android.widget.TextView[@text='当地好玩']").click();//点击当地好玩
    	driver.findElementById("com.mqunar.atom.sight:id/atom_sight_list_iv_backpress").click();//点击返回
    	
    	driver.findElementByXPath("//android.widget.TextView[@text='生活休闲']").click();//点击生活休闲
    	driver.findElementById("com.mqunar.atom.sight:id/atom_sight_list_iv_backpress").click();//点击返回
    	
    	driver.findElementByXPath("//android.widget.TextView[@text='动植物园']").click();//点击动植物园
    	driver.findElementById("com.mqunar.atom.sight:id/atom_sight_list_iv_backpress").click();//点击返回
    	
    	driver.findElementByXPath("//android.widget.TextView[@text='全部']").click();//点击全部
    	driver.findElementById("com.mqunar.atom.sight:id/atom_sight_list_iv_backpress").click();//点击返回
    	
    	
    	
    	
    	
    	
    	
    	

	}
	
	/**
	 * AppiumDriver的初始化逻辑必须写在该函数中
	 * @return
	 */
	public AppiumDriver initAppiumTest() {
		
		AppiumDriver driver=null;
        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot, "apk");
        File app = new File(appDir, "qunaer.apk");
        
        //设置自动化相关参数
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", "");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "127.0.0.1:5555");//雷电模拟器的devices name
        
        //设置安卓系统版本
        capabilities.setCapability("platformVersion", "5.1.1");
        //设置apk路径
        capabilities.setCapability("app", app.getAbsolutePath()); 
        
        //设置app的主包名和主类名
        capabilities.setCapability("appPackage", "com.Qunar");
        capabilities.setCapability("appActivity", "com.mqunar.splash.SplashActivity");
        //设置使用unicode键盘，支持输入中文和特殊字符
        capabilities.setCapability("unicodeKeyboard","true");
        //设置用例执行完成后重置键盘
        capabilities.setCapability("resetKeyboard","true");
        //初始化
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