package homework_26.workshop.dao;

//добавить деталь на склад+
//найти деталь по barCode+
//обновить данные о детали+
//удалить деталь+
//общая масса всех деталей на складе
//средняя масса деталей на складе

import homework_26.workshop.model.Detail;

public interface Stock {

    boolean addDetail(Detail detail);
    Detail removeDetail(int barcode);
    Detail findDetail (int barcode);
    Detail updateDetail (Detail detail);
    double totalWeightOfDetails();
    double averageWeightOfDetails ();


}
