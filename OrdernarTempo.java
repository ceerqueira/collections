package br.com.alura;

import java.util.Comparator;

public class OrdernarTempo implements Comparator<Aula> {

    @Override
    public int compare(Aula o1, Aula o2) {
        if(o1.getTempo()>o2.getTempo())
            return -1;
        if(o1.getTempo()<o2.getTempo())
            return 1;
        return 0;
        
    }
    
}
