package com.example.mymessenger;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;

   EditText search;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      listView = (ListView)findViewById(R.id.lvShow);

        search = findViewById(R.id.searchView);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
       final ArrayList<Chat> messages = new ArrayList<>();

        messages.add(new Chat(R.drawable.hinh_avt01, "Doan Vũ",  "Yêu Linh"));
        messages.add(new Chat(R.drawable.hinh_avt02, "Đức Điệp", "Linh đẹp trai quá vậy :3"));
        messages.add(new Chat(R.drawable.hinh_avt03, "Duy Khánh", "oke em yêu :V"));
        messages.add(new Chat(R.drawable.hinh_avt04, "Tất Trung", "Trung sent a sticker."));
        messages.add(new Chat(R.drawable.hinh_avt05, "Cao Thế Thắng", "You sent a sticker"));
        messages.add(new Chat(R.drawable.hinh_avt06, "Vinh Hà", "ừaa"));
        messages.add(new Chat(R.drawable.hinh_avt07, "Ngọc Trinh", "Tối đưa em đi ăn nhé :3"));
        messages.add(new Chat(R.drawable.hinh_avt08, "Phương Ly", "Anh đang làm gì vậy ?"));
        messages.add(new Chat(R.drawable.hinh_avt, "Gaming House", "Khánh ngu: mình yêu các bạn"));
        messages.add(new Chat(R.drawable.hinh_avt09, "Thunder Sword", "Anh yêu emmmm <3"));
        messages.add(new Chat(R.drawable.hinh_avt10, "Sơn Trần", "oke anh ơiiiii :V"));



        ChatAdapter chatAdapter = new ChatAdapter(MainActivity.this, R.layout.messenger, messages);


        listView.setAdapter(chatAdapter);

search.addTextChangedListener(new TextWatcher() {
    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {
        ArrayList<Chat> newlist = new ArrayList<>();
        for(int i=0;i<messages.size();i++){
            if(messages.get(i).name.toLowerCase().contains(s.toString().toLowerCase())){
                newlist.add(messages.get(i));
            }
        }
        ChatAdapter chatAdapter = new ChatAdapter(MainActivity.this, R.layout.messenger, newlist);
        listView.setAdapter(chatAdapter);
    }
});


    }



}
