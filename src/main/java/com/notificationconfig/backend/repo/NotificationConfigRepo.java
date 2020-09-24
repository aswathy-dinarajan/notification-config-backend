package com.notificationconfig.backend.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.notificationconfig.backend.model.NotificationConfig;

public interface NotificationConfigRepo extends JpaRepository<NotificationConfig,Long>  {
	
}
