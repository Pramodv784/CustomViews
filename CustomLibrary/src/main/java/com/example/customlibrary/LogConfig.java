package com.example.customlibrary;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;

/**
 * Created by Jitendra on 26/11/2020.
 */
public class LogConfig {

    private static LogConfig instance;

    private LogConfig() {

    }

    public static LogConfig getInstance() {
        if (instance == null) {
            instance = new LogConfig();
        }
        return instance;
    }
    public void printP(String title, String msg){
        System.out.println(title+": "+msg);
    }

    public void printd(String title, String value) {
        Log.d(title, value);
    }

    public void printe(String title, String value) {
        Log.e(title, value);
    }

    public void printv(String title, String value) {
        Log.v(title, value);
    }

    public void printToast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    public void hideKeyBoard(Activity activity) {

        try {
            // Check if no view has focus:
            View view = activity.getCurrentFocus();
            if (view != null) {
                InputMethodManager imm = (InputMethodManager)
                        activity.getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isValidEmail(CharSequence target) {
        return !TextUtils.isEmpty(target) && android.util.Patterns
                .EMAIL_ADDRESS.matcher(target).matches();
    }

    public boolean isValidMobile(String phone) {
        return android.util.Patterns.PHONE.matcher(phone).matches();
    }
}
