package com.example.financial.mainActivity;

import static androidx.recyclerview.widget.LinearLayoutManager.*;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.financial.Adapters.crypto_adapter;
import com.example.financial.Adapters.stock_adapter;
import com.example.financial.R;
import com.example.financial.databinding.ActivityMainBinding;
import com.example.financial.domain.domain;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    ArrayList<Integer> lineData1 = new ArrayList<>();
    ArrayList<Integer> lineData2 = new ArrayList<>();
    ArrayList<Integer> lineData3 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setData();
        recyclerViewCrypto();
        recyclerStockAdapter();
    }
    public void recyclerStockAdapter(){
        binding.stockView.setLayoutManager(new LinearLayoutManager(this, HORIZONTAL, false));

        ArrayList<domain> domainArrayList = new ArrayList<>();
        domainArrayList.add(new domain("bitcoin", "BTC", 45000.12, 12.5, 1021.2, 6542.01, lineData1));
        domainArrayList.add(new domain("etherium", "ETH", 50000.12, -12.5, 9021.2, 6542.01, lineData2));
        domainArrayList.add(new domain("trox", "ROX", 45000.12, 3.5, 1021.2, 6542.01, lineData3));

        binding.stockView.setAdapter(new stock_adapter(domainArrayList));
    }

    public void recyclerViewCrypto() {
        binding.cryptoView.setLayoutManager(new LinearLayoutManager(this));
        ArrayList<domain> domainArrayList = new ArrayList<>();
        domainArrayList.add(new domain("bitcoin", "BTC", 45000.12, 12.5, 1021.2, 6542.01, lineData1));
        domainArrayList.add(new domain("etherium", "ETH", 50000.12, -12.5, 9021.2, 6542.01, lineData2));
        domainArrayList.add(new domain("trox", "ROX", 45000.12, 3.5, 1021.2, 6542.01, lineData3));

        binding.cryptoView.setAdapter(new crypto_adapter(domainArrayList));

    }
    public void setData(){
        lineData1.add(100);
        lineData1.add(150);
        lineData1.add(200);
        lineData1.add(250);

        lineData2.add(500);
        lineData2.add(400);
        lineData2.add(300);
        lineData2.add(600);

        lineData3.add(-120);
        lineData3.add(-300);
        lineData3.add(-600);
        lineData3.add(-700);

    }
}