package comvoroninlevan.instagram.www.saintpetersburgcityguide;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MuseumsFragment extends Fragment {


    public MuseumsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<MainLine> mainLine = new ArrayList<MainLine>();

        String russian = new String(getString(R.string.annotation_russian));
        String aurora = new String(getString(R.string.annotation_aurora));
        String dostoyevsky = new String(getString(R.string.annotation_dostoyevsky));
        String hermitage = new String(getString(R.string.annotation_hermitage));
        String kuntskamera = new String(getString(R.string.annotation_kunstkamera));
        String zoological = new String(getString(R.string.annotation_zoological));

        mainLine.add(new MainLine(R.drawable.museum_russian, russian));
        mainLine.add(new MainLine(R.drawable.museum_aurora, aurora));
        mainLine.add(new MainLine(R.drawable.museum_dostoevsky, dostoyevsky));
        mainLine.add(new MainLine(R.drawable.museum_hermitage, hermitage));
        mainLine.add(new MainLine(R.drawable.museum_kuntskamera, kuntskamera));
        mainLine.add(new MainLine(R.drawable.museum_zoological, zoological));

        MainLineAdapter adapter = new MainLineAdapter(getActivity(), mainLine, R.color.museums);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent museumRussian = new Intent(getActivity(), RussianMuseumActivity.class);
                        startActivity(museumRussian);
                        break;
                    case 1:
                        Intent museumAurora = new Intent(getActivity(), AuroraMuseumActivity.class);
                        startActivity(museumAurora);
                        break;
                    case 2:
                        Intent museumDostoevsky = new Intent(getActivity(), DostoevskyMuseumActivity.class);
                        startActivity(museumDostoevsky);
                        break;
                    case 3:
                        Intent museumHermitage = new Intent(getActivity(), HermitageMuseumActivity.class);
                        startActivity(museumHermitage);
                        break;
                    case 4:
                        Intent museumKunstkamera = new Intent(getActivity(), KunstkameraMuseumActivity.class);
                        startActivity(museumKunstkamera);
                        break;
                    case 5:
                        Intent museumZoological = new Intent(getActivity(), ZoologicalMuseumActivity.class);
                        startActivity(museumZoological);
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
