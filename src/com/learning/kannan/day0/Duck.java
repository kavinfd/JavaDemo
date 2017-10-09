package com.learning.kannan.day0;

/**
 * Created by kavin on 08/10/17.
 */
public class Duck {

    private final String firstName;
    private final String lastName;
    public final String fullName;
    private String flyingMessage;
    private String quackingMessage;
    private String walkingMessage;
    private Integer stepCount;

    public Duck(String firstName, String lastName, String flyingMessage, String quackingMessage, String walkingMessage) {
        //implicit pointer = this
//        this.stepCount = 0;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.flyingMessage = flyingMessage;
//        this.quackingMessage = quackingMessage;
//        this.walkingMessage = walkingMessage;
        this.fullName = firstName + " " + lastName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.flyingMessage = flyingMessage;
        this.quackingMessage = quackingMessage;
        this.walkingMessage = walkingMessage;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public String getFlyingMessage() {
        return flyingMessage;
    }

    public String getQuackingMessage() {
        return quackingMessage;
    }

    public String getWalkingMessage() {
        return walkingMessage;
    }

    public String doWalk() {
        stepCount += 1;
        return walkingMessage;
    }

    public Integer getStepCount() {
        if (stepCount >= 10) {
            stepCount += 5;
        }
        return stepCount;
    }

    public void setStepCount(Integer stepCount) {
        if (stepCount < 0) {
            stepCount = 0;
        }
        if (stepCount > 10) {
            stepCount = 10;
        }
        this.stepCount = stepCount;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", flyingMessage='" + flyingMessage + '\'' +
                ", quackingMessage='" + quackingMessage + '\'' +
                ", walkingMessage='" + walkingMessage + '\'' +
                ", stepCount=" + stepCount +
                '}';
    }
}
