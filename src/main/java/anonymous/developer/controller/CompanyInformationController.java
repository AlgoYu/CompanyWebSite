package anonymous.developer.controller;

import anonymous.developer.common.CommonResult;
import anonymous.developer.model.CompanyInformation;
import anonymous.developer.service.ICompanyInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyInformationController extends BaseController{
    @Autowired
    private ICompanyInformationService companyInformationService;

    @GetMapping("/getCompanyInformation")
    public CommonResult getCompanyInformation(){
        return CommonResult.createCommonResult(companyInformationService.getCompanyInformation());
    }

    @PostMapping("/updateCompanyInformation")
    public CommonResult updateCompanyInformation(CompanyInformation companyInformation){
        return CommonResult.createCommonResult(companyInformationService.updateCompanyInformation(companyInformation));
    }

    @PostMapping("/insertCompanyInformation")
    public CommonResult insertCompanyInformation(CompanyInformation companyInformation){
        companyInformation.setCompanyId(1);
        return CommonResult.createCommonResult(companyInformationService.insertIntoCompanyInformation(companyInformation));
    }
}
