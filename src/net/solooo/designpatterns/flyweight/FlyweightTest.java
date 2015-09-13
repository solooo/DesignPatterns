package net.solooo.designpatterns.flyweight;

/**
 * Created by Eric on 2015/9/13.
 */
public class FlyweightTest {

    public static void main(String args[]) {
        WebSiteFactory wf = new WebSiteFactory();

        WebSite ws1 = wf.getWebSite("博客");
        ws1.user("小明");

        WebSite ws2 = wf.getWebSite("新闻");
        ws2.user("小刚");

        WebSite ws3 = wf.getWebSite("博客");
        ws3.user("小红");

        WebSite ws4 = wf.getWebSite("博客");
        ws4.user("小红");

        System.out.println(ws1.getUser());
        System.out.println("WebSite对象数量：" + wf.amount());

    }
}
