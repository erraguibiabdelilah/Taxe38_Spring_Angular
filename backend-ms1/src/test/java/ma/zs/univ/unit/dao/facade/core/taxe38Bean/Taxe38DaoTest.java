package ma.zs.univ.unit.dao.facade.core.taxe38Bean;

import ma.zs.univ.bean.core.taxe38Bean.Taxe38;
import ma.zs.univ.dao.facade.core.taxe38Bean.Taxe38Dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.IntStream;
import java.time.LocalDateTime;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class Taxe38DaoTest {

@Autowired
    private Taxe38Dao underTest;

    @Test
    void shouldFindByCode(){
        String code = "code-1";
        Taxe38 entity = new Taxe38();
        entity.setCode(code);
        underTest.save(entity);
        Taxe38 loaded = underTest.findByCode(code);
        assertThat(loaded.getCode()).isEqualTo(code);
    }

    @Test
    void shouldDeleteByCode() {
        String code = "code-1";
        Taxe38 entity = new Taxe38();
        entity.setCode(code);
        underTest.save(entity);

        int result = underTest.deleteByCode(code);

        Taxe38 loaded = underTest.findByCode(code);
        assertThat(loaded).isNull();
        assertThat(result).isEqualTo(1);
    }

    @Test
    void shouldFindById(){
        Long id = 1L;
        Taxe38 entity = new Taxe38();
        entity.setId(id);
        underTest.save(entity);
        Taxe38 loaded = underTest.findById(id).get();
        assertThat(loaded.getId()).isEqualTo(id);
    }

    @Test
    void shoulDeleteById() {
        Long id = 1L;
        Taxe38 entity = new Taxe38();
        entity.setId(id);
        underTest.save(entity);

        underTest.deleteById(id);

        Taxe38 loaded = underTest.findById(id).get();
        assertThat(loaded).isNull();
    }


    @Test
    void shouldFindAll() {
        // Given
        List<Taxe38> items = IntStream.rangeClosed(1, 10).mapToObj(i->constructSample(i)).collect(Collectors.toList());

        // Init
        items.forEach(underTest::save);

        // When
        List<Taxe38> loadedItems = underTest.findAll();

        // Then
        assertThat(loadedItems).isNotNull();
        assertThat(loadedItems.size()).isEqualTo(10);
    }
    @Test
    void shouldSave(){
        Taxe38 given = constructSample(1);
        Taxe38 saved = underTest.save(given);
        assertThat(saved.getId()).isNotNull();
    }

    private Taxe38 constructSample(int i) {
		Taxe38 given = new Taxe38();
        given.setCode("code-"+i);
        given.setRedevable(new Redevable(1L));
        given.setLocale(new Locale(1L));
        given.setAnne(i);
        given.setTrim(i);
        given.setDatePresentaion(LocalDateTime.now());
        given.setNombreMoisRetard(i);
        given.setMontantBase(BigDecimal.TEN);
        given.setMontantRetardPremeirMois(BigDecimal.TEN);
        given.setMontantTotal(BigDecimal.TEN);
        return given;
    }

}
