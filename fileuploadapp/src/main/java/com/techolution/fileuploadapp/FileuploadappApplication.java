package com.techolution.fileuploadapp;

import com.techolution.fileuploadapp.property.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
        FileStorageProperties.class
})
public class FileuploadappApplication {

    public static void main(String[] args) {
        SpringApplication.run(FileuploadappApplication.class, args);
    }

}
