package homework_26.workshop.test;

import homework_26.workshop.dao.Stock;
import homework_26.workshop.dao.StockImpl;
import homework_26.workshop.model.Detail;
import homework_26.workshop.model.Gear;
import homework_26.workshop.model.Lever;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StockImplTest {
    Stock stock;
    Detail[] detail;

    @BeforeEach
    void setUp() {
        stock = new StockImpl(4);
        detail = new Detail[3];
        detail[0] = new Gear(123456L,5,"metal","V1",10.0, 5,20);
        detail[1] = new Gear(123457L,7,"metal","V1",14.0, 7,25);
        detail[2] = new Lever(123458L,10,"wood","V2",10.0, 15.0);
    }

    @Test
    void addDetail() {
    }

    @Test
    void removeDetail() {
    }

    @Test
    void findDetail() {
    }

    @Test
    void updateDetail() {
    }

    @Test
    void totalWeightOfDetails() {
    }

    @Test
    void averageWeightOfDetails() {
    }
}