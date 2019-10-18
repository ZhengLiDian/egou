package net.zld.egou.service.impl;

import net.zld.egou.entity.EEmployee;
import net.zld.egou.mapper.EEmployeeMapper;
import net.zld.egou.service.EEmployeeService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 员工 服务实现类
 * </p>
 *
 * @author zld
 * @since 2019-10-18
 */
@Service
public class EEmployeeServiceImpl extends ServiceImpl<EEmployeeMapper, EEmployee> implements EEmployeeService {

}
