package sg.edu.rp.c346.basicmathformula;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<MathItem> mathList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<MathItem> objects) {
        super(context, resource, objects);
        this.parent_context = context;
        this.layout_id = resource;
        this.mathList = objects;
    }

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater)parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView  = inflater.inflate(layout_id, parent, false);
        TextView tvTitle = rowView.findViewById(R.id.textViewTitle);
        TextView tvFormula = rowView.findViewById(R.id.textViewFormula);
        TextView tvType = rowView.findViewById(R.id.textViewType);
        MathItem currentItem = mathList.get(position);
        tvTitle.setText(currentItem.getTitle());
        tvFormula.setText(currentItem.getFormula());
        tvType.setText(currentItem.getType());
        return rowView;
    }

}
