package guru.springframework.repositories;

import guru.springframework.domain.UnitOfMeasure;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UnitOfMeasureRepositoryIT {

    @Autowired
    UnitOfMeasureRepository unitOfMeasureRepository;


    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void findByDescription() {
        Optional<UnitOfMeasure> unitOfMeasure = unitOfMeasureRepository.findByDescription("Teaspoon");
        Assert.assertEquals("Teaspoon",unitOfMeasure.get().getDescription());
    }

    @Test
    public void findByDescriptionCup() {
        Optional<UnitOfMeasure> unitOfMeasure = unitOfMeasureRepository.findByDescription("Cup");
        Assert.assertEquals("Cup",unitOfMeasure.get().getDescription());
    }
}