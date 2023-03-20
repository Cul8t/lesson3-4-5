package ru.sbrf.demo;

import ch.qos.logback.classic.Level;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import ru.sbrf.demo.entity.LifeGameField;

import java.io.IOException;
import java.math.BigInteger;

public class APITest {

    @Test
    public void executeRead() throws IOException {
        final Resource resource = resourceOf("classpath:firstGeneration.json");
        final LifeGameField gameField = unmarshall(resource, LifeGameField.class);

        Assert.assertEquals(BigInteger.valueOf(5), gameField.getHeight());
        Assert.assertEquals(BigInteger.valueOf(5), gameField.getHeight());
    }

    @Test
    public void nextGenerationTest() throws IOException {
        final Resource resource = resourceOf("classpath:firstGeneration.json");
        final LifeGameField gameField = unmarshall(resource, LifeGameField.class);

        System.out.println(gameField.print());
        System.out.println(gameField.nextGeneration(gameField).print());
   }
   @Test
   public void loggerTest() throws IOException {

       ch.qos.logback.classic.Logger logger =
               (ch.qos.logback.classic.Logger) LoggerFactory.getLogger("ru.sbrf.demo.logback");
       logger.setLevel(Level.INFO);

       final Resource resource = resourceOf("classpath:firstGeneration.json");
       logger.info("Игровое поле успешно создано");
       final LifeGameField gameField = unmarshall(resource, LifeGameField.class);
//       logger.info("Начальная конфигурация игрового поля задана" + gameField.getAmountOfAliveCells());



       logger.info("Было создано поле");


   }

    private <Type> Type unmarshall(Resource resource, Class<Type> type) throws IOException {
        final ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(resource.getInputStream(), type);
    }

    private Resource resourceOf(String location) {
        DefaultResourceLoader resourceLoader = new DefaultResourceLoader();
        return resourceLoader.getResource(location);
    }


}
