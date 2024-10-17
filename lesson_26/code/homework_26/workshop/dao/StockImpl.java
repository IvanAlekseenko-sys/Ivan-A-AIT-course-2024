package homework_26.workshop.dao;

import homework_26.workshop.model.Detail;

public class StockImpl implements Stock{
    private Detail[] details;
    int size;

    //capacity - возможное кол-во деталей
    public StockImpl(int capacity) {
        this.details = new Detail[capacity];
        this.size = size;
    }

    @Override
    public boolean addDetail(Detail detail) {
        return false;
    }

    @Override
    public Detail removeDetail(int barcode) {
        return null;
    }

    @Override
    public Detail findDetail(int barcode) {
        return null;
    }

    @Override
    public Detail updateDetail(Detail detail) {
        return null;
    }

    @Override
    public double totalWeightOfDetails() {
        return 0;
    }

    @Override
    public double averageWeightOfDetails() {
        return 0;
    }
}
