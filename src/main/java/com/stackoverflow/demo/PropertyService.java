package com.stackoverflow.demo;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Component
public class PropertyService {

    @Value("application.version")
    private String appVersion;
}
