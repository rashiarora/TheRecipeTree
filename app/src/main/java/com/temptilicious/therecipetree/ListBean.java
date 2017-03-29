package com.temptilicious.therecipetree;

/**
 * Created by Admin on 19-07-2015.
 */
public class ListBean {
    int icon, mark;
    String CuisineName;

    public ListBean() {
    }

    public ListBean(int icon, int mark, String cuisineName) {
        this.icon = icon;
        this.mark = mark;
        CuisineName = cuisineName;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getCuisineName() {
        return CuisineName;
    }

    public void setCuisineName(String cuisineName) {
        CuisineName = cuisineName;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
}
