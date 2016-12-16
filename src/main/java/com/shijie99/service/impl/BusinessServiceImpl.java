package com.shijie99.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shijie99.dao.tpf.FlightBookMapper;
import com.shijie99.service.BusinessService;

@Service("businessService")
public class BusinessServiceImpl implements BusinessService {
	@Autowired
	FlightBookMapper flightBookMapper; 
	
	@Override
	public int countFlightBook() {
		return flightBookMapper.countByExample(null);
	}

}
