package ma.zs.univ.unit.service.impl.admin.taxe38Bean;

import ma.zs.univ.bean.core.taxe38Bean.Taxe38;
import ma.zs.univ.dao.facade.core.taxe38Bean.Taxe38Dao;
import ma.zs.univ.service.impl.admin.taxe38Bean.Taxe38AdminServiceImpl;

import ma.zs.univ.bean.core.communBean.Locale ;
import ma.zs.univ.bean.core.communBean.Redevable ;
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
class Taxe38AdminServiceImplTest {

    @Mock
    private Taxe38Dao repository;
    private AutoCloseable autoCloseable;
    private Taxe38AdminServiceImpl underTest;



    @BeforeEach
    void setUp() {
        autoCloseable = MockitoAnnotations.openMocks(this);
        underTest = new Taxe38AdminServiceImpl(repository);
    }

    @AfterEach
    void tearDown() throws Exception {
        autoCloseable.close();
    }

    @Test
    void canGetAllTaxe38() {
         //when
        underTest.findAll();
        verify(repository).findAll();
    }

    @Test
    void itShouldSaveTaxe38() {
        // Given
        Taxe38 toSave = constructSample(1);
        when(repository.save(toSave)).thenReturn(toSave);

        // When
        underTest.create(toSave);

        // Then
        verify(repository).save(toSave);
    }

    @Test
    void itShouldDeleteTaxe38() {
        // Given
        Long idToDelete = 1L;
        when(repository.existsById(idToDelete)).thenReturn(true);

        // When
        underTest.deleteById(idToDelete);

        // Then
        verify(repository).deleteById(idToDelete);
    }
    @Test
    void itShouldGetTaxe38ById() {
        // Given
        Long idToRetrieve = 1L; // Example Taxe38 ID to retrieve
        Taxe38 expected = new Taxe38(); // You need to replace Taxe38 with your actual class
        expected.setId(idToRetrieve);
        when(repository.findById(idToRetrieve)).thenReturn(java.util.Optional.of(expected));

        // When
        Taxe38 result = underTest.findById(idToRetrieve);

        // Then
        assertEquals(expected, result);
    }
	
	private Taxe38 constructSample(int i) {
		Taxe38 given = new Taxe38();
        given.setId(id);
        given.setCode("code-"+i);
        given.setCode(code);
        given.setRedevable(new Redevable(1L));
        given.setRedevable(redevable);
        given.setLocale(new Locale(1L));
        given.setLocale(locale);
        given.setAnne(i);
        given.setAnne(anne);
        given.setTrim(i);
        given.setTrim(trim);
        given.setDatePresentaion(LocalDateTime.now());
        given.setDatePresentaion(datePresentaion);
        given.setNombreMoisRetard(i);
        given.setNombreMoisRetard(nombreMoisRetard);
        given.setMontantBase(BigDecimal.TEN);
        given.setMontantBase(montantBase);
        given.setMontantRetardPremeirMois(BigDecimal.TEN);
        given.setMontantRetardPremeirMois(montantRetardPremeirMois);
        given.setMontantTotal(BigDecimal.TEN);
        given.setMontantTotal(montantTotal);
        return given;
    }

}
