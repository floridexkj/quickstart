package com.shijie99.dao.tpf;

import com.shijie99.dao.tpf.pojo.FlightBook;
import com.shijie99.dao.tpf.pojo.FlightBookExample;
import com.shijie99.dao.tpf.pojo.FlightBookWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FlightBookMapper {
    int countByExample(FlightBookExample example);

    int deleteByExample(FlightBookExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FlightBookWithBLOBs record);

    int insertSelective(FlightBookWithBLOBs record);

    List<FlightBookWithBLOBs> selectByExampleWithBLOBs(FlightBookExample example);

    List<FlightBook> selectByExample(FlightBookExample example);

    FlightBookWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FlightBookWithBLOBs record, @Param("example") FlightBookExample example);

    int updateByExampleWithBLOBs(@Param("record") FlightBookWithBLOBs record, @Param("example") FlightBookExample example);

    int updateByExample(@Param("record") FlightBook record, @Param("example") FlightBookExample example);

    int updateByPrimaryKeySelective(FlightBookWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(FlightBookWithBLOBs record);

    int updateByPrimaryKey(FlightBook record);
}