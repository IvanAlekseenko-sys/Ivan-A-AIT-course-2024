package homework_33.to_do_list;
//Начать реализацию приложения "Список дел".
//Использовать enum для организации меню (номер пункта, действие) приложения:
//добавить задачу
//посмотреть все задачи
//удалить задачу (по номеру)
//выйти из меню
//Реализовать метод printMenu().
public enum ToDoListEnum {

    ADD_TASK(1, "Добавить задачу"),
    SHOW_TASK(2, "Посмотреть все задачи"),
    DELETE_TASK(3, "Удалить задачу"),
    EXIT(4, "Выйти из меню");

    private int number;
    private String description;

    ToDoListEnum(int number, String description) {
        this.number = number;
        this.description = description;
    }

    public int getNumber() {
        return number;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ToDoList{");
        sb.append("number=").append(number);
        sb.append(", description='").append(description).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
