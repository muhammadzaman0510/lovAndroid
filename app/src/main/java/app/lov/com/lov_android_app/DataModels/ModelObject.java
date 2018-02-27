package app.lov.com.lov_android_app.DataModels;


import app.lov.com.lov_android_app.R;

/**
 * Created by macbookpro on 27/10/2017.
 */

public enum ModelObject {

    RED(R.string.empty_string, R.layout.how_it_work_a),
    BLUE(R.string.empty_string, R.layout.how_it_work_b),
    GREEN(R.string.empty_string, R.layout.how_it_work_c);

    private int mTitleResId;
    private int mLayoutResId;

    ModelObject(int titleResId, int layoutResId) {
        mTitleResId = titleResId;
        mLayoutResId = layoutResId;
    }

    public int getTitleResId() {
        return mTitleResId;
    }

    public int getLayoutResId() {
        return mLayoutResId;
    }

}