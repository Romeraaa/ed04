package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa un contacto con un nombre y una lista de números de teléfono asociados.
 */
class Contacto {

    /**
     * Nombre del contacto.
     */
    private String name;

    /**
     * Lista de números de teléfono asociados al contacto.
     */
    private List<String> phones;

    /**
     * Constructor que crea un contacto con un nombre y un teléfono inicial.
     *
     * @param name Nombre del contacto.
     * @param phone Teléfono inicial asociado al contacto.
     */
    public Contacto(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    /**
     * Obtiene el nombre del contacto.
     *
     * @return Nombre del contacto.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Obtiene la lista de teléfonos asociados al contacto.
     *
     * @return Lista de teléfonos.
     */
    public List<String> getPhones() {
        return this.phones;
    }
}
