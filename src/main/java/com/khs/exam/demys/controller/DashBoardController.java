package com.khs.exam.demys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DashBoardController {
	@RequestMapping("/usr/common/head")
	public String showJoin() {
		return "/usr/common/head";
	}

}
