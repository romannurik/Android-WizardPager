package com.example.android.wizardpager.wizard.model;


import android.support.v4.app.Fragment;
import android.text.TextUtils;

import com.example.android.wizardpager.wizard.ui.DateFragment;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;

public class DatePage extends Page {

    public static final String DATE_DATA_KEY = "date";
    public static SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy", Locale.US);

    public DatePage(ModelCallbacks callbacks, String title) {
        super(callbacks, title);
    }

    @Override
    public Fragment createFragment() {
        return DateFragment.create(getKey());
    }

    @Override
    public void getReviewItems(ArrayList<ReviewItem> dest) {
        dest.add(new ReviewItem(getTitle(), mData.getString(DATE_DATA_KEY), getKey()));
    }

    @Override
    public boolean isCompleted() {
        return !TextUtils.isEmpty(mData.getString(DATE_DATA_KEY));
    }
}