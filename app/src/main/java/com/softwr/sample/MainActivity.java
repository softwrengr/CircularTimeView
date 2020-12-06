package com.softwr.sample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Toast;

import com.softwr.circularview.CircularSliderView;
import com.softwr.circularview.CircularTimerClock;
import com.softwr.sample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private MyViewModel viewModel;
    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        viewModel = new ViewModelProvider(this).get(MyViewModel.class);
        binding.setLifecycleOwner(this);
        binding.setViewModel(viewModel);



        binding.circularClock.setTime(0,0,9,30);

        binding.circularClock.setOnTimeChangedListener(new CircularTimerClock.ontTimeChanged() {
            @Override
            public void onStartTimeChange(String time, int hour, int minutes, boolean isAM) {
                binding.startTime.setText(time);
            }

            @Override
            public void onEndTimeChange(String time, int hour, int minutes, boolean isAM) {
                binding.endTime.setText(time);
            }
        });

        binding.startTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.circularClock.setTime(11,0,7,30);
            }
        });

    }
}