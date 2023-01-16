package com.jzd1997.checkholiday.domain;

public enum Weekday {
    MON("周一",1),TUES("周二",2),WEN("周三",3),THUR("周四",4),FRI("周五",5),SAT("周六",6),SUN("周日",7);
    private String name;
    private int index;
    Weekday(String name, int index) {
        this.name = name;
        this.index = index;
    }
    // 普通方法
    public static String getName(int index) {
        for (Weekday w : Weekday.values()) {
            if (w.getIndex() == index) {
                return w.name;
            }
        }
        return null;
    }
    // get set 方法
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getIndex() {
        return index;
    }
    public void setIndex(int index) {
        this.index = index;
    }
}
