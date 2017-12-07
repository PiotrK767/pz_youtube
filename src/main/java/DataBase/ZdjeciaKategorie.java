package DataBase;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.Builder;
import sun.plugin2.gluegen.runtime.StructAccessor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ZdjeciaKategorie {


    @Entity
    @Setter
    @Getter
    @Builder

    public class ZdjeciaKategorie{
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int _id;
        private int idZdjecia;
        private int idKategorii;

        public ZdjeciaKategorie(int idZdjecia, int idKategorii){
            this.idZdjecia = idZdjecia;
            this.idKategorii = idKategorii;
        }

    }
}
