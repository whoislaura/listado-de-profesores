public class ListadoProfesor extends LinkedList<Profesor>{

    public String proxCambio(){
        String ans = "[";
        boolean primero = true;

        for (int i = 0; i < size(); i++) {
            Profesor profe = (Profesor) get(i);
            if(profe.getCD().equals(CategoriaDocente.INSTRUCTOR) && profe.getEdad() > 26){
                if(!primero) ans += ", ";
                ans += profe.getNombre();
                primero = false;
            }
        }
        ans += "]";

        return ans;
    }

    public String mostrarLista(){

        LinkedList<Profesor> sorted = new LinkedList<>();

        for (int i = 0; i < size(); i++) {
            Profesor profe = (Profesor) get(i);
            int pos = 0;

            while (pos < sorted.size()
                    && sorted.get(pos).getEdad() >= profe.getEdad()) {
                pos++;
            }

            sorted.add(profe, pos);

        }
        String ans = "";

        for (int i = 0; i < sorted.size(); i++) {
            ans += sorted.get(i).mostrar();
            ans += "\n";
        }

        return ans;
    }

    public String cantProfesores(){
        int ins, asis, aux, tit;
        ins = asis = aux = tit = 0;

        for (int i = 0; i < size(); i++) {
            Profesor profe = (Profesor) get(i);
            switch(profe.getCD()){
                case INSTRUCTOR -> {
                    ins++;
                    break;
                }
                case ASISTENTE -> {
                    asis++;
                    break;
                }
                case AUXILIAR -> {
                    aux++;
                    break;
                }
                case TITULAR -> {
                    tit++;
                    break;
                }
            }
        }

        return "Instructores: " + ins + "\nAsistentes: " + asis + "\nAuxiliares: " + aux + "\nTitulares: " + tit + "\n";
    }
}
