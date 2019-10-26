package mapper;

import com.common.model.AdNotice;
import com.common.model.AdNoticeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdNoticeMapper {
    long countByExample(AdNoticeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AdNotice record);

    int insertSelective(AdNotice record);

    List<AdNotice> selectByExample(AdNoticeExample example);

    AdNotice selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AdNotice record, @Param("example") AdNoticeExample example);

    int updateByExample(@Param("record") AdNotice record, @Param("example") AdNoticeExample example);

    int updateByPrimaryKeySelective(AdNotice record);

    int updateByPrimaryKey(AdNotice record);
}