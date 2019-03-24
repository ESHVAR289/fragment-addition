package com.einfoplanet.fragmentaddition.views;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.einfoplanet.fragmentaddition.R;
import com.einfoplanet.fragmentaddition.adapter.BankDetailsAdapter;
import com.einfoplanet.fragmentaddition.model.BankDetailModel;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        RecyclerView recyclerView = findViewById(R.id.rl_bank_details);
        BankDetailsAdapter bankDetailsAdapter = new BankDetailsAdapter(this, getDummyData());
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(bankDetailsAdapter);
    }

    private ArrayList<BankDetailModel> getDummyData() {
        ArrayList<BankDetailModel> list = new ArrayList<>();
        list.add(new BankDetailModel("HDFC",
                "ABC Mutual Fund",
                3500.00,
                3500.00,
                true,
                R.drawable.bank_default_icon,
                R.drawable.rounded_corner_hdfc_bank));
        list.add(new BankDetailModel("SBI",
                "XYZ Mutual Fund",
                5000.45,
                1500.00,
                false,
                R.drawable.bank_default_icon,
                R.drawable.rounded_corner_sbi_bank));
        list.add(new BankDetailModel("BOI",
                "EFG Mutual Fund",
                4500.00,
                2500.00,
                true,
                R.drawable.bank_default_icon,
                R.drawable.rounded_corner_boi_bank));
        list.add(new BankDetailModel("YES BANK",
                "HIJ Mutual Fund",
                3600.00,
                500.00,
                false,
                R.drawable.bank_default_icon,
                R.drawable.rounded_corner_yes_bank));
        list.add(new BankDetailModel("ICICI BANK",
                "KLM Mutual Fund",
                3500.50,
                6500.00,
                false,
                R.drawable.bank_default_icon,
                R.drawable.rounded_corner_icici_bank));
        list.add(new BankDetailModel("KOTAK BANK",
                "MNO Mutual Fund",
                9500.00,
                600.00,
                true,
                R.drawable.bank_default_icon,
                R.drawable.rounded_corner_kotak_bank));
        list.add(new BankDetailModel("CORPORATION BANK",
                "PQR Mutual Fund",
                3567.45,
                2500.00,
                true,
                R.drawable.bank_default_icon,
                R.drawable.rounded_corner_corporation_bank));

        return list;
    }
}
