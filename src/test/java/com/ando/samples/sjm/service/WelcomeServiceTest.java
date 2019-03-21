package com.ando.samples.sjm.service;

import com.ando.samples.sjm.config.ServiceConfiguration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static com.ando.samples.sjm.util.Constants.WELCOME_MSG;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = ServiceConfiguration.class)
public class WelcomeServiceTest {

    @Autowired
    private WelcomeService welcomeService;

    @Test
    public void testMessage() throws Exception {
        assertThat(welcomeService.message(), is(equalTo(WELCOME_MSG)));
    }
}