package name.dargiri.web.util;

import org.fusesource.scalate.servlet.ServletRenderContext$;

import javax.servlet.http.HttpServletRequest;

public class ScalateUtil {
    public static String url(String url) {
        HttpServletRequest request = ServletRenderContext$.MODULE$.request();
        return request.getServletPath() + "/" + url;
    }
}
