package app.lov.com.lov_android_app.Adapters;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import app.lov.com.lov_android_app.DataModels.ModelObject;


/**
 * Created by macbookpro on 27/10/2017.
 */

public class CustomPagerAdapter extends PagerAdapter {

    private Context mContext;

    public CustomPagerAdapter(Context context) {
        mContext = context;
    }

    @Override
    public Object instantiateItem(ViewGroup collection, final int position) {
        ModelObject modelObject = ModelObject.values()[position];
        LayoutInflater inflater = LayoutInflater.from(mContext);
        ViewGroup layout = (ViewGroup) inflater.inflate(modelObject.getLayoutResId(), collection, false);
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iPagerItemListner.onPagerItemListner(position);
            }
        });

        ((ViewPager) collection).addView(layout,0);
        return layout;
    }

    onPagerItemClickListner iPagerItemListner;

    public void setOnPagerItemClickListner(onPagerItemClickListner cl){
        this.iPagerItemListner = cl;
    }

    public interface onPagerItemClickListner{
        void onPagerItemListner(int position);
    }

    @Override
    public void destroyItem(ViewGroup collection, int position, Object view) {
        collection.removeView((View) view);
    }

    @Override
    public int getCount() {
        return ModelObject.values().length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        ModelObject customPagerEnum = ModelObject.values()[position];
        return "        ";//mContext.getString(customPagerEnum.getTitleResId());
    }

}