package com.shlee.travel;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter_jeonbuk extends BaseAdapter {
    private Context mContext;

    public ImageAdapter_jeonbuk(Context c){
        mContext = c;
    }
    public int getCount(){
        return mThumbIds.length;
    }

    public Object getItem(int position){
        return null;
    }

    public long getItemId(int position){
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        ImageView imageView;
        if (convertView == null){
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(300, 300));//뷰 객체의 높이와 너비 설정
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);//이미지가 중심을 향하여 크롭
            imageView.setPadding(8, 8, 8, 8);//패딩 설정
        } else{
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mThumbIds[position]);//position에 따라 mThumbIds배열에서 이미지 선택
        return imageView;
    }


    private Integer[] mThumbIds = {//drawble리소스에 있는값들을 모아서 하나의 배열로 정의
            R.drawable.jeonbuk_1, R.drawable.jeonbuk_2,
            R.drawable.jeonbuk_3, R.drawable.jeonbuk_4,
            R.drawable.jeonbuk_5, R.drawable.jeonbuk_6,
            R.drawable.jeonbuk_7, R.drawable.jeonbuk_8,
            R.drawable.jeonbuk_9, R.drawable.jeonbuk_10
    };
}
