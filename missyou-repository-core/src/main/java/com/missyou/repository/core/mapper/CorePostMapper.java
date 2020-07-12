package com.missyou.repository.core.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.missyou.repository.core.domain.CorePost;
import com.missyou.repository.core.dto.CorePostDTO;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 文章表 Mapper 接口
 * </p>
 *
 * @author skboy
 * @since 2020-07-12
 */
public interface CorePostMapper extends BaseMapper<CorePost> {
    /**
     * 查询文章
     * @param page {@link IPage}
     * @param queryWrapper {@link Wrapper}
     * @return {@link IPage}
     */
    IPage<CorePostDTO> listByQuery(IPage<CorePostDTO> page, @Param(Constants.WRAPPER) Wrapper<CorePostDTO> queryWrapper);
}
