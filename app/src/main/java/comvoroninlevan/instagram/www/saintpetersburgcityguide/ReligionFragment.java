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
public class ReligionFragment extends Fragment {


    public ReligionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        ArrayList<MainLine> mainLine = new ArrayList<MainLine>();

        String aleksander = new String(getString(R.string.annotation_aleksander));
        String isaacs = new String(getString(R.string.annotation_isaacs));
        String kazan = new String(getString(R.string.annotation_kazan));
        String kronstadt = new String(getString(R.string.annotation_kronstadt));
        String savior = new String(getString(R.string.annotation_savior));
        String smolny = new String(getString(R.string.annotation_smolny));

        mainLine.add(new MainLine(R.drawable.religion_aleksander, aleksander));
        mainLine.add(new MainLine(R.drawable.religion_isaacs, isaacs));
        mainLine.add(new MainLine(R.drawable.religion_kazan, kazan));
        mainLine.add(new MainLine(R.drawable.religion_kronstadt, kronstadt));
        mainLine.add(new MainLine(R.drawable.religion_savior, savior));
        mainLine.add(new MainLine(R.drawable.religion_smolny, smolny));

        MainLineAdapter adapter = new MainLineAdapter(getActivity(), mainLine, R.color.religion);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent religionAlexander = new Intent(getActivity(), AlexanderReligionActivity.class);
                        startActivity(religionAlexander);
                        break;
                    case 1:
                        Intent religionIsaac = new Intent(getActivity(), IsaacReligionActivity.class);
                        startActivity(religionIsaac);
                        break;
                    case 2:
                        Intent religionKazan = new Intent(getActivity(), KazanReligionActivity.class);
                        startActivity(religionKazan);
                        break;
                    case 3:
                        Intent religionKronstadt = new Intent(getActivity(), KronstadtReligionActivity.class);
                        startActivity(religionKronstadt);
                        break;
                    case 4:
                        Intent religionSavior = new Intent(getActivity(), SaviorReligionActivity.class);
                        startActivity(religionSavior);
                        break;
                    case 5:
                        Intent religionSmolny = new Intent(getActivity(), SmolnyReligionActivity.class);
                        startActivity(religionSmolny);
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
