package com.danieladams.android.aca.accessscopethisandstatic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fighter aFighter = new Fighter();
        Bomber aBomber = new Bomber();
        //Can't do thisAlienShip is abstract

        aBomber.shipName = "Newell Bomber";
        aFighter.shipName = "Meier Fighter";
        Log.i("aFighter Shield:", ""+ aFighter.getShieldStrength());
        Log.i("aBomber Shield:", ""+ aBomber.getShieldStrength());

// As well as certain things in certain ways
// That are unique to the subclass
        aBomber.fireWeapon();
        aFighter.fireWeapon();

// Take down those alien ships
// Focus on the bomber it has a weaker shield
        aBomber.hitDetected();
        aBomber.hitDetected();
        aBomber.hitDetected();
        aBomber.hitDetected();



        /*AlienShip girlShip = new AlienShip();
        AlienShip boyShip = new AlienShip();

        Log.i("numShips: ","" + AlienShip.getNumShips());

        girlShip.shipName = "Corrine Yu";
        boyShip.shipName = "Andre LaMothe";

        Log.i("girlShip ShieldStrngt: ","" + girlShip.getShieldStrength());
        Log.i("boyShip shieldStrngt: ", "" + boyShip.getShieldStrength());

        girlShip.hitDetected();

        Log.i("girlShip shieldStrngt: ", "" + girlShip.getShieldStrength());
        Log.i("boyShip shieldStregth: ", "" + boyShip.getShieldStrength());

        boyShip.hitDetected();
        boyShip.hitDetected();
        boyShip.hitDetected();

        Log.i("girlShip shieldStrgt: ", "" + girlShip.getShieldStrength());
        Log.i("boyShip shieldStregth: ", "" + boyShip.getShieldStrength());

        boyShip.hitDetected();

        Log.i("girlShip shieldStrgt: ", "" + girlShip.getShieldStrength());
        Log.i("boyShip shieldStregth: ", "" + boyShip.getShieldStrength());

        Log.i("numShips: ", "" + AlienShip.getNumShips());

    }*/
}}
