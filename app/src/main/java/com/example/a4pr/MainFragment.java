package com.example.a4pr;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class MainFragment extends Fragment {

    Button button_check_students;
    Button button_check_teachers;

    public MainFragment() {
        super(R.layout.fragment_main);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        button_check_students = (Button) getActivity().findViewById(R.id.button_check_students);
        button_check_teachers = (Button) getActivity().findViewById(R.id.button_check_teachers);
        button_check_students.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getParentFragmentManager().beginTransaction()
                        .setReorderingAllowed(true)
                        .replace(R.id.fragment_main_container_view,
                                FirstFragment.class, null, "firstFragment")
                        .commit();
            }
        });

        button_check_teachers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getParentFragmentManager().beginTransaction()
                        .setReorderingAllowed(true)
                        .replace(R.id.fragment_main_container_view,
                                SecondFragment.class, null, "secondFragment")
                        .commit();
            }
        });
    }
}