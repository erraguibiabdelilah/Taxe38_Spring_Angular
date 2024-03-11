package ma.zs.univ.unit.ws.facade.admin.taxe38Bean;

import ma.zs.univ.bean.core.taxe38Bean.Taxe38;
import ma.zs.univ.service.impl.admin.taxe38Bean.Taxe38AdminServiceImpl;
import ma.zs.univ.ws.converter.taxe38Bean.Taxe38Converter;
import ma.zs.univ.ws.dto.taxe38Bean.Taxe38Dto;
import ma.zs.univ.ws.facade.admin.taxe38Bean.Taxe38RestAdmin;
import org.aspectj.lang.annotation.Before;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class Taxe38RestAdmin {

    private MockMvc mockMvc;

    @Mock
    private Taxe38AdminServiceImpl service;
    @Mock
    private Taxe38Converter converter;

    @InjectMocks
    private Taxe38RestAdmin controller;

    @Before("")
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        this.mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }


    @Test
    public void itShouldFindAllTaxe38Test() throws Exception {
        // Mock the service to return an empty list
        when(service.findAll()).thenReturn(Collections.emptyList());
        when(converter.toDto(Collections.emptyList())).thenReturn(Collections.emptyList());

        // Call the controller method
        ResponseEntity<List<Taxe38Dto>> result = controller.findAll();

        // Verify the result
        assertEquals(HttpStatus.NO_CONTENT, result.getStatusCode());

        // Response body should be empty list
        List<Taxe38Dto> responseBody = result.getBody();
        assertNotNull(responseBody);
        assertEquals(0, responseBody.size());
    }

    @Test
    public void itShouldSaveTaxe38Test() throws Exception {
        // Mock data
        Taxe38Dto requestDto = new Taxe38Dto();
        Taxe38 entity = new Taxe38();
        Taxe38 saved = new Taxe38();
        Taxe38Dto savedDto = new Taxe38Dto();

        // Mock the converter to return the taxe38 object when converting from DTO
        when(converter.toItem(requestDto)).thenReturn(entity);

        // Mock the service to return the saved client
        when(service.create(entity)).thenReturn(saved);

        // Mock the converter to return the saved taxe38 DTO
        when(converter.toDto(saved)).thenReturn(savedDto);

        // Call the controller method
        ResponseEntity<Taxe38Dto> result = controller.save(requestDto);

        // Verify the result
        assertEquals(HttpStatus.CREATED, result.getStatusCode());

        // Verify the response body
        Taxe38Dto responseBody = result.getBody();
        assertNotNull(responseBody);

        // Add assertions to compare the response body with the saved taxe38 DTO
        assertEquals(savedDto.getCode(), responseBody.getCode());
        assertEquals(savedDto.getAnne(), responseBody.getAnne());
        assertEquals(savedDto.getTrim(), responseBody.getTrim());
        assertEquals(savedDto.getDatePresentaion(), responseBody.getDatePresentaion());
        assertEquals(savedDto.getNombreMoisRetard(), responseBody.getNombreMoisRetard());
        assertEquals(savedDto.getMontantBase(), responseBody.getMontantBase());
        assertEquals(savedDto.getMontantRetardPremeirMois(), responseBody.getMontantRetardPremeirMois());
        assertEquals(savedDto.getMontantTotal(), responseBody.getMontantTotal());
    }

}
