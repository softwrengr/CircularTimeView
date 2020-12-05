# <b>CircularTimeView</b>

CircularTimeView is an android version library for showing time in clock view. you can set and choose time from clock view. you can also customiz the clock view as per your requirements.


# <b>How to use</b>
<b>Add root build.gradle</b>

repositories {

     maven {
     
         url "https://jitpack.io"
         
     }
     
}

<b>Add build.gradle</b>

     
           implementation 'com.github.softwrengr:CircularTimeView:1.0.0'
          
          
          
<b>To use it in your code</b>

Simply add the View to your layout xml
     
      <com.softwr.circularview.CircularTimerClock
            android:id="@+id/circular_clock"
            android:layout_width="match_parent"
            android:layout_height="400dp"
            android:layout_gravity="center"
            timer:arc_dash_size="32dp"
            timer:start_hour="0"
            android:padding="10dp"
            timer:start_minutes="0"
            timer:end_hour="0"
            timer:end_minutes="30"
            timer:clock_time_interval="5"
            timer:clock_tick_interval="15"
            timer:clock_hour_color="#000"
            timer:clock_tick_color="#000"
            timer:hours_size="18sp"
            timer:start_time_is_am="false"
            timer:end_time_is_am="false"
            timer:is_clock_inside="true"
            timer:border_thickness="35dp"
            timer:border_color="@color/gray"
            timer:arc_gradient_color_start="@color/blue"
            timer:arc_gradient_color_end="@color/blue"
            timer:start_thumb_image="@drawable/small_moon"
            timer:end_thumb_image="@drawable/small_sun"
            timer:thumb_size="45dp" >
            
            
            
            
            
            
        Below line are the code to Set Time programmatically. 
        SetStartHour(0,0,0,0) accept 4 parameter startHour, startMinutes, endHour and endMinutes.
        you can adjust as per your requirements also.

            
        binding.circularClock.setStartHour(11,10,6,30);  

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
            
     
