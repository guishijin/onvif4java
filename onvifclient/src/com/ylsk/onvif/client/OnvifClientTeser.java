package com.ylsk.onvif.client;

import javax.xml.ws.BindingProvider;

import org.onvif.ver10.device.wsdl.Device;
import org.onvif.ver10.device.wsdl.DeviceService;
import org.onvif.ver10.schema.SystemDateTime;

public class OnvifClientTeser {

	public static void main(String[] args) {

		// 认证类型 0-NONE，1-用户名密码，2-DIGIST
		int flag = 1;
		
		// 目标参数
		String S_URL = "http://localhost:8080/onvif/device_service?wsdl";
		String username = "adminonvif";
		String password = "adminonvif";
		
		// 服务端口获取
		DeviceService deviceService;
		deviceService = new DeviceService();
		Device device;
		device = deviceService.getDevicePort();
		
		// 修改绑定
		if(flag == 1)
		{
			BindingProvider bp = (BindingProvider) device;  
			bp.getRequestContext().put(BindingProvider.USERNAME_PROPERTY,username);  
			bp.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY,password);  
			bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,S_URL);  
		}
		
        // 调用方法
		SystemDateTime dt;
		dt = device.getSystemDateAndTime();
		System.out.println("设备系统时间：" + dt.toString());
		String dtstr;
		dtstr = dt.getUTCDateTime().getDate().getYear()+"-"
				+dt.getUTCDateTime().getDate().getMonth()+"-"
				+dt.getUTCDateTime().getDate().getDay()+" "
				+dt.getUTCDateTime().getTime().getHour()+":"
				+dt.getUTCDateTime().getTime().getMinute()+":"
				+dt.getUTCDateTime().getTime().getSecond();
		System.out.println(dtstr);
	}
}
