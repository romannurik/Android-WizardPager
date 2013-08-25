/*
 * Copyright 2013 str4d
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.i2p.android.wizard.model;

import java.util.ArrayList;

import net.i2p.android.wizard.ui.SingleBooleanFragment;

import android.support.v4.app.Fragment;

public class SingleFixedBooleanPage extends Page {
    protected String mDesc = "";
    protected String mLabel = null;

    public SingleFixedBooleanPage(ModelCallbacks callbacks, String title) {
        super(callbacks, title);
    }

    @Override
    public Fragment createFragment() {
        return SingleBooleanFragment.create(getKey());
    }

    @Override
    public void getReviewItems(ArrayList<ReviewItem> dest) {
        dest.add(new ReviewItem(getTitle(),
                mData.getBoolean(SIMPLE_DATA_KEY) ? "Yes" : "No", getKey()));
    }

    public SingleFixedBooleanPage setLabel(String label) {
        mLabel = label;
        return this;
    }

    public String getLabel() {
        return mLabel;
    }

    public SingleFixedBooleanPage setDescription(String desc) {
        mDesc = desc;
        return this;
    }

    public String getDesc() {
        return mDesc;
    }
}
