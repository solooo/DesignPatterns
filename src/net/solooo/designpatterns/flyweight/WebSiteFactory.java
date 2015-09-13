package net.solooo.designpatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Eric on 2015/9/13.
 */
public class WebSiteFactory {

    private Map<String, WebSite> map = new HashMap<>();

    public WebSite getWebSite(String webType) {
        if(!map.containsKey(webType)) {
            WebSite ws = new ConcreteWeb(webType);
            map.put(webType, ws);
            return ws;
        } else {
            return map.get(webType);
        }
    }

    public int amount() {
        return map.size();
    }
}
