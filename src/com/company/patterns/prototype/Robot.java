package com.company.patterns.prototype;

import java.util.List;

public class Robot implements Cloneable {

    private int id;
    private List<String> features;
    private Component component;

    public Robot(int id, List<String> features, Component component) {
        setId(id);
        setFeatures(features);
        setComponent(component);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getFeatures() {
        return features;
    }

    public void setFeatures(List<String> features) {
        this.features = features;
    }

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }

    public Robot clone() {
        try {
            return (Robot) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
