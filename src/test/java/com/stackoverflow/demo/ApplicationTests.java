package com.stackoverflow.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {
    
    @Autowired
    private StateMapper stateMapper;
    @Autowired
    private PropertyService propService;
    
    @Test
    void contextLoads() {
        assertNotNull(stateMapper);
        assertNotNull(propService);
    }
    
    @Test
    public void givenPersonEntitytoPersonWithExpression_whenMaps_thenCorrect() {
        State entity = new State();
        entity.setId(7);
        entity.setName("foo");
        StateDTO dto = stateMapper.carToCarDTO(entity);
        
        assertEquals(entity.getId(), dto.getId());
        assertEquals(entity.getName(), dto.getName());
        assertEquals(propService.getAppVersion(), dto.getAppVersion());
    }
}
