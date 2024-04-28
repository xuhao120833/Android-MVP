package com.example.mvp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MVP_Activity extends AppCompatActivity implements IView {

    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_mvp);

        tvResult = findViewById(R.id.tv_result);

        TextView tvAccount = findViewById(R.id.tv_account);
        TextView tvPwd = findViewById(R.id.tv_pwd);
        Button btnLogin = findViewById(R.id.btn_login);

        MVP_Presenter presenter = new MVP_Presenter();
        presenter.setiView(this);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.login(tvAccount.getText().toString(), tvPwd.getText().toString());
            }
        });
    }

    public void loginSuccess() {
        tvResult.setText("登录结果：登录成功");
    }

    public void loginFail() {
        tvResult.setText("登录结果：登录失败");
    }
}
