package com.fittofit.app;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private FitnessMetrics metrics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        metrics = new FitnessMetrics();

        // Populate metrics UI
        TextView tvMetricsDetails = findViewById(R.id.tvMetricsDetails);
        TextView tvFriendsStatus = findViewById(R.id.tvFriendsStatus);
        TextView tvMotivationMsg = findViewById(R.id.tvMotivationMsg);

        tvMotivationMsg.setText("🔥 Welcome back to FitToFit v2.0! Keep crushing your daily fitness goals!");

        String metricsSummary = "🔥 Calories Burned: " + metrics.getCaloriesBurned() + " / " + metrics.getCalorieGoal() + " kcal\n" +
                "❤️ Heart Rate: " + metrics.getHeartRate() + " bpm\n" +
                "⚖️ BMI: " + metrics.getBmi() + "\n" +
                "⏱️ Active Minutes: " + metrics.getActiveMinutes() + " mins\n" +
                "🥩 Nutrition: " + metrics.getProteinGrams() + "g Protein | " + metrics.getCarbsGrams() + "g Carbs\n" +
                "😴 Sleep: " + metrics.getSleepHours() + " hrs | Stress Score: " + metrics.getStressScore() + "/100\n" +
                "💪 Body Fat: " + metrics.getBodyFatPercentage() + "% | Muscle Mass: " + metrics.getMuscleMassKg() + " kg\n" +
                "🌸 Women's Health: " + metrics.getMenstrualCycleStatus();

        tvMetricsDetails.setText(metricsSummary);

        // Add sample friends
        for (int i = 1; i <= 5; i++) {
            metrics.addFriend("FitnessPro_" + i);
        }

        String friendsSummary = "Friends Count: " + metrics.getFriendCount() + " / 500 Max Friends\n" +
                "🏆 Leaderboard Rank: #1 among friends today!";
        tvFriendsStatus.setText(friendsSummary);

        Toast.makeText(this, "FitToFit v2.0 UI Loaded Successfully!", Toast.LENGTH_LONG).show();
    }
}
