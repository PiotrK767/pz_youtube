package DataBase;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Komentarz {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int _idZdjecia;
    private int _idUzytkownika;
    private String Komentarz;

    public Uzytkownik(int _idZdjecia, int _idUzytkownika, String Komentarz){

        this._idZdjecia = _idZdjecia;
        this._idUzytkownika = _idUzytkownika;
        this.Komentarz = Komentarz;

    }

    protected Komentarz(){};
       }

