package ma.zs.univ.unit.ws.facade.admin.communBean;

import ma.zs.univ.bean.core.communBean.Redevable;
import ma.zs.univ.service.impl.admin.communBean.RedevableAdminServiceImpl;
import ma.zs.univ.ws.converter.communBean.RedevableConverter;
import ma.zs.univ.ws.dto.communBean.RedevableDto;
import ma.zs.univ.ws.facade.admin.communBean.RedevableRestAdmin;
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
public class RedevableRestAdmin {

    private MockMvc mockMvc;

    @Mock
    private RedevableAdminServiceImpl service;
    @Mock
    private RedevableConverter converter;

    @InjectMocks
    private RedevableRestAdmin controller;

    @Before("")
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        this.mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }


    @Test
    public void itShouldFindAllRedevableTest() throws Exception {
        // Mock the service to return an empty list
        when(service.findAll()).thenReturn(Collections.emptyList());
        when(converter.toDto(Collections.emptyList())).thenReturn(Collections.emptyList());

        // Call the controller method
        ResponseEntity<List<RedevableDto>> result = controller.findAll();

        // Verify the result
        assertEquals(HttpStatus.NO_CONTENT, result.getStatusCode());

        // Response body should be empty list
        List<RedevableDto> responseBody = result.getBody();
        assertNotNull(responseBody);
        assertEquals(0, responseBody.size());
    }

    @Test
    public void itShouldSaveRedevableTest() throws Exception {
        // Mock data
        RedevableDto requestDto = new RedevableDto();
        Redevable entity = new Redevable();
        Redevable saved = new Redevable();
        RedevableDto savedDto = new RedevableDto();

        // Mock the converter to return the redevable object when converting from DTO
        when(converter.toItem(requestDto)).thenReturn(entity);

        // Mock the service to return the saved client
        when(service.create(entity)).thenReturn(saved);

        // Mock the converter to return the saved redevable DTO
        when(converter.toDto(saved)).thenReturn(savedDto);

        // Call the controller method
        ResponseEntity<RedevableDto> result = controller.save(requestDto);

        // Verify the result
        assertEquals(HttpStatus.CREATED, result.getStatusCode());

        // Verify the response body
        RedevableDto responseBody = result.getBody();
        assertNotNull(responseBody);

        // Add assertions to compare the response body with the saved redevable DTO
        assertEquals(savedDto.getEmail(), responseBody.getEmail());
        assertEquals(savedDto.getPassword(), responseBody.getPassword());
        assertEquals(savedDto.getCin(), responseBody.getCin());
        assertEquals(savedDto.getNom(), responseBody.getNom());
        assertEquals(savedDto.getPrenom(), responseBody.getPrenom());
        assertEquals(savedDto.getCredentialsNonExpired(), responseBody.getCredentialsNonExpired());
        assertEquals(savedDto.getEnabled(), responseBody.getEnabled());
        assertEquals(savedDto.getAccountNonExpired(), responseBody.getAccountNonExpired());
        assertEquals(savedDto.getAccountNonLocked(), responseBody.getAccountNonLocked());
        assertEquals(savedDto.getPasswordChanged(), responseBody.getPasswordChanged());
        assertEquals(savedDto.getUsername(), responseBody.getUsername());
        assertEquals(savedDto.getPassword(), responseBody.getPassword());
    }

}
