package net.solooo.designpatterns.flyweight;

/**
 * Created by Eric on 2015/9/13.
 */
public class ConcreteWeb implements WebSite {

    private String webType = "";

    private String user = "";

    public ConcreteWeb(String webType) {
        this.webType = webType;
    }

    @Override
    public void user(String user) {
        System.out.println("创建网站: " + webType + ", 用户："+ user);
        this.user = user;
    }

    @Override
    public String getUser() {
        return user;
    }
}
