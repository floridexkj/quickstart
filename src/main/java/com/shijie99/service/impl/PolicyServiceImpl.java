package com.shijie99.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shijie99.dao.policy.PolicyAgentInfoMapper;
import com.shijie99.service.PolicyService;

@Service("policyService")
public class PolicyServiceImpl implements PolicyService {
	@Autowired
	PolicyAgentInfoMapper policyAgentInfoMapper;
	
	@Override
	public int countPolicyAgent() {
		return policyAgentInfoMapper.countByExample(null);
	}

}
