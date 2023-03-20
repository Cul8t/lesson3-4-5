package ru.sbrf.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import ru.sbrf.demo.entity.LifeGameField;

import java.io.IOException;

public class NeighborTests {

    @Test
    public void test_2_1() throws IOException {
        final Resource resource = resourceOf("classpath:firstGeneration.json");
        final LifeGameField gameField = unmarshall(resource, LifeGameField.class);

        System.out.println(gameField.print());

        Assert.assertEquals(1, gameField.getCountOfNeighborAliveCells(gameField.getCell(2, 1)).intValue());
    }

    @Test
    public void test_0_2() throws IOException {
        final Resource resource = resourceOf("classpath:firstGeneration.json");
        final LifeGameField gameField = unmarshall(resource, LifeGameField.class);

        Assert.assertEquals(1, gameField.getCountOfNeighborAliveCells(gameField.getCell(0, 2)).intValue());
    }

    @Test
    public void test_2_2() throws IOException {
        final Resource resource = resourceOf("classpath:firstGeneration.json");
        final LifeGameField gameField = unmarshall(resource, LifeGameField.class);

        Assert.assertEquals(3, gameField.getCountOfNeighborAliveCells(gameField.getCell(2, 2)).intValue());
    }

    @Test
    public void test_1_3() throws IOException {
        final Resource resource = resourceOf("classpath:firstGeneration.json");
        final LifeGameField gameField = unmarshall(resource, LifeGameField.class);

        Assert.assertEquals(3, gameField.getCountOfNeighborAliveCells(gameField.getCell(1, 3)).intValue());
    }

    @Test
    public void test_2_3() throws IOException {
        final Resource resource = resourceOf("classpath:firstGeneration.json");
        final LifeGameField gameField = unmarshall(resource, LifeGameField.class);

        Assert.assertEquals(2, gameField.getCountOfNeighborAliveCells(gameField.getCell(2, 3)).intValue());
    }

    @Test
    public void test_3_1() throws IOException {
        final Resource resource = resourceOf("classpath:firstGeneration.json");
        final LifeGameField gameField = unmarshall(resource, LifeGameField.class);

        Assert.assertEquals(2, gameField.getCountOfNeighborAliveCells(gameField.getCell(3, 1)).intValue());
    }
    @Test
    public void test_3_2() throws IOException {
        final Resource resource = resourceOf("classpath:firstGeneration.json");
        final LifeGameField gameField = unmarshall(resource, LifeGameField.class);

        Assert.assertEquals(3, gameField.getCountOfNeighborAliveCells(gameField.getCell(3, 2)).intValue());
    }
    @Test
    public void test_3_2_SecondGeneration() throws IOException {
        final Resource resource = resourceOf("classpath:firstGeneration.json");
        final LifeGameField gameField = unmarshall(resource, LifeGameField.class);

        Assert.assertEquals(true, gameField.nextGeneration(gameField).getCell(3,2).getIsAlive());
    }
    @Test
    public void test_3_1_SecondGeneration() throws IOException {
        final Resource resource = resourceOf("classpath:firstGeneration.json");
        final LifeGameField gameField = unmarshall(resource, LifeGameField.class);

        Assert.assertEquals(false, gameField.nextGeneration(gameField).getCell(3,1).getIsAlive());
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
