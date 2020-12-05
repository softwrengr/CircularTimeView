package com.softwr.sample;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

public class MyViewModel extends AndroidViewModel {

    private MutableLiveData<Integer> startHour = new MutableLiveData<>();
    private MutableLiveData<Integer> endHour = new MutableLiveData<>();

    public MyViewModel(@NonNull Application application) {
        super(application);
        startHour.setValue(2);
    }

    public MutableLiveData<Integer> getStartHour() {
        return startHour;
    }

    public MutableLiveData<Integer> getEndHour() {
        return endHour;
    }

}

