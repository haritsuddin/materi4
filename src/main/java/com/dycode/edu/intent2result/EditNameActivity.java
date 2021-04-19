package com.dycode.edu.intent2result;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class EditNameActivity extends AppCompatActivity {
    public static final String EXTRA_NAME = "EXTRA_NAME";
    @BindView(R.id.editText2)
    EditText editText2;
    @BindView(R.id.btn_save)
    Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_name);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_save)
    public void onViewClicked() {
        String name = editText2.getText().toString();
        Intent intent = new Intent();
        intent.putExtra(EXTRA_NAME, name);
        setResult(RESULT_OK, intent);
        finish();
    }

    @OnClick({R.id.editText2, R.id.btn_save})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.editText2:
                break;
            case R.id.btn_save:
                break;
        }
    }
}