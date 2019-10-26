package com.common.serivce;

import com.common.api.AdNoticeService;
import mapper.AdNoticeMapper;
import com.common.model.AdNotice;
import com.common.model.AdNoticeExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("adNoticeService")
public class AdNoticeServiceImpl implements AdNoticeService {
    @Autowired
    private AdNoticeMapper adNoticeMapper;

    @Override
    public List<AdNotice> qryAllNotice() {
        return adNoticeMapper.selectByExample(new AdNoticeExample());
    }
}
