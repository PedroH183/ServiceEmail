package com.freires.emailservice.infra.ses;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClientBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
* O spring vai criar essa configuração assim que a aplicação irá iniciar @Configuration.
* O método declarado com o Bean é um componente que será utilizado na instanciação de objetos AmazonSimpleEmailService.
* */

@Configuration
public class AwsSesConfig {

    @Value("${aws.region}")
    private String region;

    @Value("${aws.accessKeyId}")
    private String accessKey;

    @Value("${aws.secretKey}")
    private String secretKey;

    @Bean
    public AmazonSimpleEmailService amazonSimpleEmailService(){
        BasicAWSCredentials credentials = new BasicAWSCredentials(this.accessKey, this.secretKey);
        return AmazonSimpleEmailServiceClientBuilder.standard()
                .withRegion( this.region )
                .withCredentials( new AWSStaticCredentialsProvider(credentials))
                .build();
    }
}
