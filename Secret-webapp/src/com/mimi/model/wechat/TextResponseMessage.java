package com.mimi.model.wechat;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name="xml")
public class TextResponseMessage extends BaseMessage{
	@Element(name="Content")
	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	@Override
	public String toString() {
		return super.toString()+"--Content"+content;
	}
}
