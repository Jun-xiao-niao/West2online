package round2task1;

import java.time.LocalDate;

interface CatCafe {

    void buyCat(String breed, String name, int age, String sex);

    void serveCustomer(String name, int rua);

    void rest(LocalDate localDate);

}

