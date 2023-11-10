package com.jceloto7.java_bank;

import com.jceloto7.java_bank.model.ClientModelList;
import com.jceloto7.java_bank.service.ClientService;
import com.jceloto7.java_bank.service.MismatchCorrectionService;
import com.jceloto7.java_bank.service.AuthenticationService;
import com.jceloto7.java_bank.util.InputUtil;
import com.jceloto7.java_bank.util.MismatchCorrectionUtil;
import com.jceloto7.java_bank.util.ValidationUtil;



public class Bootstrap {

    public static InputUtil inputUtil;

    public static MismatchCorrectionUtil mismatchCorrectionUtil;

    public static ValidationUtil validationUtil;

    public static ClientService clientService;

    public static AuthenticationService authenticationService;

    public static MismatchCorrectionService mismatchCorrectionService;

    public static ClientModelList clientModelList;




    public static void start(){
        inputUtil = new InputUtil();
        validationUtil = new ValidationUtil();
        clientModelList = new ClientModelList();
        authenticationService = new AuthenticationService(clientModelList.getClientModelList());
        mismatchCorrectionUtil = new MismatchCorrectionUtil(validationUtil, inputUtil);
        clientService = new ClientService(validationUtil,mismatchCorrectionUtil);
        mismatchCorrectionService = new MismatchCorrectionService(inputUtil, authenticationService);
    }
}
