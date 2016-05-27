package com.adanac.demo.validation.action;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.adanac.demo.validation.dto.UserDto;
import com.adanac.demo.validation.intf.GroupAdd;
import com.adanac.demo.validation.intf.GroupUpdate;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/toAdd")
	public ModelAndView toAdd() {
		ModelAndView mav = new ModelAndView("user/addUser");
		mav.addObject("user", new UserDto());
		return mav;
	}

	@RequestMapping("/toUpdate")
	public ModelAndView toUpdate() {
		ModelAndView mav = new ModelAndView("user/updateUser");
		mav.addObject("user", new UserDto());
		return mav;
	}

	@RequestMapping("/addUser")
	public ModelAndView addUser(@Validated(GroupAdd.class) @ModelAttribute("user") UserDto user, BindingResult result) {
		ModelAndView mav = new ModelAndView("user/addUser");

		// 如果验证存在错误
		if (result.hasErrors()) {
			// ...
		}

		mav.addObject("user", user);
		return mav;
	}

	@RequestMapping("/updateUser")
	public ModelAndView updateUser(@Validated(GroupUpdate.class) @ModelAttribute("user") UserDto user,
			BindingResult result) {
		ModelAndView mav = new ModelAndView("user/updateUser");

		// 如果验证存在错误
		if (result.hasErrors()) {
			// ...
		}

		mav.addObject("user", user);
		return mav;
	}
}
