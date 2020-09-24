package com.notificationconfig.backend.model;

import java.io.Serializable;
import java.util.List;

public class NotificationConfigDTOList implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<NotificationConfigDTO> notifications;
	private Long totalItems;
	
	public List<NotificationConfigDTO> getNotifications() {
		return notifications;
	}
	public void setNotifications(List<NotificationConfigDTO> notifications) {
		this.notifications = notifications;
	}
	public Long getTotalItems() {
		return totalItems;
	}
	public void setTotalItems(Long totalItems) {
		this.totalItems = totalItems;
	}
	

}
