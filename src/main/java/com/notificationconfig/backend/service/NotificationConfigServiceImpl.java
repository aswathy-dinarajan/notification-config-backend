package com.notificationconfig.backend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.notificationconfig.backend.model.NotificationConfigDTO;
import com.notificationconfig.backend.model.NotificationConfigDTOList;
import com.notificationconfig.backend.model.NotificationConfig;
import com.notificationconfig.backend.repo.NotificationConfigRepo;



@Service("salesRefundService")
public class NotificationConfigServiceImpl implements NotificationConfigService {

	@Autowired
	NotificationConfigRepo notificationRepo;

	@Override
	public NotificationConfigDTO saveNotificationConfig(NotificationConfigDTO notificationDTO) {
		NotificationConfig notification = new NotificationConfig();
		BeanUtils.copyProperties(notificationDTO, notification);
		notificationRepo.save(notification);
		return notificationDTO;
	}

	/*public List<NotificationConfigDTO> getNotificationConfig(NotificationConfigDTO notificationConfigDTO) {
		NotificationConfig notification = new NotificationConfig();
		BeanUtils.copyProperties(notificationConfigDTO, notification);
		Page<NotificationConfig> notificationList = notificationRepo.findAll(Example.of(notification),PageRequest.of(notificationConfigDTO.getPageNumber()-1, notificationConfigDTO.getPageSize()));
		List<NotificationConfig> result = notificationList.getContent();
		List<NotificationConfigDTO> finalResult = new ArrayList<NotificationConfigDTO>();
		for(NotificationConfig obj : result){
			NotificationConfigDTO dto = new NotificationConfigDTO();
			BeanUtils.copyProperties(obj, dto);
			finalResult.add(dto);
					
		}
		return finalResult;
	}*/

	public List<NotificationConfigDTO> getNotificationConfig(NotificationConfigDTO notificationConfigDTO) {
		NotificationConfig notification = new NotificationConfig();
		BeanUtils.copyProperties(notificationConfigDTO, notification);		
		ExampleMatcher matcher = ExampleMatcher.matchingAll().withMatcher("name", ExampleMatcher.GenericPropertyMatchers.contains());		
		Page<NotificationConfig> notificationList = notificationRepo.findAll(Example.of(notification,matcher),PageRequest.of(notificationConfigDTO.getPageNumber()-1, notificationConfigDTO.getPageSize()));
		List<NotificationConfig> result = notificationList.getContent();
		List<NotificationConfigDTO> finalResult = new ArrayList<NotificationConfigDTO>();
		for(NotificationConfig obj : result){
			NotificationConfigDTO dto = new NotificationConfigDTO();
			BeanUtils.copyProperties(obj, dto);
			finalResult.add(dto);
					
		}
		return finalResult;
	}
	
	
	@Override
	public NotificationConfigDTOList getNotificationConfigList(NotificationConfigDTO notificationConfigDTO) {
		NotificationConfig notification = new NotificationConfig();
		BeanUtils.copyProperties(notificationConfigDTO, notification);
		List<NotificationConfigDTO> notificationList = getNotificationConfig(notificationConfigDTO);
		NotificationConfigDTOList result = new NotificationConfigDTOList();
		result.setNotifications(notificationList);
		result.setTotalItems(notificationRepo.count(Example.of(notification)));
		return result;
	}

}
