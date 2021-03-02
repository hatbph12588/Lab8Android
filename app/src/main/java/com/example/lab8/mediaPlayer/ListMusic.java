package com.example.lab8.mediaPlayer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.lab8.MainActivity;
import com.example.lab8.Music;
import com.example.lab8.R;
import com.example.lab8.model.ListMusicModle;

import java.util.ArrayList;
import java.util.List;

public class ListMusic extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Music> listMusic = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_music);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_list_music);

        listMusic.add(new Music("Hạ sơn","Trần Hà-Ph12588",R.raw.hason));

        LinearLayoutManager linearLayoutManager =
                new LinearLayoutManager(ListMusic.this);
        recyclerView.setLayoutManager(linearLayoutManager);
        ListMusicModle adapter =new ListMusicModle(this, listMusic);
        recyclerView.setAdapter(adapter);
        adapter.setOnItemClickListener(new ListMusicModle.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Intent intent = new Intent( ListMusic.this, MainActivity2.class);
                intent.putExtra("parth",listMusic.get(position).getParth());
                startActivity(intent);
            }
        });
    }
}