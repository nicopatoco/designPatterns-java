package com.company.patterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> features = new ArrayList<>();
        features.add("Start up");
        features.add("Perform Task");
        features.add("Shut down");
        Component components = new Component("Infrared Goggles", "Read temperature of objets");

        Robot robot = new Robot(1, features, components);
        Robot anotherRobot = robot.clone();

        System.out.println(robot.getId());
        System.out.println(robot.getComponent());
        System.out.println(robot.getFeatures() + "\n");

        System.out.println(anotherRobot.getId());
        System.out.println(anotherRobot.getComponent());
        System.out.println(anotherRobot.getFeatures());
    }
}