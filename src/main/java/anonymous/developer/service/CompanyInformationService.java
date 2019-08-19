package anonymous.developer.service;

import anonymous.developer.mapper.CompanyInformationMapper;
import anonymous.developer.model.CompanyInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 公司信息服务类
 */
@Service
public class CompanyInformationService implements ICompanyInformationService{
    @Autowired
    private CompanyInformationMapper companyInformationMapper;

    /**
     * 获取公司信息
     * @return 公司信息
     */
    public CompanyInformation getCompanyInformation(){
        return companyInformationMapper.selectByPrimaryKey(1);
    }

    /**
     * 插入公司信息
     * @param companyInformation
     * @return 插入是否成功
     */
    public Boolean insertIntoCompanyInformation(CompanyInformation companyInformation){
        if(companyInformationMapper.insert(companyInformation)>0){
            return true;
        }else{
            return false;
        }
    }

    /**
     * 更新公司信息
     * @param companyInformation
     * @return
     */
    public Boolean updateCompanyInformation(CompanyInformation companyInformation){
        companyInformation.setCompanyId(1);
        if(companyInformationMapper.updateByPrimaryKey(companyInformation)>0){
            return true;
        }else{
            return false;
        }
    }
}
