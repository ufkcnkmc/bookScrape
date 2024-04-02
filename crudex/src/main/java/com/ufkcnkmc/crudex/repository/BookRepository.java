package com.ufkcnkmc.crudex.repository;

import com.ufkcnkmc.crudex.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
    /*Repository bizim tüm veritabanı işlemlerimizin gerçekleştirileceği katmandır.EmployeeRepositoryi JpaRepositoryden extend ediyoruz.
    Böylece Spring bootun bize sağlamış olduğu bu kolaylıkla JpaRepositoryde tanımlı database işlemlerini doğrudan kullanabiliyoruz.
     */
}
