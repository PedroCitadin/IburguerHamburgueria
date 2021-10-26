package com.example.iburguer;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PedidosConfirmadosFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PedidosConfirmadosFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private Bundle extras;

    public PedidosConfirmadosFragment() {
        // Required empty public constructor
    }

    public PedidosConfirmadosFragment(Bundle extras) {
        this.extras = extras;
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PrincipalFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PedidosConfirmadosFragment newInstance(String param1, String param2) {
        PedidosConfirmadosFragment fragment = new PedidosConfirmadosFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
        Handler handler = new Handler();

        new Thread() {
            public void run() {
                handler.post(new Runnable() {
                    public void run() {

                    }
                });
            }
        }.start();
    }

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState){
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pedidos_confirmados, container, false);


        //Bundle extras = getIntent().getExtras();


        return view;
    }
}