package usa.harvard.projectspringsir;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import usa.harvard.projectspringsir.bean.commun.*;
import usa.harvard.projectspringsir.bean.taxe38.CategorieLocale;
import usa.harvard.projectspringsir.bean.taxe38.TauxTaxe38;
import usa.harvard.projectspringsir.bean.taxe38.Trim;
import usa.harvard.projectspringsir.bean.taxe38.TypeLocale38Detail;
import usa.harvard.projectspringsir.dao.communDao.*;
import usa.harvard.projectspringsir.dao.taxe38Dao.CategorieLocaleDao;
import usa.harvard.projectspringsir.dao.taxe38Dao.TauxTaxe38Dao;
import usa.harvard.projectspringsir.dao.taxe38Dao.TrimDao;
import usa.harvard.projectspringsir.dao.taxe38Dao.TypeLocale38DetailDao;

import java.time.LocalDate;
import java.time.Month;

@SpringBootApplication
public class ProjectSpringSirApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProjectSpringSirApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(VilleDao villeDao, SecteurDao secteurDao,
                                        QuartieDao quartieDao, RueDao rueDao,
                                        CategorieLocaleDao categorieLocaleDao,
                                        LocaleDao localeDao,
                                        RedevableDao redevableDao,
                                        TypeLocale38DetailDao typeLocale38DetailDao,
                                        TauxTaxe38Dao tauxTaxe38Dao,
                                        TrimDao trimDao) {
        return args -> {
            // Création des villes
            Ville ville1 = new Ville();
            ville1.setCode("40000");
            ville1.setLibelle("Marrakech");
            villeDao.save(ville1);

            Ville ville2 = new Ville();
            ville2.setCode("10000");
            ville2.setLibelle("Rabat");
            villeDao.save(ville2);

            // Création des secteurs
            Secteur secteur1 = new Secteur();
            secteur1.setCode("Secteur1");
            secteur1.setLibelle("Gueliz");
            secteur1.setVille(ville1);
            secteurDao.save(secteur1);

            Secteur secteur2 = new Secteur();
            secteur2.setCode("Secteur2");
            secteur2.setLibelle("Kasbah");
            secteur2.setVille(ville2);
            secteurDao.save(secteur2);

            // Création des quartiers
            Quartie quartie1 = new Quartie();
            quartie1.setCode("Quartie1");
            quartie1.setLibelle("CHATER 08");
            quartie1.setSecteur(secteur1);
            quartieDao.save(quartie1);

            Quartie quartie2 = new Quartie();
            quartie2.setCode("Quartie2");
            quartie2.setLibelle("CHATER 03");
            quartie2.setSecteur(secteur2);
            quartieDao.save(quartie2);

            // Création des rues
            Rue rue1 = new Rue();
            rue1.setCode("Rue1");
            rue1.setLibelle("Avenue Mohammed V");
            rue1.setQuartie(quartie1);
            rueDao.save(rue1);

            Rue rue2 = new Rue();
            rue2.setCode("Rue2");
            rue2.setLibelle("Rue des Consuls");
            rue2.setQuartie(quartie2);
            rueDao.save(rue2);

            // Création des catégories locales
            CategorieLocale categorieLocale1 = new CategorieLocale();
            categorieLocale1.setCode("Categorie1");
            categorieLocale1.setLibelle("Restaurant");
            categorieLocaleDao.save(categorieLocale1);

            CategorieLocale categorieLocale2 = new CategorieLocale();
            categorieLocale2.setCode("Categorie2");
            categorieLocale2.setLibelle("Café");
            categorieLocaleDao.save(categorieLocale2);

            Locale locale1 = new Locale();
            locale1.setCode("Locale1");
            locale1.setComplementAdressse("tranche 08 n b tamansourte marrakech");
            locale1.setRue(rue1);
            locale1.setCategorieLocale(categorieLocale1);
            localeDao.save(locale1);

            Locale locale2 = new Locale();
            locale2.setCode("Locale2");
            locale2.setComplementAdressse("tranche 03 n b tamansourte mesla");
            locale2.setRue(rue2);
            locale2.setCategorieLocale(categorieLocale2);
            localeDao.save(locale2);

            Redevable redevable1 = new Redevable();
            redevable1.setCode("EE2828");
            redevable1.setName("chafai");
            redevable1.setPrenom("ismail");
            redevable1.setEmail("ismailchafai@gmail.com");
             redevableDao.save(redevable1);

            Redevable redevable2 = new Redevable();
            redevable2.setCode("EE9876");
            redevable2.setName("Ragubi");
            redevable2.setPrenom("AbdAllah");
            redevable2.setEmail("RagubiAbdAllah@gmail.com");
             redevableDao.save(redevable2);

            TypeLocale38Detail typeDetail1 = new TypeLocale38Detail();
            typeDetail1.setCode("Type1");
            typeDetail1.setLibelle("Panneau publicitaire");
            typeLocale38DetailDao.save(typeDetail1);

            TypeLocale38Detail typeDetail2 = new TypeLocale38Detail();
            typeDetail2.setCode("Type2");
            typeDetail2.setLibelle("Enseigne lumineuse");
            typeLocale38DetailDao.save(typeDetail2);

            TauxTaxe38 tauxTaxe38_1 = new TauxTaxe38();
            tauxTaxe38_1.setCode("Taux1");
            tauxTaxe38_1.setMontantParMetreCarre(100.0);
            tauxTaxe38_1.setDateMin(LocalDate.of(2024, Month.JANUARY, 1));
            tauxTaxe38_1.setDateMax(LocalDate.of(2024, Month.DECEMBER, 31));
            tauxTaxe38_1.setPourcentagePremierRetard(5.0);
            tauxTaxe38_1.setPourcentageAutreMoisRetard(2.0);
            tauxTaxe38_1.setTypeLocale38Detail(typeDetail1);
            tauxTaxe38_1.setCategorieLocale(categorieLocale1);
            tauxTaxe38Dao.save(tauxTaxe38_1);

            TauxTaxe38 tauxTaxe38_2 = new TauxTaxe38();
            tauxTaxe38_2.setCode("Taux2");
            tauxTaxe38_2.setMontantParMetreCarre(150.0);
            tauxTaxe38_2.setDateMin(LocalDate.of(2024, Month.JANUARY, 1));
            tauxTaxe38_2.setDateMax(LocalDate.of(2024, Month.DECEMBER, 31));
            tauxTaxe38_2.setPourcentagePremierRetard(7.0);
            tauxTaxe38_2.setPourcentageAutreMoisRetard(3.0);
            tauxTaxe38_2.setTypeLocale38Detail(typeDetail2);
            tauxTaxe38_2.setCategorieLocale(categorieLocale1);
            tauxTaxe38Dao.save(tauxTaxe38_2);

            Trim trim1 = new Trim();
            trim1.setLibelle("Trim 1");
            trim1.setNumero(3);
            trimDao.save(trim1);

            Trim trim2 = new Trim();
            trim2.setLibelle("Trim 2");
            trim2.setNumero(3);
            trimDao.save(trim2);
        };
    }
}
