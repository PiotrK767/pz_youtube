package DataBase;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.Builder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Setter
@Getter
@Builder

public class Sl_Kategorii {



        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int _id;
        private String nazwa;


        public Sl_Kategorii(String nazwa){
            this.nazwa = nazwa;

        }
    protected Sl_Kategorii(){};
    }


