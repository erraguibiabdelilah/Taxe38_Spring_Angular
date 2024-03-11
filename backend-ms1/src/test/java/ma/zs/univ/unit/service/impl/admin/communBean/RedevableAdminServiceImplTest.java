package ma.zs.univ.unit.service.impl.admin.communBean;

import ma.zs.univ.bean.core.communBean.Redevable;
import ma.zs.univ.dao.facade.core.communBean.RedevableDao;
import ma.zs.univ.service.impl.admin.communBean.RedevableAdminServiceImpl;

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
class RedevableAdminServiceImplTest {

    @Mock
    private RedevableDao repository;
    private AutoCloseable autoCloseable;
    private RedevableAdminServiceImpl underTest;



    @BeforeEach
    void setUp() {
        autoCloseable = MockitoAnnotations.openMocks(this);
        underTest = new RedevableAdminServiceImpl(repository);
    }

    @AfterEach
    void tearDown() throws Exception {
        autoCloseable.close();
    }

    @Test
    void canGetAllRedevable() {
         //when
        underTest.findAll();
        verify(repository).findAll();
    }

    @Test
    void itShouldSaveRedevable() {
        // Given
        Redevable toSave = constructSample(1);
        when(repository.save(toSave)).thenReturn(toSave);

        // When
        underTest.create(toSave);

        // Then
        verify(repository).save(toSave);
    }

    @Test
    void itShouldDeleteRedevable() {
        // Given
        Long idToDelete = 1L;
        when(repository.existsById(idToDelete)).thenReturn(true);

        // When
        underTest.deleteById(idToDelete);

        // Then
        verify(repository).deleteById(idToDelete);
    }
    @Test
    void itShouldGetRedevableById() {
        // Given
        Long idToRetrieve = 1L; // Example Redevable ID to retrieve
        Redevable expected = new Redevable(); // You need to replace Redevable with your actual class
        expected.setId(idToRetrieve);
        when(repository.findById(idToRetrieve)).thenReturn(java.util.Optional.of(expected));

        // When
        Redevable result = underTest.findById(idToRetrieve);

        // Then
        assertEquals(expected, result);
    }
	
	private Redevable constructSample(int i) {
		Redevable given = new Redevable();
        given.setId(id);
        given.setEmail("email-"+i);
        given.setEmail(email);
        given.setPassword("password-"+i);
        given.setPassword(password);
        given.setCin("cin-"+i);
        given.setCin(cin);
        given.setNom("nom-"+i);
        given.setNom(nom);
        given.setPrenom("prenom-"+i);
        given.setPrenom(prenom);
        given.setCredentialsNonExpired(false);
        given.setCredentialsNonExpired(credentialsNonExpired);
        given.setEnabled(false);
        given.setEnabled(enabled);
        given.setAccountNonExpired(false);
        given.setAccountNonExpired(accountNonExpired);
        given.setAccountNonLocked(false);
        given.setAccountNonLocked(accountNonLocked);
        given.setPasswordChanged(false);
        given.setPasswordChanged(passwordChanged);
        given.setUsername("username-"+i);
        given.setUsername(username);
        given.setPassword("password-"+i);
        given.setPassword(password);
        return given;
    }

}
