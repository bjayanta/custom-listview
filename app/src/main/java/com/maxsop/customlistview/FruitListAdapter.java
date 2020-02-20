package com.maxsop.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class FruitListAdapter extends ArrayAdapter<Fruit> {
    private Context context;
    private int resource;

    /**
     *
     * @param context
     * @param resource
     * @param objects
     */
    public FruitListAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Fruit> objects) {
        super(context, resource, objects);

        this.context = context;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        String image = getItem(position).getImage();
        String title = getItem(position).getTitle();
        String description = getItem(position).getDescription();

        // layout inflater
        LayoutInflater inflater = LayoutInflater.from(this.context);
        convertView = inflater.inflate(this.resource, parent, false);

        // views
        ImageView imageView = convertView.findViewById(R.id.row_image);
        TextView titleView = convertView.findViewById(R.id.row_title);
        TextView descriptionView = convertView.findViewById(R.id.row_description);

        // set image
        int id = imageView.getContext().getResources().getIdentifier(image, "drawable", context.getPackageName());
        imageView.setImageResource(id);

        // set value
        titleView.setText(title);
        descriptionView.setText(description);

        return convertView;
    }
}
