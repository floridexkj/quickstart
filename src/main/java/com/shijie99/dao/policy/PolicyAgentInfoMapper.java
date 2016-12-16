package com.shijie99.dao.policy;

import com.shijie99.dao.policy.pojo.PolicyAgentInfo;
import com.shijie99.dao.policy.pojo.PolicyAgentInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PolicyAgentInfoMapper {
    int countByExample(PolicyAgentInfoExample example);

    int deleteByExample(PolicyAgentInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PolicyAgentInfo record);

    int insertSelective(PolicyAgentInfo record);

    List<PolicyAgentInfo> selectByExample(PolicyAgentInfoExample example);

    PolicyAgentInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PolicyAgentInfo record, @Param("example") PolicyAgentInfoExample example);

    int updateByExample(@Param("record") PolicyAgentInfo record, @Param("example") PolicyAgentInfoExample example);

    int updateByPrimaryKeySelective(PolicyAgentInfo record);

    int updateByPrimaryKey(PolicyAgentInfo record);
}