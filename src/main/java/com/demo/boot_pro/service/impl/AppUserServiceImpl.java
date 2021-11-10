package com.demo.boot_pro.service.impl;

import com.demo.boot_pro.entity.AppUser;
import com.demo.boot_pro.mapper.AppUserMapper;
import com.demo.boot_pro.service.IAppUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author admin
 * @since 2021-11-10
 */
@Service
public class AppUserServiceImpl extends ServiceImpl<AppUserMapper, AppUser> implements IAppUserService {

}
