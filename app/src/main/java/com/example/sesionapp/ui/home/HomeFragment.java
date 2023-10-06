package com.example.sesionapp.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.sesionapp.R;
import com.example.sesionapp.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    private boolean estadoImagen;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        binding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                if (estadoImagen) {
                    estadoImagen = false;
                    binding.imageView2.setImageResource(R.drawable.bird);
                } else {
                    estadoImagen = true;
                    binding.imageView2.setImageResource(R.drawable.penguin);
                }
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}