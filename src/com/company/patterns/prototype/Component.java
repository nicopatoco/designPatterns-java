package com.company.patterns.prototype;

public class Component {

    private String name;
    private String functionality;

    public Component(String name, String functionality) {
        this.name = name;
        this.functionality = functionality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFunctionality() {
        return functionality;
    }

    public void setFunctionality(String functionality) {
        this.functionality = functionality;
    }
}
