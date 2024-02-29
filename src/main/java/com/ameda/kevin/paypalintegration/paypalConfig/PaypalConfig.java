package com.ameda.kevin.paypalintegration.paypalConfig;/*
*
@author ameda
@project paypal-integration
@package com.ameda.kevin.paypalintegration.paypalConfig
*
*/

import com.paypal.base.rest.APIContext;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PaypalConfig {

    @Value("${paypal.client-id}")
    private String clientId;
    @Value("${paypal.client-secret}")
    private String clientSecret;
    @Value("${paypal.mode}")
    private String mode;

    @Bean
    public APIContext apiContext(){
        return new APIContext(clientId,clientSecret,mode);
    }
}
