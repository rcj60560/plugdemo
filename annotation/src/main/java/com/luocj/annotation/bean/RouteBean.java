package com.luocj.annotation.bean;

import javax.lang.model.element.Element;

public class RouteBean {
    public enum TypeEnum {
        ACTIVITY
    }

    public RouteBean() {
    }

    public RouteBean(TypeEnum typeEnum, Element element, Class<?> myClass, String path, String group) {
        this.typeEnum = typeEnum;
        this.element = element;
        this.myClass = myClass;
        this.path = path;
        this.group = group;
    }

    public RouteBean(TypeEnum typeEnum, Class<?> myClass, String path, String group) {
        this.typeEnum = typeEnum;
        this.myClass = myClass;
        this.path = path;
        this.group = group;
    }

    public static RouteBean create(TypeEnum typeEnum, Class<?> clazz, String path, String group){
        return new RouteBean(typeEnum,clazz,path,group);
    }

    private TypeEnum typeEnum;

    private Element element;

    private Class<?> myClass;

    private String path;

    private String group;

    public TypeEnum getTypeEnum() {
        return typeEnum;
    }

    public void setTypeEnum(TypeEnum typeEnum) {
        this.typeEnum = typeEnum;
    }

    public Element getElement() {
        return element;
    }

    public void setElement(Element element) {
        this.element = element;
    }

    public Class<?> getMyClass() {
        return myClass;
    }

    public void setMyClass(Class<?> myClass) {
        this.myClass = myClass;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "RouteBean{" +
                "typeEnum=" + typeEnum +
                ", element=" + element +
                ", myClass=" + myClass +
                ", path='" + path + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}
