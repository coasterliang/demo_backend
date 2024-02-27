package org.example.controller;

import lombok.AllArgsConstructor;
import org.example.entity.Book;
import org.example.service.BookService;
import org.example.util.R;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@Controller
@AllArgsConstructor
@RequestMapping("/book")
public class BookController {

    private final BookService bookService;

    @GetMapping("/list")
    public R list() {
        return R.ok(bookService.listBooks());
    }

    @PostMapping("/update")
    public R addUpdate(@RequestBody Book bookDetails) {
        return R.ok(bookService.saveClient(bookDetails));
    }

    @GetMapping("/delete/{id}")
    public R delete(@PathVariable("id") Long id) {
        return R.ok(bookService.deleteBook(id));
    }

}
