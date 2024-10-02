package com.example.prac5.adapter;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.prac5.CardItem;
import com.example.prac5.R;
import com.example.prac5.detail;

import java.util.List;
public class CardAdapter extends RecyclerView.Adapter<CardAdapter.CardViewHolder> {
    private List<CardItem> cardItemList;
    private Context context;

    public CardAdapter(List<CardItem> cardItemList, Context context) {
        this.cardItemList = cardItemList;
        this.context = context;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_item_card, parent, false);
        return new CardViewHolder(view);
    }

    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        CardItem cardItem = cardItemList.get(position);
        holder.title.setText(cardItem.getTitle());
        holder.textView1.setText(cardItem.getElement1());
        holder.textView2.setText(cardItem.getElement2());
        holder.textView3.setText(cardItem.getElement3());
        holder.textView4.setText(cardItem.getElement4());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int clickedPosition = holder.getAdapterPosition();
                CardItem clickedCardItem = cardItemList.get(clickedPosition);
                Intent intent = new Intent(context, detail.class);
                intent.putExtra("position", clickedPosition);
                intent.putExtra("title", clickedCardItem.getTitle());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return cardItemList.size();
    }

    class CardViewHolder extends RecyclerView.ViewHolder {
        TextView title, textView1, textView2, textView3, textView4;

        CardViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.textViewTitle);
            textView1 = itemView.findViewById(R.id.textView1);
            textView2 = itemView.findViewById(R.id.textView2);
            textView3 = itemView.findViewById(R.id.textView3);
            textView4 = itemView.findViewById(R.id.textView4);
        }
    }
}
