package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa un contacto con un nombre y una lista de números de teléfono asociados.
 */
class Persona {

    private String name;
    private List<String> phones;

    public Persona(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhones() {
        return this.phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }
}
