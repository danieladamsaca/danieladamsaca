package com.danieladams.android.aca.eventbus;

/**
 * Created by danieladams on 10/13/16.
 */

public class LoginEvent {
    public final    String mUserName;

    public LoginEvent(String userName){
        this.mUserName = userName;

    }
}
