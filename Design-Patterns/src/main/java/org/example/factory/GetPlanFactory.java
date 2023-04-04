package org.example.factory;

public class GetPlanFactory {

    public Plan getPlan(String planType) {
        if(planType == null) {
            return null;
        }

        // equalsIgnoreCase: Not Sensitive

        if(planType.equalsIgnoreCase("DOMESTICPLAN")) {
            return new DomesticPlan();
        } else if(planType.equalsIgnoreCase("COMMERCIALPLAN")) {
            return new CommercialPlan();
        } else if(planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {
            return new InstitutionalPlan();
        }

        return null;
    }
}
