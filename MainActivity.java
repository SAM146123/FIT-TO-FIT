package com.fittofit.app;

import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private FitnessMetrics metrics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        metrics = new FitnessMetrics();

        // Welcome & Re-Opening Motivation Toast
        Toast.makeText(this, "Welcome Back! Keep pushing your limits today! 🚀", Toast.LENGTH_LONG).show();

        // Check Daily Task Completion
        checkTaskCompletion();
    }

    private void checkTaskCompletion() {
        if (metrics.getCaloriesBurned() >= metrics.getCalorieGoal()) {
            triggerCelebrationAnimation();
        }
    }

    private void triggerCelebrationAnimation() {
        // Triggers Lottie celebration & Congratulation UI
        Toast.makeText(this, "🎉 Congratulations! You completed today's daily task!", Toast.LENGTH_LONG).show();
    }
}
