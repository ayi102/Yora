package com.alioops.activities;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.alioops.yora.R;

public class LoginActivity extends BaseActivity
{
    @Override
    protected void onCreate(Bundle savedState)
    {
        super.onCreate(savedState);

        setContentView(R.layout.activity_login);

    }

    public void doLogin(View view)
    {
        application.getAuth().getUser().setIsLoggedIn(true);
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}
