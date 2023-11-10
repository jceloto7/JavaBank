package com.jceloto7.java_bank.controller;

import com.jceloto7.java_bank.service.MismatchCorrectionService;

public class MismatchCorrectionController {

    private final MismatchCorrectionService mismatchCorrectionService;

    public MismatchCorrectionController(MismatchCorrectionService mismatchCorrectionService) {
        this.mismatchCorrectionService = mismatchCorrectionService;
    }

    public boolean retypeData() {
        try {
            return mismatchCorrectionService.retypeData();
        } catch (Exception ex) {
            System.out.println("An unexpected error has occurred. Please try again.");
        }

        return false;

    }

    public String getUsername() {
        try {
            return mismatchCorrectionService.getUsername();
        } catch (Exception ex) {
            System.out.println("An unexpected error has occurred. Please try again.");
        }

        return "";
    }

}
