package com.digdes.school;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JavaStarter {
    public static void main(String[] args) {

        Table table = new Table(List.of("lastName", "id", "age", "cost", "active"));

        // Вставка данных
        Map<String, Object> row1 = new HashMap<>();
        row1.put("lastName", "Bulavin");
        row1.put("id", "1");
        row1.put("age", "19");
        row1.put("cost", "1.5");
        row1.put("active", "False");
        table.insert(row1);

        // Выборка всех данных
        table.selectAll();

        Map<String, Object> row2 = new HashMap<>();
        row2.put("lastName", "Obraztsov");
        row2.put("id", "2");
        table.insert(row2);

        // Выборка всех данных
        table.selectAll();

        // Обновление данных
        Map<String, Object> updatedRow = new HashMap<>();
        updatedRow.put("lastName", "Obraztsov");
        updatedRow.put("id", 2);
        updatedRow.put("age", "20");
        updatedRow.put("active", "True");
        table.update(1, updatedRow);

        // Выборка всех данных
        table.selectAll();

        // Удаление данных
        table.delete(0);

        // Выборка всех данных
        table.selectAll();
    }
}

