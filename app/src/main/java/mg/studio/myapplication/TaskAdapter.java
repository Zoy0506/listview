package mg.studio.myapplication;


import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import static android.content.Context.MODE_PRIVATE;

public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.ViewHolder> {

    private List<String> mTaskList;



    static class ViewHolder extends RecyclerView.ViewHolder{
        View taskView;
        TextView taskName;

        public ViewHolder(View view){
            super(view);
            taskView = view;
            taskName = (TextView) view.findViewById(R.id.app_name);
        }
    }

    public TaskAdapter(List<String> appList) {
        mTaskList = appList;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);

        final ViewHolder holder = new ViewHolder(view);
        holder.taskView.setOnLongClickListener(new View.OnLongClickListener(){

            @Override
            public boolean onLongClick(View v) {
                int position = holder.getAdapterPosition();
                String app = mTaskList.get(position);

                return true;
            }
        });

        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
          String app = mTaskList.get(position);
//        holder.taskImage.setImageResource(task.getImageId());
          holder.taskName.setText(app);
//        holder.deadline.setText(task.getDeadline());
    }

    @Override
    public int getItemCount() {
        return mTaskList.size();
    }


}