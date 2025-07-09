package com.cdac.acts.book;

import java.time.LocalDate;

import com.cdac.acts.enums.BookTypeEnum;

public class Book {
	private String title;
	private BookTypeEnum type;
	private Double price;
	private LocalDate publishDate;
	private String authorName;
	private Integer qty;
	
	public Book(String title, BookTypeEnum type, Double price, LocalDate publishDate, String authorName, Integer qty) {
		super();
		this.title = title;
		this.type = type;
		this.price = price;
		this.publishDate = publishDate;
		this.authorName = authorName;
		this.qty = qty;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public BookTypeEnum getType() {
		return type;
	}

	public void setType(BookTypeEnum type) {
		this.type = type;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public LocalDate getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", type=" + type + ", price=" + price + ", publishDate=" + publishDate
				+ ", authorName=" + authorName + ", qty=" + qty + "]";
	}
	
	
}
