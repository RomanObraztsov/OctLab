package com.digdes.school;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Table {
    private List<String> columns;
    private List<Map<String, Object>> data;

    public Table(List<String> columns) {
        this.columns = columns;
        data = new ArrayList<>();
    }

    public void insert(Map<String, Object> row) {
        data.add(row);
    }

    public void update(int index, Map<String, Object> row) {
        if (index >= 0 && index < data.size()) {
            data.set(index, row);
        } else {
            throw new IndexOutOfBoundsException("Invalid index");
        }
    }

    public void delete(int index) {
        if (index >= 0 && index < data.size()) {
            data.remove(index);
        } else {
            throw new IndexOutOfBoundsException("Invalid index");
        }
    }

    public void selectAll() {
        printHeader();
        printRows();
    }

    private void printHeader() {
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.print("|");
        for (String column : columns) {
            System.out.printf(" %-15s |", column);
        }
        System.out.println("\n--------------------------------------------------------------------------------------------");
    }

    private void printRows() {
        for (Map<String, Object> row : data) {
            System.out.print("|");
            for (String column : columns) {
                Object value = row.get(column);
                System.out.printf(" %-15s |", value != null ? value : "");
            }
            System.out.println("\n--------------------------------------------------------------------------------------------");
        }
    }
}



