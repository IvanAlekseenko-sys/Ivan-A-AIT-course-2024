//package homework_27.marathon.Pets_marathon.model;
//
//public class HotelImpl {
//    private Pet[] pets;
//
//    // Конструктор принимает массив питомцев
//    public HotelImpl(Pet[] pets) {
//        this.pets = pets;
//    }
//
//    // Метод для расчета выручки, например, на основе возраста питомцев
//    public int calcRevenue() {
//        int totalRevenue = 0;
//        // Предположим, что выручка рассчитывается на основе возраста питомцев
//        for (Pet pet : pets) {
//            totalRevenue += pet.getAge(); // Используем возраст питомцев для расчета выручки
//        }
//        return totalRevenue;
//    }
//
//    // Метод для поиска питомца по его уникальному идентификатору (id)
//    public Pet findPetById(int id) {
//        // Ищем питомца с указанным id
//        for (Pet pet : pets) {
//            if (pet.getId() == id) {
//                return pet; // Возвращаем найденного питомца
//            }
//        }
//        return null; // Если питомец с таким id не найден
//    }
//
//    // Метод для поиска питомцев по типу, например, "Собака" или "Кошка"
//    public Pet[] findPetsByType(String type) {
//        int count = 0;
//        // Считаем, сколько питомцев подходит по типу
//        for (Pet pet : pets) {
//            if (pet.getType().equalsIgnoreCase(type)) {
//                count++;
//            }
//        }
//
//        // Создаем массив для хранения найденных питомцев
//        Pet[] result = new Pet[count];
//        int index = 0;
//        for (Pet pet : pets) {
//            if (pet.getType().equalsIgnoreCase(type)) {
//                result[index++] = pet;
//            }
//        }
//        return result;
//    }
//}
