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
public class PalacesFragment extends Fragment {


    public PalacesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        ArrayList<MainLine> mainLine = new ArrayList<MainLine>();

        String moika = new String(getString(R.string.annotation_moika));
        String winter = new String(getString(R.string.annotation_winter));
        String pavlovsk = new String(getString(R.string.annotation_pavlovsk));
        String menshikov = new String(getString(R.string.annotation_menshikov));
        String peterhof = new String(getString(R.string.annotation_peterhof));
        String stroganov = new String(getString(R.string.annotation_stroganov));

        mainLine.add(new MainLine(R.drawable.palace_moika, moika));
        mainLine.add(new MainLine(R.drawable.palace_winter, winter));
        mainLine.add(new MainLine(R.drawable.palace_pavlovsk, pavlovsk));
        mainLine.add(new MainLine(R.drawable.palace_menshikov, menshikov));
        mainLine.add(new MainLine(R.drawable.palace_peterhof, peterhof));
        mainLine.add(new MainLine(R.drawable.palace_stroganov, stroganov));

        MainLineAdapter adapter = new MainLineAdapter(getActivity(), mainLine, R.color.palaces);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent palaceMoika = new Intent(getActivity(), MoikaPalaceActivity.class);
                        startActivity(palaceMoika);
                        break;
                    case 1:
                        Intent palaceWinter = new Intent(getActivity(), WinterPalaceActivity.class);
                        startActivity(palaceWinter);
                        break;
                    case 2:
                        Intent palacePavlovsk = new Intent(getActivity(), PavlovskPalaceActivity.class);
                        startActivity(palacePavlovsk);
                        break;
                    case 3:
                        Intent palaceMenshikov = new Intent(getActivity(), MenshikovPalaceActivity.class);
                        startActivity(palaceMenshikov);
                        break;
                    case 4:
                        Intent palacePeterhof = new Intent(getActivity(), PeterhofPalaceActivity.class);
                        startActivity(palacePeterhof);
                        break;
                    case 5:
                        Intent palaceStroganov = new Intent(getActivity(), StroganovPalaceActivity.class);
                        startActivity(palaceStroganov);
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
