package com.booking.user.book.service;

import java.util.List;

import com.booking.book.vo.BookVO;

public interface BookService {
	public BookVO bookDetail(BookVO bvo);
	public List<BookVO> bookList(BookVO bvo);
	public String isbnCheck(String isbn);
	
	public int bookSearchTotal(BookVO bvo);
	public BookVO bookSelect(String isbn);
}
