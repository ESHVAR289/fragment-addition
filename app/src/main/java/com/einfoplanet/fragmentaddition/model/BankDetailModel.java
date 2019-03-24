package com.einfoplanet.fragmentaddition.model;

public class BankDetailModel {
    public String bankName;
    public String mutualFundName;
    public double currentAmount;
    public double withdrawalAmount;
    public boolean isFullWithdrawal;
    public int ivDrawable;
    public int backgroundDrawable;

    public BankDetailModel(String bankName, String mutualFundName,
                           double currentAmount, double withdrawalAmount,
                           boolean isFullWithdrawal, int ivDrawable,
                           int backgroundDrawable) {
        this.bankName = bankName;
        this.mutualFundName = mutualFundName;
        this.currentAmount = currentAmount;
        this.withdrawalAmount = withdrawalAmount;
        this.isFullWithdrawal = isFullWithdrawal;
        this.ivDrawable = ivDrawable;
        this.backgroundDrawable = backgroundDrawable;
    }
}
