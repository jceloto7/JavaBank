package com.jceloto7.java_bank.controller;

import com.jceloto7.java_bank.service.MismatchCorrectionService;

public class MismatchCorrectionController {

    private final MismatchCorrectionService mismatchCorrectionService;

    public MismatchCorrectionController(MismatchCorrectionService mismatchCorrectionService){
        this.mismatchCorrectionService = mismatchCorrectionService;
    }

    public void retypeData(){
        try {
             mismatchCorrectionService.retypeData();
        } catch (Exception ex){
            System.out.println("An unexpected error has occurred. Please try again.");
        }

    }
}
