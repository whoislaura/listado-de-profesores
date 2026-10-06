public class Main {

    public static void main(String[] args) {
        ListadoProfesor lista = new ListadoProfesor();

        lista.add(new Profesor("Ana", 25, CategoriaDocente.INSTRUCTOR));
        lista.add(new Profesor("Carlos", 30, CategoriaDocente.INSTRUCTOR));
        lista.add(new Profesor("Luis", 40, CategoriaDocente.TITULAR));
        lista.add(new Profesor("Marta", 35, CategoriaDocente.ASISTENTE));
        lista.add(new Profesor("Jose", 28, CategoriaDocente.INSTRUCTOR));
        lista.add(new Profesor("Laura", 35, CategoriaDocente.AUXILIAR));

        System.out.println("=== LISTA ORIGINAL ===");
        for (int i = 0; i < lista.size(); i++) {
            Profesor profesor = lista.get(i);
            System.out.println(profesor.mostrar());
        }

        System.out.println("\n\n=== PROXIMOS CAMBIOS ===");
        System.out.println(lista.proxCambio());

        System.out.println("\n=== LISTA ORDENADA ===");
        System.out.println(lista.mostrarLista());

        System.out.println("=== CANTIDAD POR CATEGORIA ===");
        System.out.println(lista.cantProfesores());

        System.out.println("=== PRUEBAS ===");

        comprobar(
                "Profesores proximos a cambiar",
                "[Carlos, Jose]",
                lista.proxCambio()
        );

        comprobar(
                "Lista ordenada por edad",
                "Nombre: Luis | Edad: 40 | Categoria docente: TITULAR\n"
                        + "Nombre: Marta | Edad: 35 | Categoria docente: ASISTENTE\n"
                        + "Nombre: Laura | Edad: 35 | Categoria docente: AUXILIAR\n"
                        + "Nombre: Carlos | Edad: 30 | Categoria docente: INSTRUCTOR\n"
                        + "Nombre: Jose | Edad: 28 | Categoria docente: INSTRUCTOR\n"
                        + "Nombre: Ana | Edad: 25 | Categoria docente: INSTRUCTOR\n",
                lista.mostrarLista()
        );

        comprobar(
                "Cantidad por categoria",
                "Instructores: 3\n"
                        + "Asistentes: 1\n"
                        + "Auxiliares: 1\n"
                        + "Titulares: 1\n",
                lista.cantProfesores()
        );

        ListadoProfesor listaVacia = new ListadoProfesor();

        comprobar(
                "Lista vacia en proxCambio",
                "[]",
                listaVacia.proxCambio()
        );

        comprobar(
                "Lista vacia en mostrarLista",
                "",
                listaVacia.mostrarLista()
        );
    }

    public static void comprobar(
            String nombrePrueba,
            String resultadoEsperado,
            String resultadoObtenido
    ) {
        if (resultadoEsperado.equals(resultadoObtenido)) {
            System.out.println("[OK] " + nombrePrueba);
        } else {
            System.out.println("[ERROR] " + nombrePrueba);
            System.out.println("Esperado: " + resultadoEsperado);
            System.out.println("Obtenido: " + resultadoObtenido);
        }
    }
}
