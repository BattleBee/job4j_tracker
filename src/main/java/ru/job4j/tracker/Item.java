package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.util.Objects;

public class Item {

    private int id;
    private String name;
    private LocalDateTime created = LocalDateTime.now();

    public Item() {
    }

    public Item(String name) {
        this.name = name;
    }

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Item(int id, String name, LocalDateTime created) {
        this.id = id;
        this.name = name;
        this.created = created;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Item item = (Item) o;
        return getId() == item.getId()
                && Objects.equals(getName(), item.getName())
                && Objects.equals(getCreated(), item.getCreated());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getCreated());
    }

    @Override
    public String toString() {
        return "Item {" + "id = " + id + ", name = '" + name + '\''
                + ", created = " + created + '}';
    }

}
