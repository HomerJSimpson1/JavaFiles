package com.mongodb;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import freemarker.core.ParseException;
import freemarker.template.Configuration;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateNotFoundException;

public class HelloWorldFreemarkerStyle {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws TemplateException {
		// TODO Auto-generated method stub
		Configuration configuration = new Configuration();
		configuration.setClassForTemplateLoading(HelloWorldFreemarkerStyle.class, "/");
		
		try {
			Template helloTemplate = configuration.getTemplate("hello.ftl");
			StringWriter writer = new StringWriter();
			Map<String, Object> helloMap = new HashMap<String, Object>();
			helloMap.put("name", "Freemarker");
			
			helloTemplate.process(helloMap, writer);
			System.out.println(writer);
		} catch (TemplateNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedTemplateNameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
