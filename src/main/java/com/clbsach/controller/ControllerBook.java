package com.clbsach.controller;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.clbsach.entity.Author;
import com.clbsach.entity.Book;
import com.clbsach.entity.Category;
import com.clbsach.entity.Publishing;
import com.clbsach.service.AuthorService;
import com.clbsach.service.BookService;
import com.clbsach.service.CategoryService;
import com.clbsach.service.PublishingService;

@Controller
@RequestMapping(value = "manages/book")
public class ControllerBook {

	@Autowired
	private BookService bookService;
	
	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private AuthorService authorService;
	
	@Autowired
	private PublishingService publishingService;
	
	@RequestMapping(value = "/list")
	public String viewList(Model model) {
		model.addAttribute("listBook", bookService.getAll());
		return "manages/book_list";
	}
	
	@RequestMapping(value = "/create")
	public String viewCreate(Model model) {
		model.addAttribute("book", new Book());
		model.addAttribute("listCategory", categoryService.getAll());
		model.addAttribute("listAuthor", authorService.getAll());
		model.addAttribute("listPublishing", publishingService.getAll());
		return "manages/book_form";
	}
	
	@RequestMapping(value = "/update/{bookId}")
	public String viewUpdate(@PathVariable("bookId") int bookId, Model model) {
		model.addAttribute("book", bookService.findById(bookId));
		return "manages/book_form";
	}
	
	@RequestMapping(value = "/save")
	public String viewSave(@ModelAttribute("book") Book book, Model model, HttpServletRequest request) {
		String path = request.getRealPath("/resorces/page/img/book");
        path = path.substring(0, path.indexOf(".metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps"));
        path = path + "CLBSach\\src\\main\\webapp\\resources\\page\\img\\book";
        DiskFileItemFactory factory = new DiskFileItemFactory();
		ServletFileUpload upload = new ServletFileUpload(factory);
		try {
			List<FileItem> list = upload.parseRequest(request);
			for (FileItem item : list) {
				if (item.isFormField()) {
					String name = item.getFieldName();
					String value = item.getString();
					if (name.equals("bookId")) {
						if (value != null && value.length() > 0)
							book.setBookId(Integer.parseInt(value));
					}else if (name.equals("author.authorId")) {
						Author author = new Author(Integer.parseInt(value));
						book.setAuthor(author);
					}else if(name.equals("publishing.publishingId")) {
						Publishing publishing = new Publishing(Integer.parseInt(value));
						book.setPublishing(publishing);
					}else if(name.equals("category.categoryId")) {
						Category category = new Category(Integer.parseInt(value));
						book.setCategory(category);
					}else if(name.equals("bookName")) {
						book.setBookName(new String(value.getBytes("iso-8859-1"), "UTF-8")); 
					}else if(name.equals("quantity")) {
						book.setQuantity(Integer.parseInt(value));
					}else if(name.equals("yearPublishing")) {
						book.setYearPublishing(new Date(Long.parseLong(value)));
					}
				} else {
					if (item.getFieldName().equals("image")) {
						item.write(new File(path + "/" + item.getName()));
						book.setImage(item.getName());
					} 
				}
			}
		} catch (FileUploadException ex) {
			Logger.getLogger(ControllerBook.class.getName()).log(Level.SEVERE, null, ex);
		} catch (UnsupportedEncodingException ex) {
			Logger.getLogger(ControllerBook.class.getName()).log(Level.SEVERE, null, ex);
		} catch (ParseException ex) {
			Logger.getLogger(ControllerBook.class.getName()).log(Level.SEVERE, null, ex);
		} catch (Exception ex) {
			Logger.getLogger(ControllerBook.class.getName()).log(Level.SEVERE, null, ex);
		}

		boolean bl = false;
		if(book.getBookId() == null)
			bl = bookService.save(book);
		else
			bl = bookService.update(book);
		if(bl)
			return "redirect:list";
		else
			return "manages/book_form";
	}
	
	@RequestMapping(value = "/delete/{bookId}")
	public String viewDelete(@PathVariable("bookId") int bookId, Model model) {
		Book book = bookService.findById(bookId);
		boolean bl = bookService.delete(book);
		if(bl)
			return "manages/book_list";
		else
			return "manages/book_list";
	}
}
