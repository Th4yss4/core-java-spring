package eu.arrowhead.core.eventhandler.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eu.arrowhead.common.dto.EventFilterRequestDTO;
import eu.arrowhead.common.dto.EventFilterResponseDTO;
import eu.arrowhead.core.eventhandler.database.service.EventHandlerDBService;

@Service
public class EventHandlerService {

	//=================================================================================================
	// members
	
	private static final String NULL_PARAMETER_ERROR_MESSAGE = " is null.";
	private static final String NULL_OR_BLANK_PARAMETER_ERROR_MESSAGE = " is null or blank.";
	private static final String LESS_THAN_ONE_ERROR_MESSAGE= " must be greater than zero.";
	private static final String MORE_THAN_ONE_ERROR_MESSAGE= " must not have more than one element.";
	
	private static final Logger logger = LogManager.getLogger(EventHandlerService.class);
	
	@Autowired
	private EventHandlerDriver eventHandlerDriver;
	
	@Autowired
	private EventHandlerDBService eventHandlerDBService;
	
	//=================================================================================================
	// methods

	//-------------------------------------------------------------------------------------------------
	public EventFilterResponseDTO subscriptionRequest(EventFilterRequestDTO request) {
		logger.debug("subscriptionRequest started ...");
		
		// TODO Auto-generated method stub
		return null;
	}
}
