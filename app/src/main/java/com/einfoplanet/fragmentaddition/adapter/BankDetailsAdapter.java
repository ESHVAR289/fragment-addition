package com.einfoplanet.fragmentaddition.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;

import com.einfoplanet.fragmentaddition.R;
import com.einfoplanet.fragmentaddition.model.BankDetailModel;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class BankDetailsAdapter extends RecyclerView.Adapter<BankDetailsAdapter.BankViewModel> {

    ArrayList<BankDetailModel> arrayList;
    Context context;

    public BankDetailsAdapter(Context context, ArrayList<BankDetailModel> arrayList) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public BankViewModel onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(
                R.layout.single_layout_bank_detail, viewGroup, false);
        return new BankViewModel(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final BankViewModel bankViewModel, int i) {
        final BankDetailModel bankDetailModel = arrayList.get(i);
        bankViewModel.txtBankName.setText(bankDetailModel.bankName);
        DecimalFormat myFormatter = new DecimalFormat("##.00");
        bankViewModel.txtMutualFundName.setText(bankDetailModel.mutualFundName);
        String rupeeString = context.getResources().getString(R.string.Rs);
        bankViewModel.txtCurrentValue.setText(String.format("%s %s", rupeeString, myFormatter.format(bankDetailModel.currentAmount)));
        bankViewModel.txtWithdrawalValue.setText(
                Html.fromHtml("<font color='#000000'>" +
                        "<u>" + rupeeString + " " + myFormatter.format(bankDetailModel.withdrawalAmount) + "</u>" +
                        "</font>"));
        bankViewModel.aSwitchIsWithdrawal.setChecked(bankDetailModel.isFullWithdrawal);
        bankViewModel.llContainer.setBackground(context.getResources().getDrawable(bankDetailModel.backgroundDrawable));
    }

    @Override
    public int getItemCount() {
        if (arrayList != null)
            return arrayList.size();
        else
            return 0;
    }

    public class BankViewModel extends RecyclerView.ViewHolder {
        TextView txtBankName, txtMutualFundName, txtCurrentValue, txtWithdrawalValue;
        Switch aSwitchIsWithdrawal;
        ImageView ivBankImage;
        LinearLayout llContainer;

        public BankViewModel(@NonNull View itemView) {
            super(itemView);
            llContainer = itemView.findViewById(R.id.ll_container);
            txtBankName = itemView.findViewById(R.id.txt_bank_name);
            ivBankImage = itemView.findViewById(R.id.iv_bank_image);
            txtMutualFundName = itemView.findViewById(R.id.txt_mutual_fund_name);
            txtCurrentValue = itemView.findViewById(R.id.txt_current_value);
            txtWithdrawalValue = itemView.findViewById(R.id.txt_withdrawal_value);
            aSwitchIsWithdrawal = itemView.findViewById(R.id.switch_full_withdrawal);
        }
    }
}
