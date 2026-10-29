package com.fittofit.app;

import java.util.ArrayList;
import java.util.List;

public class FitnessMetrics {
    // 1. Health & Tracking Data
    private int caloriesBurned;
    private int calorieGoal;
    private int heartRate; // bpm
    private double bmi;
    private int activeMinutes;
    private int stepCount;
    private double waterIntakeLiters;
    
    // 2. Body Composition
    private double bodyFatPercentage;
    private double muscleMassKg;
    
    // 3. Nutrition (Grams)
    private int proteinGrams;
    private int carbsGrams;
    private int fatGrams;
    
    // 4. Respiratory & Stress
    private int respiratoryRate; // breaths/min
    private double sleepHours;
    private int stressScore; // 1-100
    
    // 5. Women's Health
    private String menstrualCycleStatus;
    private int cycleDay;
    
    // 6. Social & Competition
    private List<String> friendList;
    private static final int MAX_FRIENDS = 500;

    public FitnessMetrics() {
        this.caloriesBurned = 450;
        this.calorieGoal = 600;
        this.heartRate = 72;
        this.bmi = 22.4;
        this.activeMinutes = 45;
        this.stepCount = 6500;
        this.waterIntakeLiters = 2.5;
        this.bodyFatPercentage = 18.5;
        this.muscleMassKg = 32.0;
        this.proteinGrams = 80;
        this.carbsGrams = 150;
        this.fatGrams = 40;
        this.respiratoryRate = 16;
        this.sleepHours = 7.5;
        this.stressScore = 25;
        this.menstrualCycleStatus = "Regular - Day 14 (Ovulation Phase)";
        this.cycleDay = 14;
        this.friendList = new ArrayList<>();
    }

    public boolean addFriend(String friendUsername) {
        if (friendList.size() < MAX_FRIENDS) {
            friendList.add(friendUsername);
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
    public double getSleepHours() { return sleepHours; }
    public int getStressScore() { return stressScore; }
    public String getMenstrualCycleStatus() { return menstrualCycleStatus; }
    public int getFriendCount() { return friendList.size(); }
}
