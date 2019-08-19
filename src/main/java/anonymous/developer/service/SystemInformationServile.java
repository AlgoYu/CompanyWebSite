package anonymous.developer.service;

import anonymous.developer.mapper.SystemInformationMapper;
import anonymous.developer.model.SystemInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 系统信息服务类
 */
@Service
public class SystemInformationServile{
    @Autowired
    private SystemInformationMapper systemInformationMapper;

    /**
     * 返回系统信息
     * @return 系统信息
     */
    private SystemInformation getSystemInformation(){
        return systemInformationMapper.selectByPrimaryKey(1);
    }

    /**
     * 修改系统信息
     * @param systemInformation
     * @return 修改是否成功
     */
    private Boolean updateSystemInformation(SystemInformation systemInformation){
        systemInformation.setSystemId(1);
        if(systemInformationMapper.updateByPrimaryKey(systemInformation)>0){
            return true;
        }else{
            return false;
        }
    }

    /**
     * 插入系统信息
     * @param systemInformation
     * @return 插入是否成功
     */
    private Boolean insertIntoSystemInformation(SystemInformation systemInformation){
        systemInformation.setSystemId(1);
        if(systemInformationMapper.insert(systemInformation)>0){
            return true;
        }else{
            return false;
        }

    }
}