package com.example.quranapp_uas;//package com.example.uas_audio_muhammadarifaditya;
//import android.content.Intent;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.example.uas_audio_muhammadarifaditya.model.SurahModel.ChaptersItem;
//
//import java.util.ArrayList;
//
//public class AdapterSurah extends RecyclerView.Adapter<AdapterSurah.SurahViewHolder> {
//
//    ArrayList<ChaptersItem> arrayListSurah;
//
//    public AdapterSurah (ArrayList<ChaptersItem>arrayListSurah){
//        this.arrayListSurah = arrayListSurah;
//    }
//
//    @NonNull
//    @Override
//    public AdapterSurah.SurahViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
//
//        return new SurahViewHolder(view);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull AdapterSurah.SurahViewHolder holder, int position) {
//
//        final ChaptersItem surah = arrayListSurah.get(position);
//
//        holder.textViewSurahLatin.setText(surah.getNameSimple());
//        holder.textViewTerjemahanSurah.setText(surah.getTranslatedName().getName());
//        holder.textViewSurahArab.setText(surah.getNameArabic());
//
//        holder.itemView.setOnClickListener(new View.OnClickListener(){
//
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(holder.itemView.getContext(), DetailSurahActivity.class);
////                intent.putExtra("ChaptersItem", surah);
//                intent.putExtra("ChapterItem", (CharSequence) surah);
//                holder.itemView.getContext().startActivity(intent);
//            }
//        });
//
//
//    }
//
//    @Override
//    public int getItemCount() {
//        return arrayListSurah.size();
//    }
//
//    public class SurahViewHolder extends RecyclerView.ViewHolder {
//        TextView textViewSurahLatin, textViewTerjemahanSurah, textViewSurahArab;
//        public SurahViewHolder(@NonNull View itemView) {
//            super(itemView);
//            textViewSurahLatin = itemView.findViewById(R.id.tvsurahlatin);
//            textViewTerjemahanSurah = itemView.findViewById(R.id.tvterjemahansurah);
//            textViewSurahArab = itemView.findViewById(R.id.tvsuraharab);
//        }
//    }
//}