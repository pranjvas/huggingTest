package src.main.java.com.apollo247.phr.dto.healthrecord;


import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ContentWrapper implements UIPojo {
	public List<InformativeContent> informativeContents;
	public String authToken;

	public List<InformativeContent> getInformativeContents() {
		return informativeContents;
	}

	public void setInformativeContents(List<InformativeContent> informativeContents) {
		this.informativeContents = informativeContents;
	}

	public String getAuthToken() {
		return authToken;
	}

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

}