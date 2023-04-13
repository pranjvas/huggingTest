package src.main.java.com.apollo247.phr.dto.healthrecord;

import java.util.List;
import java.util.Map;

public class AppointmentInfoResp {

	public String uhid;
	public String mobileNumber;
	public List<Map<String,String>> doctorInfo;
	
	public String getUhid() {
		return uhid;
	}
	public void setUhid(String uhid) {
		this.uhid = uhid;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public List<Map<String, String>> getDoctorInfo() {
		return doctorInfo;
	}
	public void setDoctorInfo(List<Map<String, String>> doctorInfo) {
		this.doctorInfo = doctorInfo;
	}
	
}
