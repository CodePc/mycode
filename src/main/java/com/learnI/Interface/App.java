package com.learnI.Interface;

import java.util.ArrayList;
import java.util.List;

/**
 * @author prem chand shah on 16-04-2018
 * @project myJava
 */
public class App {
    WidgetActions barWidget = new BarWidget();
    WidgetActions lineWidget = new LineWidget();

    List<String> list = new ArrayList<String>();

    public static void main(String[] args) {
        WidgetActions barWidget = new BarWidget();
        barWidget.listOfWidgetInDB();

        WidgetActions lineWidget = new LineWidget();
        lineWidget.listOfWidgetInDB();
    }
}
