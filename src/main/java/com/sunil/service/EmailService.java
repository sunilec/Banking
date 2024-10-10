package com.sunil.service;

import com.sunil.payload.EmailDetails;

public interface EmailService {

    void sendEmailAlert(EmailDetails emailDetails);
}
