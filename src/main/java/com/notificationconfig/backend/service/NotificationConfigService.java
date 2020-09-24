package com.notificationconfig.backend.service;

import com.notificationconfig.backend.model.NotificationConfigDTO;
import com.notificationconfig.backend.model.NotificationConfigDTOList;

public interface NotificationConfigService {
	NotificationConfigDTO saveNotificationConfig(NotificationConfigDTO notificationConfigDTO);
	//List<NotificationConfigDTO> getNotificationConfig(NotificationConfigDTO notificationConfigDTO);
	NotificationConfigDTOList getNotificationConfigList(NotificationConfigDTO notificationConfigDTO);
}
