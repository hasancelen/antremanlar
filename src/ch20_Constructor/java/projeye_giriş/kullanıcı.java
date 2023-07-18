package ch20_Constructor.java.projeye_giriş;

import java.time.LocalDateTime;

public class kullanıcı {
    String name;
    LocalDateTime kayıtzamanı;

    public kullanıcı(String name, LocalDateTime kayıtzamanı) {
        this.name = name;
        this.kayıtzamanı = kayıtzamanı;
    }

    public kullanıcı() {
    }

    @Override
    public String toString() {
        return "kullanıcı{" +
                "name='" + name + '\'' +
                ", kayıtzamanı=" + kayıtzamanı +
                '}';
    }
}
