package com.example.quranapp_uas;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quranapp_uas.model.Audio.AudioFilesItem;
import com.example.quranapp_uas.model.SurahModel.ChaptersItem;

import java.util.List;


public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder> {
    private List<ChaptersItem> Surah;
    private List<AudioFilesItem> Audio;

    public MainAdapter(List<AudioFilesItem>Audio,List<ChaptersItem> Surah) {
        this.Surah = Surah;this.Audio=Audio;
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
         ChaptersItem chapters = Surah.get(position);
            AudioFilesItem Audioitem = Audio.get(position);


        holder.textViewSurahLatin.setText(chapters.getNameSimple());
        holder.textViewTerjemahanSurah.setText(chapters.getTranslatedName().getName());
        holder.textViewSurahArab.setText(chapters.getNameArabic());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.itemView.getContext(), DetailSurahActivity.class);
                intent.putExtra("name_simple", chapters.getNameSimple());
                intent.putExtra("id", chapters.getId());
                intent.putExtra("name_arabic", chapters.getNameArabic());
                intent.putExtra("name_complex", chapters.getNameComplex());
                intent.putExtra("revelation_order", chapters.getRevelationOrder());
                intent.putExtra("revelation_place", chapters.getRevelationPlace());
                intent.putExtra("verses_count", chapters.getVersesCount());
                intent.putExtra("audio_url", Audioitem.getAudioUrl());

                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return Surah.size();
    }

    public class MainViewHolder extends RecyclerView.ViewHolder {
        TextView textViewSurahLatin, textViewTerjemahanSurah, textViewSurahArab, NomorSurah;
        public MainViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewSurahLatin = itemView.findViewById(R.id.tvjudulsurah);
            textViewTerjemahanSurah = itemView.findViewById(R.id.tvterjemahan);
            textViewSurahArab = itemView.findViewById(R.id.tvnamaarab);
        }
    }

    public void setData(List<ChaptersItem> data, List<AudioFilesItem> listAudio){
        Surah.clear();
        Surah.addAll(data);

        Audio.clear();
        Audio.addAll(listAudio);
        notifyDataSetChanged();
    }
}