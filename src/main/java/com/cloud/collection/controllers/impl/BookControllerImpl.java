package com.cloud.collection.controllers.impl;

import com.cloud.collection.controllers.BookController;
import com.cloud.collection.controllers.generic.impl.ItemGenericControllerImpl;
import com.cloud.collection.dto.request.CreateBook;
import com.cloud.collection.models.item.Book;
import com.cloud.collection.service.impl.BookServiceImpl;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/book")
@Tag(name = "Book Controller", description = "For Book Item")
@RequiredArgsConstructor
@AllArgsConstructor
public class BookControllerImpl extends ItemGenericControllerImpl<Book> implements BookController {

    Logger log = LogManager.getLogger(BookControllerImpl.class);

    @Autowired
    BookServiceImpl bookService;

    @PostMapping
    public Book addBook(@RequestBody CreateBook book){
        log.info("Reached book post: {}", book);

        try{
            return bookService.saveBook(book);
        }catch (Exception e){
            e.printStackTrace();
        }
        return  null;
    }

}
