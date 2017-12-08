/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package cn.com.rayli.dome;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @Bind(R.id.button)
    Button button;
    @Bind(R.id.tv)
    TextView tv;

    @Override
    public void setTheme(int resid) {
        super.setTheme(resid);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //<editor-fold desc="Description1">
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        String a = "123";
        //</editor-fold>
    }

    @OnClick({R.id.tv, R.id.button})
    public void onViewClicked(View view) {
        System.out.println("view = [" + view + "]");
        switch (view.getId()) {
            case R.id.tv:
                break;
            //<editor-fold desc="Description2">

            case R.id.button:
                break;
            //</editor-fold>
        }
    }
}
