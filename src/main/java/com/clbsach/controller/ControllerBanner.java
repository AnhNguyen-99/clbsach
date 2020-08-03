package com.clbsach.controller;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
import org.springframework.web.bind.annotation.RequestMethod;

import com.clbsach.entity.Account;
import com.clbsach.entity.Banner;
import com.clbsach.service.BannerService;

@Controller
@RequestMapping(value = "manages/banner")
public class ControllerBanner {

	@Autowired
	private BannerService bannerService;
		
	@RequestMapping(value = "/list")
	public String viewList(Model model) {
		model.addAttribute("listBanner", bannerService.getAll());
		return "manages/banner_list";
	}
	
	@RequestMapping(value = "/create")
	public String viewCreate(Model model, HttpSession session) {
		Banner banner = new Banner();
		Account account = (Account) session.getAttribute("myLogin");
		banner.setAccount(account);
		System.out.println(banner);
		model.addAttribute("banner", banner);
		return "manages/banner_form";
	}
	
	@RequestMapping(value = "/update/{bannerId}")
	public String viewUpdate(@PathVariable("bannerId") int bannerId, Model model) {
		model.addAttribute("banner", bannerService.findById(bannerId));
		return "manages/banner_form";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String viewSaveProduct(@ModelAttribute("banner") Banner banner, Model model, HttpServletRequest request, HttpSession session) {
		String path = request.getRealPath("/resorces/page/img/banner");
        path = path.substring(0, path.indexOf(".metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps"));
        path = path + "CLBSach\\src\\main\\webapp\\resources\\page\\img\\banner";
        DiskFileItemFactory factory = new DiskFileItemFactory();
		ServletFileUpload upload = new ServletFileUpload(factory);
		try {
			List<FileItem> list = upload.parseRequest(request);
			for (FileItem item : list) {
				if (item.isFormField()) {
					String name = item.getFieldName();
					String value = item.getString();
					if (name.equals("bannerId")) {
						if (value != null && value.length() > 0)
							banner.setBannerId(Integer.parseInt(value));
					} else if (name.equals("content")) {
						banner.setContent(new String(value.getBytes("iso-8859-1"), "UTF-8"));
					}
				} else {
					if (item.getFieldName().equals("image")) {
						item.write(new File(path + "/" + item.getName()));
						banner.setImage(item.getName());
					} 
				}
			}
		} catch (FileUploadException ex) {
			Logger.getLogger(ControllerBanner.class.getName()).log(Level.SEVERE, null, ex);
		} catch (UnsupportedEncodingException ex) {
			Logger.getLogger(ControllerBanner.class.getName()).log(Level.SEVERE, null, ex);
		} catch (ParseException ex) {
			Logger.getLogger(ControllerBanner.class.getName()).log(Level.SEVERE, null, ex);
		} catch (Exception ex) {
			Logger.getLogger(ControllerBanner.class.getName()).log(Level.SEVERE, null, ex);
		}

		boolean bl;
		Account account = (Account) session.getAttribute("myLogin");
		banner.setAccount(account);
		if (banner.getBannerId() == null)
			bl = bannerService.save(banner);
		else {
			bl = bannerService.update(banner);
		}
		if (bl) {
			return "redirect:list";
		} else {
			return "manages/banner_form";
		}
	}
	
		
	@RequestMapping(value = "/delete/{bannerId}")
	public String viewDelete(@PathVariable("bannerId") int bannerId, Model model) {
		Banner banner = bannerService.findById(bannerId);
		boolean bl = bannerService.delete(banner);
		if(bl)
			return "manages/banner_list";
		else
			return "manages/banner_list";
	}
	
}
