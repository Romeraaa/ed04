package org.example;

import java.util.List;

/**
 * Interfaz que define las operaciones básicas de una agenda de contactos.
 */
public interface iAgenda {
    void addContact(String name, String phone);
    void removeContact(String name);
    void modifyPhoneNumber(String name, String oldPhone, String newPhone);
    List<Persona> getContacts();
}
