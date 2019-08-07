package com.tiny.demo.firstlinecode.ui.view;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tiny.demo.firstlinecode.R;

/**
 * @Description: RecyclerView使用ItemDecoration自定义分割线
 * @Author wangjianzhou@qding.me
 * @Date 2019-08-07 11:48
 * @Version TODO
 */
public class RecyclerViewCustomItemDecorationDividerActivity extends AppCompatActivity {
    public static void actionStart(Context context) {
        Intent starter = new Intent(context, RecyclerViewCustomItemDecorationDividerActivity.class);
        context.startActivity(starter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_custom_item_decoration_divider);
    }
}