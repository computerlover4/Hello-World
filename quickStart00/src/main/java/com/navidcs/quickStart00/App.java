package com.navidcs.quickStart00;

import org.json.*;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		JSONObject jsonObj = new JSONObject("{\"phonetype\":\"N95\",\"cat\":\"WP\"}");
		System.out.println(jsonObj.get("phonetype")) ;

	}
}
