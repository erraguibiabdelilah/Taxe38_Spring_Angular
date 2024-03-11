package ma.zs.univ.unit.service.impl.admin.communBean;

import ma.zs.univ.bean.core.communBean.Rue;
import ma.zs.univ.dao.facade.core.communBean.RueDao;
import ma.zs.univ.service.impl.admin.communBean.RueAdminServiceImpl;

import java.util.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.time.LocalDateTime;



import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


@SpringBootTest
class RueAdminServiceImplTest {

    @Mock
    private RueDao repository;
    private AutoCloseable autoCloseable;
    private RueAdminServiceImpl underTest;



    @BeforeEach
    void setUp() {
        autoCloseable = MockitoAnnotations.openMocks(this);
        underTest = new RueAdminServiceImpl(repository);
    }

    @AfterEach
    void tearDown() throws Exception {
        autoCloseable.close();
    }

    @Test
    void canGetAllRue() {
         //when
        underTest.findAll();
        verify(repository).findAll();
    }

    @Test
    void itShouldSaveRue() {
        // Given
        Rue toSave = constructSample(1);
        when(repository.save(toSave)).thenReturn(toSave);

        // When
        underTest.create(toSave);

        // Then
        verify(repository).save(toSave);
    }

    @Test
    void itShouldDeleteRue() {
        // Given
        Long idToDelete = 1L;
        when(repository.existsById(idToDelete)).thenReturn(true);

        // When
        underTest.deleteById(idToDelete);

        // Then
        verify(repository).deleteById(idToDelete);
    }
    @Test
    void itShouldGetRueById() {
        // Given
        Long idToRetrieve = 1L; // Example Rue ID to retrieve
        Rue expected = new Rue(); // You need to replace Rue with your actual class
        expected.setId(idToRetrieve);
        when(repository.findById(idToRetrieve)).thenReturn(java.util.Optional.of(expected));

        // When
        Rue result = underTest.findById(idToRetrieve);

        // Then
        assertEquals(expected, result);
    }
	
	private Rue constructSample(int i) {
		Rue given = new Rue();
        given.setId(id);
        given.setCode("code-"+i);
        given.setCode(code);
        given.setLibelle("libelle-"+i);
        given.setLibelle(libelle);
        return given;
    }

}
