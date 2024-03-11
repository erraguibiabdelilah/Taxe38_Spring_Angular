package ma.zs.univ.unit.dao.facade.core.communBean;

import ma.zs.univ.bean.core.communBean.Locale;
import ma.zs.univ.dao.facade.core.communBean.LocaleDao;

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
public class LocaleDaoTest {

@Autowired
    private LocaleDao underTest;


    @Test
    void shouldFindById(){
        Long id = 1L;
        Locale entity = new Locale();
        entity.setId(id);
        underTest.save(entity);
        Locale loaded = underTest.findById(id).get();
        assertThat(loaded.getId()).isEqualTo(id);
    }

    @Test
    void shoulDeleteById() {
        Long id = 1L;
        Locale entity = new Locale();
        entity.setId(id);
        underTest.save(entity);

        underTest.deleteById(id);

        Locale loaded = underTest.findById(id).get();
        assertThat(loaded).isNull();
    }


    @Test
    void shouldFindAll() {
        // Given
        List<Locale> items = IntStream.rangeClosed(1, 10).mapToObj(i->constructSample(i)).collect(Collectors.toList());

        // Init
        items.forEach(underTest::save);

        // When
        List<Locale> loadedItems = underTest.findAll();

        // Then
        assertThat(loadedItems).isNotNull();
        assertThat(loadedItems.size()).isEqualTo(10);
    }
    @Test
    void shouldSave(){
        Locale given = constructSample(1);
        Locale saved = underTest.save(given);
        assertThat(saved.getId()).isNotNull();
    }

    private Locale constructSample(int i) {
		Locale given = new Locale();
        given.setCode("code-"+i);
        given.setComplementAdresse("complementAdresse-"+i);
        given.setRue(new Rue(1L));
        given.setRedevable(new Redevable(1L));
        given.setCategorieLocale(new CategorieLocale(1L));
        return given;
    }

}
