package text.bwei.com.javademo4.one;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import text.bwei.com.javademo4.R;

public class OneActivity extends AppCompatActivity {

    private List<MyBean.RsBean> list = new ArrayList();
    private TextView shuchu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        shuchu = (TextView) findViewById(R.id.shuchu);
        initData();
    }

    /**
     * 获取数据
     */
    private void initData() {
        try {
            //读取本地文件
            InputStream inputStream = getResources().getAssets().open("category.txt");

            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            StringBuffer stringBuffer = new StringBuffer();
            String str = null;
            while ((str = br.readLine()) != null) {
                stringBuffer.append(str);
            }
            str = stringBuffer.toString();
            Log.e("bean---------", str);
            Gson gson = new Gson();
            MyBean myBean = gson.fromJson(str, MyBean.class);
            shuchu.setText(str);
            list.addAll(myBean.rs);
            //默认第一个选中
            list.get(0).ischeck = true;
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
