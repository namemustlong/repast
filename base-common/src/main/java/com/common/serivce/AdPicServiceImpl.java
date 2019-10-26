package com.common.serivce;

import com.common.api.AdPicService;
import mapper.AdPicMapper;
import com.common.model.AdPic;
import com.common.model.AdPicExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("adPicService")
public class AdPicServiceImpl implements AdPicService {
    @Autowired
    private AdPicMapper adPicMapper;

    @Override
    public List<AdPic> qryAllPic() {
        return adPicMapper.selectByExample(new AdPicExample());
    }
}
