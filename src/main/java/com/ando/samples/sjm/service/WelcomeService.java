package com.ando.samples.sjm.service;

import com.ando.samples.sjm.util.Constants;
import org.springframework.stereotype.Service;

@Service
public class WelcomeService {

    public String message() {
        return Constants.WELCOME_MSG;
    }
}
