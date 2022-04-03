package com.amalia.detailnamatempat;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.amalia.uasamalia.R;

public class adapter extends RecyclerView.Adapter<adapter.viewholder> {

    String data1[], data2[];
    int image[];
    Context context;

    public adapter(Context ct, String s1[], String s2[], int img[]){
        context = ct;
        data1 = s1;
        data2 = s2;
        image = img;
    }

    @NonNull
    @Override
    public adapter.viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.rv_row, parent, false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull adapter.viewholder holder, int position) {
        holder.text1.setText(data1[position]);
        holder.text2.setText(data2[position]);
        holder.images.setImageResource(image[position]);

        holder.cons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, detail.class);
                intent.putExtra("data1", data1[position]);
                intent.putExtra("data2", data2[position]);
                intent.putExtra("image", image[position]);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return image.length;
    }

    public class viewholder extends RecyclerView.ViewHolder{

        TextView text1, text2;
        ImageView images;
        ConstraintLayout cons;

        public viewholder(@NonNull View itemView) {
            super(itemView);
            text1 = itemView.findViewById(R.id.judul);
            text2 = itemView.findViewById(R.id.penjelasan);
            images = itemView.findViewById(R.id.gambar);
            cons = itemView.findViewById(R.id.mainLayout);
        }
    }
}
