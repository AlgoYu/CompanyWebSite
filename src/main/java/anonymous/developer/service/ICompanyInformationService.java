package anonymous.developer.service;

import anonymous.developer.model.CompanyInformation;

public interface ICompanyInformationService {
    CompanyInformation getCompanyInformation();
    Boolean insertIntoCompanyInformation(CompanyInformation companyInformation);
    Boolean updateCompanyInformation(CompanyInformation companyInformation);
}