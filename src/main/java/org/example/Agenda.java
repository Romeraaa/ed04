package org.example;

import java.util.*;

/**
 * Clase que representa una agenda que gestiona una lista de contactos.
 * Permite añadir, eliminar y modificar teléfonos de los contactos.
 */
public class Agenda {

    /**
     * Lista de contactos almacenados en la agenda.
     */
    private List<Contacto> contacts; // Lista de Contacto

    /**
     * Constructor que inicializa la lista de contactos vacía.
     */
    public Agenda() {
        this.contacts = new ArrayList<>();
    }

    /**
     * Añade un teléfono a un contacto existente o crea un nuevo contacto
     * si no existe en la agenda.
     *
     * @param name Nombre del contacto.
     * @param phone Teléfono a añadir al contacto.
     */
    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Contacto c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Contacto newContact = new Contacto(name, phone);
            contacts.add(newContact);
        }
    }

    /**
     * Elimina un contacto de la agenda dado su nombre.
     * La comparación no distingue entre mayúsculas y minúsculas.
     *
     * @param name Nombre del contacto a eliminar.
     */
    public void removeContact(String name) {
        Iterator<Contacto> it = contacts.iterator();

        while (it.hasNext()) {
            Contacto c = it.next();

            if (c.getName().equalsIgnoreCase(name)) {
                it.remove();
            }
        }
    }

    /**
     * Modifica un número de teléfono específico de un contacto.
     * Si el teléfono antiguo existe, se reemplaza por el nuevo.
     *
     * @param name Nombre del contacto cuyo teléfono se modifica.
     * @param oldPhone Teléfono antiguo que se quiere cambiar.
     * @param newPhone Nuevo teléfono que reemplaza al antiguo.
     */
    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Contacto c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                List<String> phones = c.getPhones();

                int index = phones.indexOf(oldPhone);

                if (index != -1) {
                    phones.set(index, newPhone);
                }
            }
        }
    }

    /**
     * Devuelve la lista completa de contactos en la agenda.
     *
     * @return Lista de contactos.
     */
    public List<Contacto> getContacts() {
        return this.contacts;
    }
}
