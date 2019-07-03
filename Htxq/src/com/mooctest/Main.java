package com.mooctest;

import io.appium.java_client.AppiumDriver;

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
	 * "appPackage", "com.floral.life"
	 * "appActivity", "com.floral.life.StartActivity"
	 */
	
	/**
	 * 所有和AppiumDriver相关的操作都必须写在该函数中
	 * @param driver
	 */
	public void test(AppiumDriver driver) {

		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
    	driver.findElementByXPath("//android.widget.Button[@text='好']").click();
		int screen_width = driver.manage().window().getSize().width;//screen width
		int screen_height = driver.manage().window().getSize().height; //screen height
		int startx = screen_width*9/10;
		int starty = screen_height/2;
		int endx = screen_width/10;
		int endy = starty;
		int startx1 = screen_width/2;
		int starty1 = screen_height*5/10;
		int endx1 = startx1;
		int endy1 = screen_height/10;
		int startx2 = screen_width/2;
		int starty2 = screen_height/10;
		int endx2 = startx1;
		int endy2 = screen_height*5/10;

		driver.swipe(startx, starty, endx, endy, 1000);
		driver.swipe(startx, starty, endx, endy, 1000);
		driver.swipe(startx, starty, endx, endy, 1000);
		driver.findElementById("com.floral.life:id/btn_start").click();
		driver.findElementByXPath("//android.widget.Button[@text='切换']").click();
		driver.findElementById("com.floral.life:id/rb_bottom_shop").click();
		driver.findElementByXPath("//android.widget.TextView[@text='更多']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='鲜切花 ']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='鹤望兰／1支']").click();
	    driver.findElementById("com.floral.life:id/right_img").click();
	    driver.findElementById("com.floral.life:id/imgbtn_share_weixin").click();
	    driver.findElementById("com.floral.life:id/right_img").click();
	    driver.findElementById("com.floral.life:id/imgbtn_share_weibo").click();
	    driver.findElementById("com.floral.life:id/right_img").click();
	    driver.findElementById("com.floral.life:id/imgbtn_share_qq").click();
	    driver.findElementById("com.floral.life:id/right_img").click();
	    driver.findElementById("com.floral.life:id/imgbtn_share_friends").click();
	    driver.findElementById("com.floral.life:id/imgv").click();
	    driver.findElementById("com.floral.life:id/iv_back").click();
	    driver.findElementById("com.floral.life:id/tv_goods_money").click();
	    driver.findElementById("com.floral.life:id/iv_back").click();
	    driver.findElementById("com.floral.life:id/tv_addCar_button").click();
	    driver.findElementById("com.floral.life:id/iv_back").click();
	    driver.findElementById("com.floral.life:id/tv_gm_button").click();
	    driver.findElementById("com.floral.life:id/bt_login").click();
	    driver.findElementById("com.floral.life:id/ll_guojiama").click();
	    driver.findElementById("com.floral.life:id/img_back").click();
	    driver.findElementById("com.floral.life:id/qita").click();
	    driver.findElementById("com.floral.life:id/iv_back").click();
	    driver.findElementById("com.floral.life:id/et_phone").sendKeys("18962905290");;
	    driver.findElementById("com.floral.life:id/btn_login_confirm").click();
	    driver.findElementById("com.floral.life:id/iv_back").click();
	    driver.findElementById("com.floral.life:id/iv_close").click();
	    driver.findElementById("com.floral.life:id/bt_register").click();
	    driver.findElementById("com.floral.life:id/tv_register_agreement").click();
	    driver.findElementById("com.floral.life:id/img_back").click();
	    driver.findElementById("com.floral.life:id/iv_close").click();
	    driver.findElementById("com.floral.life:id/iv_back").click();
	    driver.findElementById("com.floral.life:id/img_back").click();
	    driver.findElementByXPath("//android.widget.TextView[@text='红色针垫花（南非）／1支']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='大刺芹（荷兰）／5支']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='粉色帝王花（南非）／1支']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.swipe(startx1, starty1, endx1, endy1, 1000);
		driver.findElementByXPath("//android.widget.TextView[@text='黄色针垫花（荷兰）／1支']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.swipe(startx2, starty2, endx2, endy2, 1000);
		driver.findElementByXPath("//android.widget.TextView[@text='公主花（南非）／1支']").click();
		driver.findElementById("com.floral.life:id/img_back").click();

		driver.findElementByXPath("//android.widget.TextView[@text='草花']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='石竹球／5支']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='小刺芹']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		
		driver.findElementByXPath("//android.widget.TextView[@text='果实类']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='小尤加利果／束']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		
		driver.findElementByXPath("//android.widget.TextView[@text='百合']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='木百合（南非）／5支']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='玫瑰']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='郁金香']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='兰花']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='石竹']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='菊']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='梅']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='绣球花']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='海芋']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		
		driver.findElementByXPath("//android.widget.TextView[@text='干花']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='粉红水晶草 / 1束']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='紫色勿忘我／1束']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='白色勿忘我／1束']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='黄金球／5支']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='绿植 ']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='富贵竹／10支']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='罗汉竹／5支']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='转运竹／10支']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='花器 ']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='造作|双生陶瓷花瓶']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='地中海玻璃花瓶深海蓝方形']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='简约线条磨刻玻璃花瓶']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='北欧简约玻璃花瓶']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='美式玻璃花瓶圆柱花瓶']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='“柠檬绿意”（V领）']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		
		driver.findElementByXPath("//android.widget.TextView[@text='玻璃花器']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='地中海玻璃花瓶深海蓝方形']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='简约线条磨刻玻璃花瓶']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='北欧简约玻璃花瓶']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='美式玻璃花瓶圆柱花瓶']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='“柠檬绿意”（V领）']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='“收口型”花瓶']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		
		driver.findElementByXPath("//android.widget.TextView[@text='陶瓷花器']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='「青涩年代」陶瓷花瓶']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='冰颜花瓶']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='水色冰清花瓶']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='叙白古风花瓶']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='“时光浅影”花瓶']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='海风贝花瓶（白色）']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='其他材质花器']").click();
		
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='好物']").click();
		driver.findElementByXPath("//android.widget.TextView[@text=' 小王子 OTR便携蓝牙音箱/收音机']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='气味图书馆 自然系列3ml*9支套盒']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='造作|日夜台']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='收藏原创[限量版]多肉明信片']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='造作|甜筒餐具组']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='气味图书馆 爱系列3ml*9支套盒']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		
		driver.findElementByXPath("//android.widget.TextView[@text='周边 ']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='气味图书馆 自然系列3ml*9支套盒']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='造作|日夜台']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='收藏原创[限量版]多肉明信片']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='造作|甜筒餐具组']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='气味图书馆 爱系列3ml*9支套盒']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='气味图书馆自然系列-雨后']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		
		driver.findElementByXPath("//android.widget.TextView[@text='精选']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='造作|茶花套碗']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='「Forever love」印花伞 - 三折']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='「Forever love」印花伞 - 直杆']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		
		driver.findElementByXPath("//android.widget.TextView[@text='纸品 ']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='“萌萌哒”多肉明信片']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='工具 ']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='高效工具剪（进口）']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='除刺钳']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='多功能剪刀（进口）']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='瑞士专用插花刀']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='古老的花艺剪']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='荷兰可利鲜-保鲜剂']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		
		driver.findElementByXPath("//android.widget.TextView[@text='辅助工具 ']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='高效工具剪（进口）']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='除刺钳']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='多功能剪刀（进口）']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='瑞士专用插花刀']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='古老的花艺剪']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		
		driver.findElementByXPath("//android.widget.TextView[@text='消耗品 ']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='荷兰可利鲜-保鲜剂']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='鲜切花- 锁水剂']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='环形花泥']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='书籍 ']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='KINFOLK 夏季刊关系特辑']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='日日有好花']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='时间之书']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='日日是好日']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='园艺是最好的亲子游戏']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='四季餐桌']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		
		driver.findElementByXPath("//android.widget.TextView[@text='家居艺术 ']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='KINFOLK 夏季刊关系特辑']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='日日有好花']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='时间之书']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='日日是好日']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='园艺是最好的亲子游戏']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='四季餐桌']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		
		driver.findElementByXPath("//android.widget.TextView[@text='花植生活 ']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='手作铁丝小花园']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='花朵的秘密生命']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='美好的花器花礼']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='花语词典：赏花、插花、花礼']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementByXPath("//android.widget.TextView[@text='多肉王国：从零开始学种植']").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		driver.findElementById("com.floral.life:id/img_back").click();
		
	}
	
	/**
	 * AppiumDriver的初始化逻辑必须写在该函数中
	 * @return
	 */
	public AppiumDriver initAppiumTest() {
		AppiumDriver driver=null;
        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot, "apk");
        File app = new File(appDir, "htxq.apk");
        
        //设置自动化相关参数
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", "");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "127.0.0.1:62001");
        
        //设置安卓系统版本
        capabilities.setCapability("platformVersion", "4.4.2");
        //设置apk路径
        capabilities.setCapability("app", app.getAbsolutePath()); 
        
        //设置app的主包名和主类名
        capabilities.setCapability("appPackage", "com.floral.life");
        capabilities.setCapability("appActivity", ".StartActivity");
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