package text.bwei.com.javademo4.two;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;

import text.bwei.com.javademo4.R;

public class TwoActivity extends AppCompatActivity {
    List<File> photofileList = new ArrayList<File>();
    private File directory;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        listView = (ListView) findViewById(R.id.listview);


// 得到sd卡根目录
        directory = Environment.getExternalStorageDirectory();
        search(listView);
    }

    // 扫描图片按钮
    public void search(View v) {


        searchPicture(directory);

        listView.setAdapter(new MyAdapter(this, photofileList));

    }


    /**
     * 扫描图片的方法
     */
    private void searchPicture(File filePath) {
// 得到sd卡根目录第一级文件和文件夹
        File[] listFiles = filePath.listFiles(new FileFilter() {


            @Override
            public boolean accept(File pathname) {
// System.out.println(pathname);
// pathname.isDirectory();


// 判断文件是否符合指定的文件类型
// boolean suffix =pathname.getPath().endsWith(".jpg");
// 是文件,是.jpg.jpeg.png.gif都符合要求
                if (pathname.isDirectory()
                        || pathname.getPath().endsWith(".jpg")
                        || pathname.getPath().endsWith(".jpeg")
                        || pathname.getPath().endsWith(".png")
                        || pathname.getPath().endsWith(".gif")) {
// 返回true,代表符合过滤条件,就添加listFiles数组里
                    return true;
                }
                return false;
            }
        });

        if (listFiles != null) {
// 遍历listFiles数组
            for (File fileName : listFiles) {
// 如果是文件夹,继续查找
                if (fileName.isDirectory()) {
                    searchPicture(fileName);
// 如果不是文件夹,也就是是是.jpg.jpeg.png.gif类型,就添加到集合里
                } else {
                    photofileList.add(fileName);
                }
            }
        }
    }
}
