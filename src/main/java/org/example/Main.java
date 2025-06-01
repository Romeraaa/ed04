package org.example;

public class Main {
    public static void main(String[] args) {
        Agenda agenda1 = initAgenda();

        System.out.println("\nDespués de añadir, eliminar y modificar contactos: ");
        for (Persona c : agenda1.getContacts()) {
            System.out.println(c.getName() + " -> " + c.getPhones());
        }
    }

    /**
     * Inicializa una agenda con contactos de ejemplo y operaciones de prueba.
     *
     * @return Objeto Agenda ya configurado.
     */
    public static Agenda initAgenda() {
        Agenda agenda1 = new Agenda();

        // Añadir contactos a la agenda.
        agenda1.addContact("John Doe", "1234567890");
        agenda1.addContact("Jane Doe", "9876543210");
        agenda1.addContact("Mary Jane", "1122334455");

        // Imprimir todos los contactos de la agenda.
        System.out.println("Todos los contactos: ");
        for (Persona c : agenda1.getContacts()) {
            System.out.println(c.getName() + " -> " + c.getPhones());
        }

        // Añadir un nuevo teléfono a un contacto existente.
        agenda1.addContact("John Doe", "6543219876");

        // Eliminar un contacto de la agenda.
        agenda1.removeContact("Jane Doe");

        // Modificar el teléfono de un contacto existente en la agenda.
        agenda1.modifyPhoneNumber("John Doe", "1234567890", "6666666666");

        return agenda1;
    }
}
