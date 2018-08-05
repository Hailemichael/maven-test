package com.haile.apps.maven.test;

/*import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;*/

import com.google.gson.Gson;
import com.haile.apps.maven.test.model.Meme;

public class MainTest {

	public static void main(String[] args) {
		Meme meme = new Meme();
		meme.setImageUrl("http://www.senai.com");
		meme.setMemeText("ha u doing");
		meme.setTop(true);
		Gson gson = new Gson();
		String element = gson.toJson(meme);
		System.out.println(element);
		/*ObjectMapper mapper = new ObjectMapper();
		
		JsonNode node = mapper.convertValue(meme, JsonNode.class);*/
		
	}

}
