package Adapters;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.myaplication.R;

import java.util.List;

import Models.Test;

public class TestAdapter extends RecyclerView.Adapter<TestAdapter.ViewHolder> {

    private List<Test> mData;

    public TestAdapter(List<Test> data) {
        mData = data;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_test_adapter, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Test test = mData.get(position);
        holder.textView.setText(test.name);
        holder.surname.setText(test.surname);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        TextView surname;

        public ViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView);
            surname = itemView.findViewById(R.id.textViewSurname);
        }
    }
}
