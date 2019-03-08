package xyz.asurily.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xyz.asurily.model.AndroidPushInfo;
import xyz.asurily.model.AndroidPushInfoExample;

public interface AndroidPushInfoMapper {
    long countByExample(AndroidPushInfoExample example);

    int deleteByExample(AndroidPushInfoExample example);

    int deleteByPrimaryKey(String uuid);

    int insert(AndroidPushInfo record);

    int insertSelective(AndroidPushInfo record);

    List<AndroidPushInfo> selectByExample(AndroidPushInfoExample example);

    AndroidPushInfo selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") AndroidPushInfo record, @Param("example") AndroidPushInfoExample example);

    int updateByExample(@Param("record") AndroidPushInfo record, @Param("example") AndroidPushInfoExample example);

    int updateByPrimaryKeySelective(AndroidPushInfo record);

    int updateByPrimaryKey(AndroidPushInfo record);
}