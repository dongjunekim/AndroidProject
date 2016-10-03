package fora.where_bus;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by 김동준 on 2016-10-01.
 */
public class SecondFragment extends Fragment {
    private static final String ARG_SECTION_NUMBER = "section_number";

    public SecondFragment() {
    }

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static SecondFragment newInstance(int sectionNumber) {
        SecondFragment fragment = new SecondFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_second, container, false);
        return rootView;
    }
}
