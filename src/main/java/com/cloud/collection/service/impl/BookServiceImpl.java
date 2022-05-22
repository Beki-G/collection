package com.cloud.collection.service.impl;

import com.cloud.collection.dto.request.CreateBook;
import com.cloud.collection.models.item.Book;
import com.cloud.collection.service.BookService;
import com.cloud.collection.service.generic.impl.ItemGenericServiceImpl;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl extends ItemGenericServiceImpl<Book>  implements BookService {
    Logger log = LogManager.getLogger(BookServiceImpl.class);

    public Book saveBook(CreateBook bookInfo) throws Exception{
        ObjectMapper mapper= new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        Book itemMapped = mapper.convertValue(bookInfo, Book.class);
        log.info("Book Mapped: {}", itemMapped);
        return save(itemMapped);
    }
}
