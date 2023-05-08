package com.khs.exam.demys.utill;

import java.net.URLEncoder;

public class Ut {

	public static String getUriEncoded(String str) {
		try {
			return URLEncoder.encode(str, "UTF-8");
		} catch (Exception e) {
			return str;
		}
	}
}
