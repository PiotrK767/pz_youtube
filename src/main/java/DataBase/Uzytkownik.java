package DataBase;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.Builder;
import lombok.Generated;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Uzytkownik {

@Entity
@Setter
@Getter
@Builder

public class Uzytkownik{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int _id;

    private String imie;
    private String nazwaUzytkownika;
    private String haslo;

    Uzytkownik( String imie, String nazwa_uzytkownika, String haslo){
        this.imie = imie;
        this.nazwaUzytkownika = nazwaUzytkownika;
        this.haslo = haslo;
    }
    protected Uzytkownik(){};



}

}
