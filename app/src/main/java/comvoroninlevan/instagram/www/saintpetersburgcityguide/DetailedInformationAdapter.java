package comvoroninlevan.instagram.www.saintpetersburgcityguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Леван on 04.09.2016.
 */
public class DetailedInformationAdapter extends ArrayAdapter<DetailedInformation> {

    public DetailedInformationAdapter(Activity context, ArrayList<DetailedInformation> detailedInformation){
        super(context, 0, detailedInformation);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.detailed_information, parent, false);
        }
        DetailedInformation currentMainLine = getItem(position);

        ImageView smallImage = (ImageView) listItemView.findViewById(R.id.mainPhoto);
        smallImage.setImageResource(currentMainLine.getBigPhoto());

        TextView header = (TextView) listItemView.findViewById(R.id.header);
        header.setText(currentMainLine.getHeader());

        TextView mainText = (TextView) listItemView.findViewById(R.id.mainText);
        mainText.setText(currentMainLine.getMainText());

        return listItemView;
    }
}
