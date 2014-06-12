package name.dargiri.web.controller;

import org.springframework.web.servlet.ModelAndView;

public class LayoutModelAndView extends ModelAndView {
    public LayoutModelAndView() {
        this(null);
    }

    public LayoutModelAndView(String viewName) {
        super(viewName != null ? layout(viewName): null);
    }

    private static String layout(String string) {
        return "layout:" + string;
    }

    @Override
    public void setViewName(String viewName) {
        super.setViewName(layout(viewName));
    }
}
