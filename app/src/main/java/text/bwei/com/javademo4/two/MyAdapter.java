package text.bwei.com.javademo4.two;

/**
 * 1.version:
 * 2.date:2016/11/28 11:44
 * 3.update:2016/11/28.
 * 4.autour:张玉杰
 */


import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.io.File;
import java.util.List;

import text.bwei.com.javademo4.R;


/**
 * @author WJL
 */
public class MyAdapter extends BaseAdapter {


    Context context;
    List<File> photofileList;

    public MyAdapter(Context context, List<File> photofileList) {
        this.context = context;
        this.photofileList = photofileList;
    }


    @Override
    public int getCount() {
        return photofileList.size();
    }


    @Override
    public Object getItem(int position) {
        return null;
    }


    @Override
    public long getItemId(int position) {
        return 0;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = View.inflate(context, R.layout.item, null);

        ImageView imageView = (ImageView) view.findViewById(R.id.image);

//得到每一个图片文件(File)
        File file = photofileList.get(position);

//获取文件路径
        String path = file.getPath();
//得到指定路径的位图文件(Bitmap)
        Bitmap bm = BitmapFactory.decodeFile(path);
//给imageView设置位图
        imageView.setImageBitmap(bm);

        return view;
    }


}