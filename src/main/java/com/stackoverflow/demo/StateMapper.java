package com.stackoverflow.demo;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(componentModel = "spring")
public abstract class StateMapper {

    @Autowired
    protected PropertyService propertyService;

    @Mapping(target = "appVersion", expression = "java(propertyService.getAppVersion())")
    public abstract StateDTO carToCarDTO(State car);

}
