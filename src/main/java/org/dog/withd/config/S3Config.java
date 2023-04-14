package org.dog.withd.config;

import com.amazonaws.auth.*;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3Client;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource(value = "classpath:/s3.properties")
public class S3Config {
    @Value("${cloud_aws_credentials_accessKey}")
    private String cloud_aws_credentials_accessKey;
    @Value("${cloud_aws_credentials_secretKey}")
    private String cloud_aws_credentials_secretKey;
    @Value("${cloud_aws_region_static}")
    private String cloud_aws_region_static;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public BasicAWSCredentials basicAWSCredentials() {
        return new BasicAWSCredentials(cloud_aws_credentials_accessKey, cloud_aws_credentials_secretKey);
    }
    @Bean
    public AmazonS3Client amazonS3Client(AWSCredentials awsCredentials) {
        AmazonS3Client amazonS3Client = new AmazonS3Client(awsCredentials);
        amazonS3Client.setRegion(Region.getRegion(Regions.fromName(cloud_aws_region_static)));
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

