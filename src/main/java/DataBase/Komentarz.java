package DataBase;


import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.Builder;

import javax.persistence.Entity;

@Entity
@Setter
@Getter
@Builder

public class Komentarz {


    private int idZdjecia;
    private int idUzytkownika;
    private String komentarz;

    public Komentarz(int idZdjecia, int idUzytkownika, String komentarz){

        this.idZdjecia = idZdjecia;
        this.idUzytkownika = idUzytkownika;
        this.komentarz = komentarz;

    }

    protected Komentarz(){};
       }

