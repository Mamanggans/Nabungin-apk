package app.uangkas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class Aboutdeveloper extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_dev);
        button  = (Button) findViewById(R.id.home1);
        button.setOnClickListener(new View.button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Inten-Aboutdeveloper.this, Aboutdeveloper_be.class);
            startActivity(intent);
        }
    });
}
}
    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder holder, int position) {
        DMNS DMNS = list.get(position);
        Glide.with(holder.itemView.getContext())
                .load(DMNS.getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPhoto);
        holder.tvName.setText(DMNS.getName());
        holder.tvDetail.setText(DMNS.getDetail());

        holder.read_more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), "read more" +
                        list.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }
