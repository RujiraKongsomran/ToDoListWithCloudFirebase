package com.rujirakongsomran.todolistwithcloudfirebase.Adapter;

import android.view.ContextMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rujirakongsomran.todolistwithcloudfirebase.MainActivity;
import com.rujirakongsomran.todolistwithcloudfirebase.R;

class ListItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnCreateContextMenuListener {

    ItemClickListener itemClickListener;
    TextView tvTitle;
    TextView tvDescription;

    public ListItemViewHolder(@NonNull View itemView) {
        super(itemView);

        itemView.setOnClickListener(this);
        itemView.setOnCreateContextMenuListener(this);

        tvTitle = (TextView) itemView.findViewById(R.id.tvTitle);
        tvDescription = (TextView) itemView.findViewById(R.id.tvDescription);
    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    @Override
    public void onClick(View view) {
        itemClickListener.OnClick(view, getAdapterPosition(), false);
    }


    @Override
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.setHeaderTitle("Select the action");
        contextMenu.add(0, 0, getAdapterPosition(), "DELETE");
    }
}

public class ListItemAdapter extends RecyclerView.Adapter<ListItemViewHolder> {
    MainActivity mainActivity;
    List<ToDo> todoList;

    @NonNull
    @Override
    public ListItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ListItemViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
