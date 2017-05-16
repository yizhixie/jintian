package home.wenfeng.jsoup;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class JsoupTest {
	public Document jsoup_get1(String url){
		Document doc=null;
		try {
			doc=Jsoup.connect(url).get();
			return doc;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
	public Document jsoup_get2(String url,String paramter){
		Document doc=null;
		try {
			Connection conn=Jsoup.connect(url);
			conn.data("wd",paramter);
			doc=conn.get();
			return doc;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}
	public Document jsoup_post1(String url,String paramter){
		Document doc=null;
		try {
			Connection conn=Jsoup.connect(url);
			conn.data("username","787044500@qq.com");
			conn.data("password",paramter);
			doc=conn.post();
			return doc;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	/**
	 * @author LiWenfeng
	 * @param args
	 */
	public static void main(String[] args) {
		JsoupTest my=new JsoupTest();
//		System.out.println(my.jsoup_get1("https://www.baidu.com"));
//		System.out.println(my.jsoup_get2("http://www.baidu.com/s", "loadrunner"));
//		System.out.println(my.jsoup_post1("http://www.baidu.com", "fengg20138456"));
		Document doc=my.jsoup_get2("http://www.baidu.com/s", "loadrunner");
		if(doc.toString().contains("loadrunner")){
			System.out.println("pass");
		}
		else{
			System.out.println("fail");
		}
		
	}

}
