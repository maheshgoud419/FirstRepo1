package com.nt.processor;

import org.springframework.batch.item.ItemProcessor;

public class CustomIteamProcessor implements ItemProcessor<String, String> {

	@Override
	public String process(String booksListWithAuthors) throws Exception {
		System.out.println("CustomIteamProcessor.process()");
		if (booksListWithAuthors.equalsIgnoreCase("CRJ")) {
			return booksListWithAuthors + " --> herbert sheild";
		} else if (booksListWithAuthors.equalsIgnoreCase("Spring")) {
			return booksListWithAuthors + " --> Nataraz Chowary";

		} else if (booksListWithAuthors.equalsIgnoreCase("complete java")) {
			return booksListWithAuthors + " --> Mahesh Bandaru";

		}
		return booksListWithAuthors;
	}

}
