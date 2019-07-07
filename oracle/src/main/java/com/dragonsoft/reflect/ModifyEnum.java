/**  
 * @Title: ModifyEnum.java  
 * @Package com.dragonsoft.reflect  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年3月11日  
 * @version V1.0  
 */ 
package com.dragonsoft.reflect;

/**  
 * @ClassName: ModifyEnum  
 * @Description: TODO(修饰符枚举)  
 * @author ronin  
 * @date 2019年3月11日  
 */
public enum ModifyEnum {
	PUBLIC(1,"公有的"),
	PRIVATE(2,"私有的");
	
	private final Integer code;
	private final String desc;
	
	private ModifyEnum(Integer code,String desc){
		this.code = code;
		this.desc = desc;
	}
	
	public Integer getCode(){
		return code;
	}
	
	public String getDesc(){
		return desc;
	}
}
