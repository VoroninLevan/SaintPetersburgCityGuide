package comvoroninlevan.instagram.www.saintpetersburgcityguide;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Леван on 01.09.2016.
 */
public class MainLineAdapter extends ArrayAdapter<MainLine> {

    private int mColor;

    public MainLineAdapter(Activity context, ArrayList<MainLine> mainLine, int color){
        super(context, 0, mainLine);
        mColor = color;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.line_view, parent, false);
        }
        MainLine currentMainLine = getItem(position);

        View textContainer = listItemView.findViewById(R.id.annotation);
        int color = ContextCompat.getColor(getContext(), mColor);
        textContainer.setBackgroundColor(color);

        ImageView smallImage = (ImageView) listItemView.findViewById(R.id.smallImageId);
        smallImage.setImageResource(currentMainLine.getSmallPhotoId());

        TextView annotation = (TextView) listItemView.findViewById(R.id.annotation);
        annotation.setText(currentMainLine.getAnnotation());

        return listItemView;
    }
}
