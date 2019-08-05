package com.dragonsoft.rhino;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**  
 * Java的JavaScript执行引擎
 * @author ronin  
 * @date 2019年3月26日  
 *    
 */
public class RhinoEngin {

	public static void main(String[] args) throws ScriptException, NoSuchMethodException {
		ScriptEngineManager manager = new ScriptEngineManager();
		/**
		 * 获取js执行引擎方式1
		 */
		//ScriptEngine jsEngine = manager.getEngineByName("javascript");
		/**
		 * 获取js执行引擎方式2
		 */
		ScriptEngine jsEngine = manager.getEngineByName("js");
		
		/**
		 * 定义变量，存储到引擎上下文中:通过脚本引擎和java语言都可以获取
		 */
		jsEngine.put("msg", "Hello World!");
		String  string = "{var user = {name:'zhangsan',age:'18',schools:['北京大学','清华大学']};}";
		string += "print(user.name)";
		
		/**
		 * 执行脚本
		 */
		jsEngine.eval(string);
		
		/**
		 * 修改msg变量的值
		 */
		jsEngine.eval("msg = 'XXXXX';");
		/*
		 * 使用jsEngin获取上下文中msg的值
		 */
		System.out.println(jsEngine.get("msg"));
		
		System.out.println("=======================================");
		/**
		 * 定义函数
		 */
		jsEngine.eval("function add(a,b){var sum =a+b; return sum;}");
		//执行js函数
		Invocable jsInvocable = (Invocable)jsEngine;
		Object object = jsInvocable.invokeFunction("add", new Object[]{13,12});
		System.out.println(object);

	}
}
