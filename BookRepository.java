package com.ufkcnkmc.crudex.repository;

import com.ufkcnkmc.crudex.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    /*Repository bizim tüm veritabanı işlemlerimizin gerçekleştirileceği katmandır.EmployeeRepositoryi JpaRepositoryden extend ediyoruz.
    Böylece Spring bootun bize sağlamış olduğu bu kolaylıkla JpaRepositoryde tanımlı database işlemlerini doğrudan kullanabiliyoruz.
     */
    @Query("SELECT b FROM Book b WHERE b.author LIKE %:query% OR b.title LIKE %:query%")
    List<Book> findByQuery(@Param("query") String query);

}
