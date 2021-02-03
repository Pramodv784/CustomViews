package com.example.customlibrary;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.InputType;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.EditText;

import com.example.customlibrary.Constant;

/**
 * Created by Jitendra on 10/09/2019.
 */
@SuppressLint("AppCompatCustomView")
public class CustomEditTextValidation extends EditText {
    Context context;
    TypedArray mTypedArraty;
    LogConfig logConfig = LogConfig.getInstance();

    public CustomEditTextValidation(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.context = context;
        init(attrs);
    }

    public CustomEditTextValidation(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        init(attrs);
    }

    public CustomEditTextValidation(Context context) {
        super(context);
        this.context = context;
        init(null);
    }

    private void init(AttributeSet attr) {
        if (!isInEditMode()) {
            Typeface face = Typeface.createFromAsset(getContext().getAssets(), Constant.FONT_NORMAL);
            setTypeface(face);

            mTypedArraty = context.getTheme().obtainStyledAttributes(attr, R.styleable.CustomText, 0, 0);
            int sizeType = mTypedArraty.getInteger(R.styleable.CustomText_textSize, 0);
            switch (sizeType) {
                case 0:
                    setTextSize(TypedValue.COMPLEX_UNIT_PX, getResources().getDimension(R.dimen.text_size_15));
                    break;
                case 1:
                    setTextSize(TypedValue.COMPLEX_UNIT_PX, getResources().getDimension(R.dimen.text_size_22));
                    break;
                case 2:
                    setTextSize(TypedValue.COMPLEX_UNIT_PX, getResources().getDimension(R.dimen.text_size_20));
                    break;
                case 3:
                    setTextSize(TypedValue.COMPLEX_UNIT_PX, getResources().getDimension(R.dimen.text_size_17));
                    break;
                case 4:
                    setTextSize(TypedValue.COMPLEX_UNIT_PX, getResources().getDimension(R.dimen.text_size_15));
                    break;
                case 5:
                    setTextSize(TypedValue.COMPLEX_UNIT_PX, getResources().getDimension(R.dimen.text_size_13));
                    break;
                case 6:
                    setTextSize(TypedValue.COMPLEX_UNIT_PX, getResources().getDimension(R.dimen.text_size_12));
                    break;
                case 7:
                    setTextSize(TypedValue.COMPLEX_UNIT_PX, getResources().getDimension(R.dimen.text_size_10));
                    break;
                case 8:
                    setTextSize(TypedValue.COMPLEX_UNIT_PX, getResources().getDimension(R.dimen.text_size_8));
                    break;
                case 9:
                    setTextSize(TypedValue.COMPLEX_UNIT_PX, getResources().getDimension(R.dimen.text_size_24));
                    break;
                case 10:
                    setTextSize(TypedValue.COMPLEX_UNIT_PX, getResources().getDimension(R.dimen.text_size_28));
                    break;


            }

            int colorType = mTypedArraty.getInteger(R.styleable.CustomText_textColor, 0);
            switch (colorType) {
                case 0:
                    setTextColor(getResources().getColor(R.color.gray_transparent_40));
                    break;
                case 1:
                    setTextColor(getResources().getColor(R.color.white_color));
                    break;
                case 2:
                    setTextColor(getResources().getColor(R.color.black_color));
                    break;
                case 3:
                    setTextColor(getResources().getColor(R.color.gray_transparent_60));
                    break;
                case 4:
                    setTextColor(getResources().getColor(R.color.black_transparent_60));
                    break;
                case 5:
                    setTextColor(getResources().getColor(R.color.red_color));
                    break;
                case 6:
                    setTextColor(getResources().getColor(R.color.yellow_color));
                    break;
                case 7:
                    setTextColor(getResources().getColor(R.color.gray_transparent_60));
                    break;
                case 8:
                    setTextColor(getResources().getColor(R.color.green_color));
                    break;
                case 9:
                    setTextColor(getResources().getColor(R.color.blue_light_color));
                    break;
                case 10:
                    setTextColor(getResources().getColor(R.color.blue_dark_color));
                    break;
                case 11:
                    setTextColor(getResources().getColor(R.color.orange_color));
                    break;

            }

            int colorHintType = mTypedArraty.getInteger(R.styleable.CustomText_textColorHint, 0);
            switch (colorHintType) {
                case 0:
                    setTextColor(getResources().getColor(R.color.gray_transparent_40));
                    break;
                case 1:
                    setTextColor(getResources().getColor(R.color.white_color));
                    break;
                case 2:
                    setTextColor(getResources().getColor(R.color.black_color));
                    break;
                case 3:
                    setTextColor(getResources().getColor(R.color.gray_transparent_60));
                    break;
                case 4:
                    setTextColor(getResources().getColor(R.color.black_transparent_60));
                    break;
                case 5:
                    setTextColor(getResources().getColor(R.color.red_color));
                    break;
                case 6:
                    setTextColor(getResources().getColor(R.color.yellow_color));
                    break;
                case 7:
                    setTextColor(getResources().getColor(R.color.gray_transparent_60));
                    break;
                case 8:
                    setTextColor(getResources().getColor(R.color.green_color));
                    break;
                case 9:
                    setTextColor(getResources().getColor(R.color.blue_light_color));
                    break;
                case 10:
                    setTextColor(getResources().getColor(R.color.blue_dark_color));
                    break;
                case 11:
                    setTextColor(getResources().getColor(R.color.orange_color));
                    break;
            }

            final int inputType = mTypedArraty.getInteger(R.styleable.CustomText_inputType, 0);
            logConfig.printv("CustomText  ", "" + inputType);

            switch (inputType) {
                case 0:
                    setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PERSON_NAME | InputType.TYPE_TEXT_FLAG_CAP_SENTENCES);
                    break;
                case 1:
                    setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS);
                    break;
                case 2:
                    setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_NORMAL);
                    break;
                case 3:
                    logConfig.printv("CustomText  1", "" + inputType);
                    setInputType(InputType.TYPE_CLASS_TEXT |InputType.TYPE_TEXT_VARIATION_PASSWORD);
                    break;
                case 4:
                    setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_MULTI_LINE);
                    break;
                case 5:
                    setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PERSON_NAME);
                    break;
            }
            int errorType = mTypedArraty.getInt(R.styleable.CustomText_errorType, 0);
            if (errorType == 1) {
                addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                    }

                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {

                        switch (inputType) {
                            case 0:

                                break;
                            case 1:
                                if (!isValidEmail(s)) {
                                    setError("Invalid email address");
                                }
                                break;
                            case 2:
                                if (!isValidMobile(s.toString())) {
                                    setError("Invalid mobile number");
                                }
                                break;
                            case 3:

                                break;
                            case 4:

                                break;
                            case 5:

                                break;
                        }

                    }

                    @Override
                    public void afterTextChanged(Editable s) {

                    }
                });
            }

        }
        this.setIncludeFontPadding(false);

    }

    public String inputError() {
        String error = "";

        final int inputType = mTypedArraty.getInteger(R.styleable.CustomText_inputType, 0);
        switch (inputType) {
            case 0:
                if (isInputFieldEmpty(getText().toString())) {
                    error = "Please enter " + getHint();
                } else {
                    error = "";
                }
                break;
            case 1:
                if (isInputFieldEmpty(getText().toString())) {
                    error = "Please enter Email Address";
                } else if (isValidEmail(getText())) {
                    error = "";
                } else {
                    error = "Invalid Email Address";
                }
                break;
            case 2:
                if (isInputFieldEmpty(getText().toString())) {
                    error = "Please enter mobile number";
                } else if (isValidMobile(getText().toString())) {
                    error = "";
                } else {
                    error = "Invalid Mobile Number";
                }
                break;
            case 3:
                if (isInputFieldEmpty(getText().toString())) {
                    error = "Please enter password.";
                } else {
                    error = "";
                }

                break;
            case 4:
                if (isInputFieldEmpty(getText().toString())) {
                    error = "Please enter " + getHint();
                } else {
                    error = "";
                }
                break;
            case 5:
                if (isInputFieldEmpty(getText().toString())) {
                    error = "Please enter User Name";
                } else {
                    error = "";
                }
                break;
        }

        return error;
    }

    public final static boolean isValidEmail(CharSequence target) {
        return !TextUtils.isEmpty(target) && android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches();
    }

    private boolean isValidMobile(String phone) {
        LogConfig.getInstance().printv("mobile number ", "" + android.util.Patterns.PHONE.matcher(phone).matches());

        return android.util.Patterns.PHONE.matcher(phone).matches();
    }

    private boolean isInputFieldEmpty(String password) {
        if (password.toString().length() == 0) {
            return true;
        } else {
            return false;
        }
    }

}
