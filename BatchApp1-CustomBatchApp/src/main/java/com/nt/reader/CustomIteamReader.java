package com.nt.reader;

import java.util.List;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

public class CustomIteamReader implements ItemReader<String> {

	int bookCount = 0;
	List<String> bookList = null;

	public void setBookList(List<String> bookList) {
		this.bookList = bookList;
	}

	@Override
	public String read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		System.out.println("CustomIteamReader.read()");
		if (bookCount < bookList.size()) {
			return bookList.get(bookCount++);
		} else
			return null;
	}

}
