package com.techolution.downloadfile;

import com.techolution.downloadfile.property.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
        FileStorageProperties.class
})
public class DownloadfileApplication {

    public static void main(String[] args) {
        SpringApplication.run(DownloadfileApplication.class, args);
    }

}
