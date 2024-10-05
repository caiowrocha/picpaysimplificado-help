package com.picpay_simplificado.picpay_simplificado.services;

import com.picpay_simplificado.picpay_simplificado.domain.user.User;
import com.picpay_simplificado.picpay_simplificado.dtos.NotificationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NotificationService {
    @Autowired
    private RestTemplate restTemplate;

    public void sendNotification(User user, String message) throws Exception {
        String email = user.getEmail();

        NotificationDTO notificationRequest = new NotificationDTO(message, email);
        /*
        - Service Not Working
       ResponseEntity<String> notificationResponse = restTemplate.postForEntity("https://util.devi.tools/api/v1/notify", notificationRequest, String.class);

       if(!(notificationResponse.getStatusCode() == HttpStatus.OK)) {
           System.out.println("Deu erro");
           throw new Exception("Serviço de notificação está fora do ar");
       }
        */
    }
}
