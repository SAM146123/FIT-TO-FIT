package com.fittofit.app;

import java.util.ArrayList;
import java.util.List;

public class FitnessMetrics {
    private int caloriesBurned = 520;
    private int calorieGoal = 600;
    private int heartRate = 74;
    private double bmi = 22.4;
    private int activeMinutes = 50;
    private double bodyFatPercentage = 18.2;
    private double muscleMassKg = 33.5;
    private int proteinGrams = 90;
    private int carbsGrams = 140;
    private double sleepHours = 7.8;
    private int stressScore = 20;
    private String menstrualCycleStatus = "Regular - Day 14 (Ovulation)";
    private List<String> friendList = new ArrayList<>();
    private static final int MAX_FRIENDS = 500;

    public boolean addFriend(String username) {
        if (friendList.size() < MAX_FRIENDS) {
            friendList.add(username);
            return true;
        }
        return false;
    }

    public int getCaloriesBurned() { return caloriesBurned; }
    public int getCalorieGoal() { return calorieGoal; }
    public int getHeartRate() { return heartRate; }
    public double getBmi() { return bmi; }
    public int getActiveMinutes() { return activeMinutes; }
    public double getBodyFatPercentage() { return bodyFatPercentage; }
    public double getMuscleMassKg() { return muscleMassKg; }
    public int getProteinGrams() { return proteinGrams; }
    public int getCarbsGrams() { return carbsGrams; }
    public double getSleepHours() { return sleepHours; }
    public int getStressScore() { return stressScore; }
    public String getMenstrualCycleStatus() { return menstrualCycleStatus; }
    public int getFriendCount() { return friendList.size(); }
}
