package io.core9.jsonld;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.github.jsonldjava.core.JsonLdError;
import com.github.jsonldjava.core.JsonLdOptions;
import com.github.jsonldjava.core.JsonLdProcessor;
import com.github.jsonldjava.utils.JsonUtils;

public class TestJsonLD {


	@Test
	public void initTest() throws IOException, JsonLdError{


		ClassLoader classLoader = getClass().getClassLoader();
		String file = classLoader.getResource("hydra/api-demo/index.json").getPath();

		System.out.println(file);

		// Open a valid json(-ld) input file
		InputStream inputStream = new FileInputStream(file);
		// Read the file into an Object (The type of this object will be a List, Map, String, Boolean,
		// Number or null depending on the root object in the file).
		Object jsonObject = JsonUtils.fromInputStream(inputStream);
		// Create a context JSON map containing prefixes and definitions
		Map<Object, Object> context = new HashMap<Object, Object>();
		// Customise context...
		// Create an instance of JsonLdOptions with the standard JSON-LD options
		JsonLdOptions options = new JsonLdOptions();
		// Customise options...
		// Call whichever JSONLD function you want! (e.g. compact)
		Object compact = JsonLdProcessor.compact(jsonObject, context, options);
		// Print out the result (or don't, it's your call!)
		System.out.println(JsonUtils.toPrettyString(compact));

	}


}
