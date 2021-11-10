package com.demo.boot_pro.mapper;

import com.demo.boot_pro.entity.AppUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author admin
 * @since 2021-11-10
 */
@Mapper
public interface AppUserMapper extends BaseMapper<AppUser> {

}
