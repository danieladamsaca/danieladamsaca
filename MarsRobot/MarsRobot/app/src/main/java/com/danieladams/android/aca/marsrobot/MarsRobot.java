package com.danieladams.android.aca.marsrobot;

/**
 * Created by danieladams on 8/24/16.
 */
public class MarsRobot {

    String status;
    int speed;
    float temperature;
    float weight;
    int time;

void checkTime(){
    if (time < 10){
        status = "shut down";
        speed = 0;
    }
}

void checkWeight(){
    if (weight < 50){
        status = "returning to base";
        speed = 4;
    }
}

    void checkTemoerature(){
        if (temperature < -80){
            status = "returning home";
            speed = 5;

        }
    }
    void showAttributes(){
        System.out.println("Status: " + status);
        System.out.println("Speed: " + speed);
        System.out.println("Temperature: " + temperature);
        System.out.println("Weight: " + weight);
        System.out.println("Time: " + time);
}

}
