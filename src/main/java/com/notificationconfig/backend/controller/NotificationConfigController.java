package com.notificationconfig.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.notificationconfig.backend.model.NotificationConfig;
import com.notificationconfig.backend.model.NotificationConfigDTO;
import com.notificationconfig.backend.model.NotificationConfigDTOList;
import com.notificationconfig.backend.service.NotificationConfigService;

@RestController
@RequestMapping(value="/notification")
public class NotificationConfigController {
	
	@Autowired
	NotificationConfigService notificationService;
	
	@RequestMapping(value="/fetchNotificationConfig",method=RequestMethod.POST)
	public NotificationConfigDTOList fetchNotificationConfig(@RequestBody NotificationConfigDTO notificationDTO){
		return notificationService.getNotificationConfigList(notificationDTO);
	}
	
	@RequestMapping(value="/saveNotificationConfig",method=RequestMethod.POST)
	public NotificationConfigDTO saveSales(@RequestBody NotificationConfigDTO notificationDTO){
		return notificationService.saveNotificationConfig(notificationDTO);
	}
	
	

}
