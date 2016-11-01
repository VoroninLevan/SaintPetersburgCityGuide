package comvoroninlevan.instagram.www.saintpetersburgcityguide;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class TheatreFragment extends Fragment {


    public TheatreFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        ArrayList<MainLine> mainLine = new ArrayList<MainLine>();

        String aleksandrinsky = new String(getString(R.string.annotation_aleksandrinsky));
        String theatre_hermitage = new String(getString(R.string.annotation_theatre_hermitage));
        String mariinsky = new String(getString(R.string.annotation_mariinsky));
        String mikhaylovsky = new String(getString(R.string.annotation_mikhaylovsky));

        mainLine.add(new MainLine(R.drawable.theatre_aleksandrinsky, aleksandrinsky));
        mainLine.add(new MainLine(R.drawable.theatre_hermitage, theatre_hermitage));
        mainLine.add(new MainLine(R.drawable.theatre_mariinsky, mariinsky));
        mainLine.add(new MainLine(R.drawable.theatre_mikhaylovsky, mikhaylovsky));

        MainLineAdapter adapter = new MainLineAdapter(getActivity(), mainLine, R.color.theatres);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent theatreAlexandrinsky = new Intent(getActivity(), AlexandrinskyTheatreActivity.class);
                        startActivity(theatreAlexandrinsky);
                        break;
                    case 1:
                        Intent theatreHermitage = new Intent(getActivity(), HermitageTheatreActivity.class);
                        startActivity(theatreHermitage);
                        break;
                    case 2:
                        Intent theatreMariinsky = new Intent(getActivity(), MariinskyTheatreActivity.class);
                        startActivity(theatreMariinsky);
                        break;
                    case 3:
                        Intent theatreMikhailovsky = new Intent(getActivity(), MikhailovskyTheatreActivity.class);
                        startActivity(theatreMikhailovsky);
                        break;
                }
            }
        });

        return rootView;
    }

    @Override
    public void onStop() {
        super.onStop();
    }
}
