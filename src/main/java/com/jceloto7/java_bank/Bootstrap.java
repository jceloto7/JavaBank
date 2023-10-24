package com.jceloto7.java_bank;

import com.jceloto7.java_bank.model.ClientModel;
import com.jceloto7.java_bank.model.ClientModelList;
import com.jceloto7.java_bank.service.ClientService;
import com.jceloto7.java_bank.service.ValidationService;
import com.jceloto7.java_bank.util.ConverterUtil;
import com.jceloto7.java_bank.util.InputUtil;
import com.jceloto7.java_bank.util.MismatchCorrectionUtil;
import com.jceloto7.java_bank.util.ValidationUtil;

import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bootstrap {

    public static InputUtil inputUtil;

    public static MismatchCorrectionUtil mismatchCorrectionUtil;

    public static ValidationUtil validationUtil;

    public static ConverterUtil converterUtil;

    public static ClientService clientService;

    public static ValidationService validationService;



    public static void start(){
        converterUtil = new ConverterUtil();
        inputUtil = new InputUtil();
        validationUtil = new ValidationUtil();
        mismatchCorrectionUtil = new MismatchCorrectionUtil(validationUtil, inputUtil);
        clientService = new ClientService(validationUtil,mismatchCorrectionUtil,converterUtil);
        //validationService = new ValidationService(inputUtil);

    }
}
