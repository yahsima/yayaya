package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ページ遷移のコントローラ.
 * @author Kengo Kuwahara
 *
 */
@Controller
@RequestMapping("/")
public class PageController {

	/**
	 * トップページを表示.
	 * @return
	 */
	@RequestMapping("/")
	public String topPage() {
		return "topPage";
	}
	
	/**
	 * 八島の自己紹介ページへ遷移.
	 * @return
	 */
	@RequestMapping("/yashima")
	public String yashima(){
		return "yashima";
	}

	/**
	 * 桑原の自己紹介ページへ遷移.
	 * @return
	 */
	@RequestMapping("/kuwahara")
	public String kuwahara(){
		return "kuwahara";
	}
	
	/**
	 * 渕本の自己紹介ページへ遷移.
	 * @return
	 */
	@RequestMapping("/fuchimoto")
	public String hutimoto(){
		return "fuchimoto";
	}
	
}
