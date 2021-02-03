package com.example.customlibrary;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.EditText;

import com.example.customlibrary.Constant;
/**
 * Created by Jitendra on 10/09/2019.
 */
@SuppressLint("AppCompatCustomView")
public class CustomEditTextNormal extends EditText {

    Context context;

    public CustomEditTextNormal(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.context = context;
        init(attrs);
    }

    public CustomEditTextNormal(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        init(attrs);
    }

    public CustomEditTextNormal(Context context) {
        super(context);
        this.context = context;
        init(null);
    }

    private void init(AttributeSet attr) {

            Typeface face = Typeface.createFromAsset(getContext().getAssets(),  Constant.FONT_NORMAL);
            setTypeface(face);

            TypedArray a = context.getTheme().obtainStyledAttributes(attr, R.styleable.CustomText, 0, 0);
            int sizeType = a.getInteger(R.styleable.CustomText_textSize, 0);
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

            int colorType = a.getInteger(R.styleable.CustomText_textColor, 0);
            switch (colorType) {
                case 0:
                    setTextColor(getResources().getColor(R.color.black_color));
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
                    setTextColor(getResources().getColor(R.color.gray_transparent_40));
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

        int colorHintType = a.getInteger(R.styleable.CustomText_textColorHint, 0);
        switch (colorHintType) {
            case 0:
                setTextColor(getResources().getColor(R.color.black_color));
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
                setTextColor(getResources().getColor(R.color.gray_transparent_40));
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
        /*}*/
        this.setIncludeFontPadding(false);
    }

}
