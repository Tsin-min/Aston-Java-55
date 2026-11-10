import java.util.*;

public class PhoneBook {

    // Фамилия -> список телефонов (фамилий может быть несколько телефонов у однофамильцев)
    private final Map<String, List<String>> book = new HashMap<>();

    /**
     * Добавляет запись в справочник.
     * @param lastName фамилия
     * @param phoneNumber телефонный номер
     */
    public void add(String lastName, String phoneNumber) {
        // getOrDefault: если записи ещё нет — создаём новый пустой список
        book.computeIfAbsent(lastName, k -> new ArrayList<>()).add(phoneNumber);
    }

    /**
     * Ищет телефоны по фамилии.
     * @param lastName фамилия для поиска
     * @return список телефонов; если фамилия не найдена — пустой список
     */
    public List<String> get(String lastName) {
        return book.getOrDefault(lastName, Collections.emptyList());
    }

    // Для наглядности: печать всего справочника
    public void printAll() {
        for (Map.Entry<String, List<String>> entry : book.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Иванов", "+7-900-111-11-11");
        phoneBook.add("Петров", "+7-900-222-22-22");
        phoneBook.add("Иванов", "+7-900-333-33-33"); // однофамилец — второй номер
        phoneBook.add("Сидоров", "+7-900-444-44-44");
        phoneBook.add("Иванов", "+7-900-555-55-55"); // и третий

        System.out.println("Телефоны Иванова: " + phoneBook.get("Иванов"));
        System.out.println("Телефоны Петрова: " + phoneBook.get("Петров"));
        System.out.println("Телефоны Смирнова: " + phoneBook.get("Смирнова")); // пусто

        System.out.println("\nВесь справочник:");
        phoneBook.printAll();
    }
}