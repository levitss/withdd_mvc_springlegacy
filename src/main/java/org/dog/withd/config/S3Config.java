package org.dog.withd.config;

import com.amazonaws.auth.*;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3Client;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class S3Config {
    @Value("${cloud.aws.credentials.accessKey}")
    private String accessKey;
    @Value("${cloud.aws.credentials.secretKey}")
    private String secretkey;
    @Value("${cloud.aws.region.static}")
    private String region;


    @Bean
    public BasicAWSCredentials basicAWSCredentials() {
        return new BasicAWSCredentials(accessKey, secretkey);
    }
    @Bean
    public AmazonS3Client amazonS3Client(AWSCredentials awsCredentials) {
        AmazonS3Client amazonS3Client = new AmazonS3Client(awsCredentials);
        amazonS3Client.setRegion(Region.getRegion(Regions.fromName(region)));
        return amazonS3Client;
    }
}

//    AmazonS3Client s3Builder = AmazonS3ClientBuilder.standard().withRegion(region).withCredentials(new AWSStaticCredentialsProvider(awsCredentials())).build();
//        return s3Builder;







//    @Bean
//    public static AmazonS3Client amazonS3Client() {
//        return (AmazonS3Client) AmazonS3ClientBuilder.standard()
//                .withCredentials(new DefaultAWSCredentialsProviderChain()).withRegion(Regions.AP_NORTHEAST_2)
//                .build();
//    }

